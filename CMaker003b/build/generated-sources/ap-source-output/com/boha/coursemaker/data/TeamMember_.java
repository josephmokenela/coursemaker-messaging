package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Team;
import com.boha.coursemaker.data.Trainee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(TeamMember.class)
public class TeamMember_ { 

    public static volatile SingularAttribute<TeamMember, Integer> teamMemberID;
    public static volatile SingularAttribute<TeamMember, Team> team;
    public static volatile SingularAttribute<TeamMember, Trainee> trainee;
    public static volatile SingularAttribute<TeamMember, Date> dateRegistered;
    public static volatile SingularAttribute<TeamMember, Integer> activeFlag;

}