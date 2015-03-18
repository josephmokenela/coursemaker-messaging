package com.boha.coursemaker.data;

import com.boha.coursemaker.data.HelpType;
import com.boha.coursemaker.data.Trainee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(TraineeShout.class)
public class TraineeShout_ { 

    public static volatile SingularAttribute<TraineeShout, Integer> traineeShoutID;
    public static volatile SingularAttribute<TraineeShout, HelpType> helpType;
    public static volatile SingularAttribute<TraineeShout, Trainee> trainee;
    public static volatile SingularAttribute<TraineeShout, Date> dateRegistered;
    public static volatile SingularAttribute<TraineeShout, String> remarks;

}