package com.boha.coursemaker.data;

import com.boha.coursemaker.data.HelpRequest;
import com.boha.coursemaker.data.Instructor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(HelpResponse.class)
public class HelpResponse_ { 

    public static volatile SingularAttribute<HelpResponse, HelpRequest> helpRequest;
    public static volatile SingularAttribute<HelpResponse, Instructor> instructor;
    public static volatile SingularAttribute<HelpResponse, Integer> scheduleMeeting;
    public static volatile SingularAttribute<HelpResponse, Date> meetingDate;
    public static volatile SingularAttribute<HelpResponse, Integer> problemSorted;
    public static volatile SingularAttribute<HelpResponse, Date> dateResponse;
    public static volatile SingularAttribute<HelpResponse, String> message;
    public static volatile SingularAttribute<HelpResponse, Integer> helpResponseID;

}