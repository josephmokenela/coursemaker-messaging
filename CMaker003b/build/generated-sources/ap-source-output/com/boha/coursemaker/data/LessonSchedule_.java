package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Activity;
import com.boha.coursemaker.data.TrainingClass;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(LessonSchedule.class)
public class LessonSchedule_ { 

    public static volatile SingularAttribute<LessonSchedule, Activity> activity;
    public static volatile SingularAttribute<LessonSchedule, Date> endDate;
    public static volatile SingularAttribute<LessonSchedule, TrainingClass> trainingClass;
    public static volatile SingularAttribute<LessonSchedule, Date> scheduleDate;
    public static volatile SingularAttribute<LessonSchedule, Integer> lessonScheduleID;

}