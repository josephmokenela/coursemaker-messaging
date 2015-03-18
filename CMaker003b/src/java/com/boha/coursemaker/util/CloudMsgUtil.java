/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boha.coursemaker.util;

import com.boha.coursemaker.data.GcmDevice;
import com.boha.coursemaker.data.HelpRequest;
import com.boha.coursemaker.data.HelpResponse;
import com.boha.coursemaker.data.Instructor;
import com.boha.coursemaker.data.Trainee;
import com.boha.coursemaker.data.TraineeShout;
import com.boha.coursemaker.data.TrainingClass;
import com.boha.coursemaker.dto.HelpRequestDTO;
import com.boha.coursemaker.dto.HelpResponseDTO;
import com.boha.coursemaker.dto.TraineeShoutDTO;
import com.boha.coursemaker.dto.platform.ResponseDTO;
import com.google.android.gcm.server.Constants;
import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.MulticastResult;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author aubreyM
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class CloudMsgUtil {

    @PersistenceContext
    EntityManager em;
    private static final int RETRIES = 5;
    public static final String API_KEY = "AIzaSyCJIUMPXsL-GVAfNAl1i-fDy6qf7g5TtCU";

    public  ResponseDTO sendNewCourseMessageToInstructors(int companyID, PlatformUtil platformUtil) throws
            Exception, DataException {
        ResponseDTO resp = new ResponseDTO();
        //send message to Google servers
        Sender sender = new Sender(API_KEY);
        Message message = new Message.Builder()
                .addData("message", "refresh class activities")
                .addData("dateStamp", "" + new Date().getTime()).build();

        Query q = em.createNamedQuery("GcmDevice.findInstructorDevices", GcmDevice.class);
        q.setParameter("id", companyID);
        List<GcmDevice> gList = q.getResultList();
        List<String> registrationIDs = new ArrayList<>();
        for (GcmDevice m : gList) {
            registrationIDs.add(m.getRegistrationID());
        }
        if (registrationIDs.isEmpty()) {
            LOG.log(Level.SEVERE, "#### No instructor registrationIDs found ");
            resp.setMessage("No instructor found or their devices are not registered");
            resp.setStatusCode(RETRIES);
            platformUtil.addErrorStore(889, "#### No intructor devices found ", "Cloud Message Services");
            return resp;
        }
        boolean OK;
        String rMsg;
        if (registrationIDs.size() == 1) {
            Result result = sender.send(message, registrationIDs.get(0), RETRIES);
            OK = handleResult(result, platformUtil);
        } else {
            MulticastResult multiCastResult = sender.send(
                    message, registrationIDs, RETRIES);
            OK = handleMultiCastResult(multiCastResult, platformUtil);
        }
        if (OK) {
            rMsg = "Google GCM - message has been sent to Google servers";
        } else {
            rMsg = "Google GCM - message has not been sent. Error occured";
            resp.setStatusCode(ResponseDTO.ERROR_SERVER);
            resp.setMessage(rMsg);
            platformUtil.addErrorStore(889, "Google GCM - message has not been sent. Error occured", "Cloud Message Services");
        }
        resp.setMessage(rMsg);
        return resp;
    }
    public  ResponseDTO sendInstructorToTraineeMessage(HelpResponseDTO req, PlatformUtil platformUtil, DataUtil dataUtil) throws
            Exception, DataException {

        ResponseDTO resp = new ResponseDTO();
        //write record to table

        HelpRequest hr = dataUtil.getHelpRequestByID(req.getHelpRequest().getHelpRequestID());
        HelpResponse h = new HelpResponse();
        h.setDateResponse(new Date());
        h.setHelpRequest(dataUtil.getHelpRequestByID(req.getHelpRequest().getHelpRequestID()));
        h.setMessage(req.getMessage());
        h.setProblemSorted(req.getProblemSorted());
        h.setScheduleMeeting(req.getScheduleMeeting());
        h.setInstructor(dataUtil.getInstructorByID(req.getInstructorID()));

        try {
            em.persist(h);
            LOG.log(Level.INFO, "HelpResponse added to db");
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "HelpResponse add failed", e);
            throw new DataException("HelpResponse add failed\n" + dataUtil.getErrorString(e));
        }

        resp.setHelpResponse(new HelpResponseDTO(h));
        LOG.log(Level.INFO, "Instructor to trainee msg added");
        //send message to Google servers
        Sender sender = new Sender(API_KEY);
        Gson g = new Gson();
        String txJSON = g.toJson(resp.getHelpResponse());
        Message message = new Message.Builder()
                .addData("message", txJSON)
                .addData("dateStamp", "" + new Date().getTime()).build();

        List<String> registrationIDs = new ArrayList<>();
        Trainee tr = hr.getCourseTraineeActivity().getCourseTrainee().getTrainee();
        for (GcmDevice m : tr.getGcmDeviceList()) {
            registrationIDs.add(m.getRegistrationID());
        }
        if (registrationIDs.isEmpty()) {
            LOG.log(Level.SEVERE, "#### No trainee registrationIDs found for instructor to send message to trainee");
            resp.setMessage("No trainee found or their devices are not registered");
            resp.setStatusCode(RETRIES);
            platformUtil.addErrorStore(889, "#### No trainee devices found for instructor to send message to.", "Cloud Message Services");
            return resp;
        }
        boolean OK;
        String rMsg;
        if (registrationIDs.size() == 1) {
            Result result = sender.send(message, registrationIDs.get(0), RETRIES);
            OK = handleResult(result, platformUtil);
        } else {
            MulticastResult multiCastResult = sender.send(
                    message, registrationIDs, RETRIES);
            OK = handleMultiCastResult(multiCastResult, platformUtil);
        }
        if (OK) {
            rMsg = "Google GCM - message has been sent to Google servers";
        } else {
            rMsg = "Google GCM - message has not been sent. Error occured";
            resp.setStatusCode(ResponseDTO.ERROR_SERVER);
            resp.setMessage(rMsg);
            platformUtil.addErrorStore(889, "Google GCM - message has not been sent. Error occured", "Cloud Message Services");
        }
        resp.setMessage(rMsg);
        return resp;

    }

    private  List<GcmDevice> getDevices(int companyID) {
        Query q = em.createNamedQuery("GcmDevice.findInstructorDevices");
        q.setParameter("id", companyID);
        return q.getResultList();
    }

    public  ResponseDTO sendTraineeToInstructorMessage(
            HelpRequestDTO req, TraineeShoutDTO traineeShout,
            int trainingClassID, PlatformUtil platformUtil, InstructorUtil instructorUtil
    , DataUtil dataUtil) throws
            Exception, DataException {

         LOG.log(Level.OFF, "helptype id: {0}", req.getHelpType().getHelpTypeID());
                 
        ResponseDTO resp = new ResponseDTO();
        Gson g = new Gson();
        String txJSON = null;
        if (req != null) {
            HelpRequest h = new HelpRequest();
            h.setComment(req.getComment());
            if (req.getCourseTraineeActivity() != null) {
                h.setCourseTraineeActivity(dataUtil.getCourseTraineeActivityByID(
                        req.getCourseTraineeActivity().getCourseTraineeActivityID()));
            }
            h.setDateRequested(new Date());
            h.setHelpType(dataUtil.getHelpTypeByID(req.getHelpType().getHelpTypeID()));
            h.setTrainingClass(dataUtil.getTrainingClassByID(trainingClassID));
            try {
                em.persist(h);
                LOG.log(Level.INFO, "HelpRequest added to db, type: {0}", h.getHelpType().getHelpTypeName());
            } catch (Exception e) {
                LOG.log(Level.SEVERE, "HelpRequest add failed", e);
                throw new DataException("HelpRequest add failed\n" + dataUtil.getErrorString(e));
            }
            txJSON = g.toJson(new HelpRequestDTO(h));
            resp.setHelpRequest(new HelpRequestDTO(h));
        }
        if (traineeShout != null) {
            TraineeShout ts = new TraineeShout();
            ts.setRemarks(traineeShout.getRemarks());
            ts.setDateRegistered(new Date());
            ts.setHelpType(dataUtil.getHelpTypeByID(req.getHelpType().getHelpTypeID()));
            ts.setTrainee(dataUtil.getTraineeByID(traineeShout.getTraineeID()));
            try {
                em.persist(ts);
                LOG.log(Level.INFO, "TraineeShout added to db, type: {0}", ts.getHelpType().getHelpTypeName());
            } catch (Exception e) {
                LOG.log(Level.SEVERE, "TraineeShout add failed", e);
                throw new DataException("TraineeShout add failed\n" + dataUtil.getErrorString(e));
            }
            txJSON = g.toJson(new TraineeShoutDTO(ts));
            resp.setTraineeShout(new TraineeShoutDTO(ts));
        }
        //send message to Google servers        
        //get list of class instructors
        TrainingClass tc = dataUtil.getTrainingClassByID(trainingClassID);
        List<Instructor> iList = instructorUtil.getInstructorsByClass(tc.getTrainingClassID());
        List<String> registrationIDs = new ArrayList<>();
        List<GcmDevice> gcmList = getDevices(tc.getCompany().getCompanyID());
        for (Instructor ins : iList) {
            for (GcmDevice m : gcmList) {
                if (ins.getInstructorID() == m.getInstructor().getInstructorID()) {
                    registrationIDs.add(m.getRegistrationID());
                }
            }
        }
        LOG.log(Level.OFF, "Instructor devices found: {0} # of instructors: {1}", new Object[]{registrationIDs.size(), iList.size()});
        if (registrationIDs.isEmpty()) {
            LOG.log(Level.SEVERE, "#### No instructor registrationIDs found GCM send");
            resp.setStatusCode(RETRIES);
            resp.setMessage("Instructors not found for Cloud Messaging");
            platformUtil.addErrorStore(888, resp.getMessage(), "Cloud Message Services");
            return resp;
        }

        sendMessage(txJSON, registrationIDs, platformUtil);

        return resp;

    }
    public static final int GCM_MESSAGE_ERROR = 3, ALL_OK = 0;

    private  int sendMessage(String json, List<String> registrationIDs, PlatformUtil platformUtil) throws IOException, Exception {
        Sender sender = new Sender(API_KEY);
        Message message = new Message.Builder()
                .addData("message", json)
                .addData("dateStamp", "" + new Date().getTime()).build();

        boolean OK;
        if (registrationIDs.size() == 1) {
            Result result = sender.send(message, registrationIDs.get(0), RETRIES);
            OK = handleResult(result, platformUtil);
        } else {
            MulticastResult multiCastResult = sender.send(
                    message, registrationIDs, RETRIES);
            OK = handleMultiCastResult(multiCastResult, platformUtil);
        }
        if (!OK) {
            platformUtil.addErrorStore(889, "Google GCM - message has not been sent. Error occured", "Cloud Message Services");
            return GCM_MESSAGE_ERROR;
        }
        return ALL_OK;
    }

    private  boolean handleResult(Result result, PlatformUtil platformUtil)
            throws Exception {

        LOG.log(Level.INFO, "Handle result from Google GCM servers: {0}", result.toString());
        if (result.getErrorCodeName() != null) {
            if (result.getErrorCodeName().equals(
                    Constants.ERROR_NOT_REGISTERED)) {
                // TODO remove the registration from the database
                LOG.log(Level.SEVERE, "#### GCM device not registered");
                platformUtil.addErrorStore(889, "#### GCM device not registered", "Cloud Message Services");
                return false;
            }
            if (result.getErrorCodeName().equals(
                    Constants.ERROR_UNAVAILABLE)) {
                LOG.log(Level.SEVERE, "#### GCM servers not available");
                platformUtil.addErrorStore(889, "#### GCM servers not available", "Cloud Message Services");
                return false;
            }
            LOG.log(Level.SEVERE, "#### GCM message send error : {0}",
                    result.getErrorCodeName());
            platformUtil.addErrorStore(889, "#### GCM message send error\nErrorCodeName: " + result.getErrorCodeName(), "Cloud Message Services");
            return false;
        }

        if (result.getMessageId() != null) {
            LOG.log(Level.INFO, "Result messageID from GCM: {0}", result.getMessageId());
            if (result.getCanonicalRegistrationId() != null) {
                LOG.log(Level.INFO,
                        "### Google GCM - canonical registration id found, updating db ...");
                //TODO update device registration id
                //EntityManager em = EMUtil.getEntityManager();

            }
        }
        return true;
    }

    private  boolean handleMultiCastResult(MulticastResult multiCastResult, PlatformUtil platformUtil)
            throws Exception {
        LOG.log(Level.INFO, "Handle result from Google GCM servers: {0}", multiCastResult.toString());
        if (multiCastResult.getFailure() == 0
                && multiCastResult.getCanonicalIds() == 0) {
            LOG.log(Level.INFO, "### Google Cloud message send is OK, messages: {0}", multiCastResult.getTotal());
            return true;
        }
        LOG.log(Level.INFO,
                "### Google GCM - iterating through multicast Result for errors...");
        for (Result result : multiCastResult.getResults()) {
            if (result.getErrorCodeName() != null) {
                if (result.getErrorCodeName().equals(
                        Constants.ERROR_NOT_REGISTERED)) {
                    // TODO remove the registration from the database
                    LOG.log(Level.SEVERE, "#### GCM device not registered");
                    platformUtil.addErrorStore(889, "#### GCM device not registered", "Cloud Message Services");
                    return false;
                }
                if (result.getErrorCodeName().equals(
                        Constants.ERROR_UNAVAILABLE)) {
                    // TODO resubmit this message after back-off
                    LOG.log(Level.SEVERE, "#### GCM servers not available");
                    platformUtil.addErrorStore(889, "#### GCM servers not available", "Cloud Message Services");
                    return false;
                }
                LOG.log(Level.SEVERE, "#### GCM message send error : {0}",
                        result.getErrorCodeName());
                platformUtil.addErrorStore(889, "#### GCM message send error\nErrorCodeName: " + result.getErrorCodeName(), "Cloud Message Services");
                return false;
            }

            if (result.getMessageId() != null) {
                LOG.log(Level.INFO, "Result messageID from GCM: {0}", result.getMessageId());
                if (result.getCanonicalRegistrationId() != null) {
                    LOG.log(Level.INFO,
                            "### Google GCM - canonical registration id found, updating db ...");
                    //update device registration id - query by gcmdevice by reg id ???????????

                }
            }
        }
        return true;
    }
    static final Logger LOG = Logger.getLogger("CloudMsgUtil");
}
