/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.boha.coursemaker.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author aubreyM
 */
@Entity
@Table(name = "helpRequest")
@NamedQueries({
    @NamedQuery(name = "HelpRequest.findByClassPeriod", 
        query = "select a from HelpRequest a"
                    + " where a.courseTraineeActivity.courseTrainee.trainee.trainingClass.trainingClassID = :id"
                    + " and a.dateRequested between :start and :end"
                    + " order by a.dateRequested desc"),
    @NamedQuery(name = "HelpRequest.findByInstructor", 
        query = "select a from HelpRequest a, InstructorClass b "
                    + " where a.courseTraineeActivity.courseTrainee.trainee.trainingClass = b.trainingClass "
                    + " and b.instructor.instructorID = :id "
                    + " order by a.dateRequested desc "),
    @NamedQuery(name = "HelpRequest.findByInstructorPeriod", 
        query = "select a from HelpRequest a, InstructorClass b "
                    + " where a.courseTraineeActivity.courseTrainee.trainee.trainingClass = b.trainingClass "
                    + " and b.instructor.instructorID = :id "
                    + " and a.dateRequested between :start and :end "
                    + " order by a.dateRequested desc ")
    })
public class HelpRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "helpRequestID")
    private int helpRequestID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateRequested")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRequested;
    @Lob
    @Size(max = 65535)
    @Column(name = "comment")
    private String comment;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "helpRequest")
    private List<HelpResponse> helpResponseList;
    @JoinColumn(name = "trainingClassID", referencedColumnName = "trainingClassID")
    @ManyToOne(optional = false)
    private TrainingClass trainingClass;
    @JoinColumn(name = "courseTraineeActivityID", referencedColumnName = "courseTraineeActivityID")
    @ManyToOne
    private CourseTraineeActivity courseTraineeActivity;
    @JoinColumn(name = "helpTypeID", referencedColumnName = "helpTypeID")
    @ManyToOne(optional = false)
    private HelpType helpType;

    public HelpRequest() {
    }

    public HelpRequest(int helpRequestID) {
        this.helpRequestID = helpRequestID;
    }

    public HelpRequest(int helpRequestID, Date dateRequested) {
        this.helpRequestID = helpRequestID;
        this.dateRequested = dateRequested;
    }

    public int getHelpRequestID() {
        return helpRequestID;
    }

    public void setHelpRequestID(int helpRequestID) {
        this.helpRequestID = helpRequestID;
    }

    public Date getDateRequested() {
        return dateRequested;
    }

    public void setDateRequested(Date dateRequested) {
        this.dateRequested = dateRequested;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<HelpResponse> getHelpResponseList() {
        return helpResponseList;
    }

    public void setHelpResponseList(List<HelpResponse> helpResponseList) {
        this.helpResponseList = helpResponseList;
    }

    public TrainingClass getTrainingClass() {
        return trainingClass;
    }

    public void setTrainingClass(TrainingClass trainingClass) {
        this.trainingClass = trainingClass;
    }

    public CourseTraineeActivity getCourseTraineeActivity() {
        return courseTraineeActivity;
    }

    public void setCourseTraineeActivity(CourseTraineeActivity courseTraineeActivity) {
        this.courseTraineeActivity = courseTraineeActivity;
    }

    public HelpType getHelpType() {
        return helpType;
    }

    public void setHelpType(HelpType helpType) {
        this.helpType = helpType;
    }


    @Override
    public String toString() {
        return "com.boha.coursemaker.data.HelpRequest[ helpRequestID=" + helpRequestID + " ]";
    }
    
}
