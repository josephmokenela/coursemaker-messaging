package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Administrator;
import com.boha.coursemaker.data.Author;
import com.boha.coursemaker.data.Instructor;
import com.boha.coursemaker.data.ReportUser;
import com.boha.coursemaker.data.Trainee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(GcmDevice.class)
public class GcmDevice_ { 

    public static volatile SingularAttribute<GcmDevice, ReportUser> reportUser;
    public static volatile SingularAttribute<GcmDevice, String> product;
    public static volatile SingularAttribute<GcmDevice, Integer> messageCount;
    public static volatile SingularAttribute<GcmDevice, String> serialNumber;
    public static volatile SingularAttribute<GcmDevice, Author> author;
    public static volatile SingularAttribute<GcmDevice, Integer> gcmDeviceID;
    public static volatile SingularAttribute<GcmDevice, Trainee> trainee;
    public static volatile SingularAttribute<GcmDevice, Date> dateRegistered;
    public static volatile SingularAttribute<GcmDevice, String> manufacturer;
    public static volatile SingularAttribute<GcmDevice, Administrator> administrator;
    public static volatile SingularAttribute<GcmDevice, Instructor> instructor;
    public static volatile SingularAttribute<GcmDevice, String> registrationID;
    public static volatile SingularAttribute<GcmDevice, String> model;

}