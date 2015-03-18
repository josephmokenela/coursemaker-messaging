package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Trainee;
import com.boha.coursemaker.data.TraineeStatusType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(TraineeStatus.class)
public class TraineeStatus_ { 

    public static volatile SingularAttribute<TraineeStatus, Integer> traineeStatusID;
    public static volatile SingularAttribute<TraineeStatus, TraineeStatusType> traineeStatusType;
    public static volatile SingularAttribute<TraineeStatus, Trainee> trainee;
    public static volatile SingularAttribute<TraineeStatus, String> remarks;
    public static volatile SingularAttribute<TraineeStatus, Date> dateUpdated;

}