/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boha.coursemaker.messaging;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author CodeTribe1
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/courseMakerReport"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")
})
public class CourseMakerStatusReport implements MessageListener {
    
    @Resource(name="mail/courseMakerMail")
    private Session mailSession;
    
    public CourseMakerStatusReport() {
    }
    
    @Override
    public void onMessage(Message message) {
        
        if (message instanceof MapMessage) {
        
            try {
                MapMessage statusMessage = (MapMessage) message;
                String from = statusMessage.getStringProperty("from");
                String to = statusMessage.getStringProperty("to");
                String content = statusMessage.getStringProperty("content");
                String subject = statusMessage.getStringProperty("subject");
                javax.mail.Message mailMessage = new MimeMessage(mailSession);
                mailMessage.setFrom(new InternetAddress(from));
                InternetAddress[] addressList = {new InternetAddress(to)};
                mailMessage.setRecipients(javax.mail.Message.RecipientType.TO, addressList);
                mailMessage.setSubject(subject);
                mailMessage.setSentDate(new Date());
                mailMessage.setContent(content, "text/html");
                Logger.getLogger(CourseMakerStatusReport.class.getName()).log(Level.INFO, "Sending message...");
                Transport.send(mailMessage);
                Logger.getLogger(CourseMakerStatusReport.class.getName()).log(Level.INFO, "Message send...");
            } catch (JMSException ex) {
                Logger.getLogger(CourseMakerStatusReport.class.getName()).log(Level.SEVERE, null, ex);
            } catch (AddressException ex) {
                Logger.getLogger(CourseMakerStatusReport.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MessagingException ex) {
                Logger.getLogger(CourseMakerStatusReport.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
        
             Logger.getLogger(CourseMakerStatusReport.class.getName()).log(Level.WARNING, "Invalid Message");
        }
    }
    
}
