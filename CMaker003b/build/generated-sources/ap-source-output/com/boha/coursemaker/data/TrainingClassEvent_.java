package com.boha.coursemaker.data;

import com.boha.coursemaker.data.TrainingClass;
import com.boha.coursemaker.data.TrainingClassCourse;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(TrainingClassEvent.class)
public class TrainingClassEvent_ { 

    public static volatile SingularAttribute<TrainingClassEvent, Integer> trainingClassEventID;
    public static volatile SingularAttribute<TrainingClassEvent, Date> endDate;
    public static volatile SingularAttribute<TrainingClassEvent, TrainingClass> trainingClass;
    public static volatile SingularAttribute<TrainingClassEvent, TrainingClassCourse> trainingClassCourse;
    public static volatile SingularAttribute<TrainingClassEvent, String> eventName;
    public static volatile SingularAttribute<TrainingClassEvent, String> description;
    public static volatile SingularAttribute<TrainingClassEvent, String> location;
    public static volatile SingularAttribute<TrainingClassEvent, Date> dateRegistered;
    public static volatile SingularAttribute<TrainingClassEvent, Date> startDate;

}