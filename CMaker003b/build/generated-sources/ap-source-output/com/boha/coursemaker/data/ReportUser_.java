package com.boha.coursemaker.data;

import com.boha.coursemaker.data.GcmDevice;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(ReportUser.class)
public class ReportUser_ { 

    public static volatile SingularAttribute<ReportUser, String> firstName;
    public static volatile SingularAttribute<ReportUser, String> lastName;
    public static volatile SingularAttribute<ReportUser, String> password;
    public static volatile SingularAttribute<ReportUser, String> gCMRegistrationID;
    public static volatile SingularAttribute<ReportUser, Integer> reportUserID;
    public static volatile SingularAttribute<ReportUser, String> cellphone;
    public static volatile ListAttribute<ReportUser, GcmDevice> gcmDeviceList;
    public static volatile SingularAttribute<ReportUser, String> email;
    public static volatile SingularAttribute<ReportUser, Date> dateRegistered;

}