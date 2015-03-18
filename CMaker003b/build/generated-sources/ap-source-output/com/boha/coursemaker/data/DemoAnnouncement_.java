package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Team;
import com.boha.coursemaker.data.Trainee;
import com.boha.coursemaker.data.TrainingClass;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(DemoAnnouncement.class)
public class DemoAnnouncement_ { 

    public static volatile SingularAttribute<DemoAnnouncement, Integer> demoAnnouncementID;
    public static volatile SingularAttribute<DemoAnnouncement, Date> demoDate;
    public static volatile SingularAttribute<DemoAnnouncement, TrainingClass> trainingClass;
    public static volatile SingularAttribute<DemoAnnouncement, Date> dateRequested;
    public static volatile SingularAttribute<DemoAnnouncement, String> description;
    public static volatile SingularAttribute<DemoAnnouncement, Team> team;
    public static volatile SingularAttribute<DemoAnnouncement, Trainee> trainee;
    public static volatile SingularAttribute<DemoAnnouncement, Date> cancellationDate;

}