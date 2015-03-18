package com.boha.coursemaker.data;

import com.boha.coursemaker.data.DemoAnnouncement;
import com.boha.coursemaker.data.TeamMember;
import com.boha.coursemaker.data.TrainingClass;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Team.class)
public class Team_ { 

    public static volatile SingularAttribute<Team, String> teamName;
    public static volatile SingularAttribute<Team, TrainingClass> trainingClass;
    public static volatile SingularAttribute<Team, Integer> teamID;
    public static volatile ListAttribute<Team, DemoAnnouncement> demoAnnouncementList;
    public static volatile ListAttribute<Team, TeamMember> teamMemberList;
    public static volatile SingularAttribute<Team, Date> dateRegistered;

}