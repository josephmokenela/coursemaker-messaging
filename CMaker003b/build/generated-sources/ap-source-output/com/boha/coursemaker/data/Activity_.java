package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Course;
import com.boha.coursemaker.data.CourseTraineeActivity;
import com.boha.coursemaker.data.LessonSchedule;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Activity.class)
public class Activity_ { 

    public static volatile SingularAttribute<Activity, Integer> activityID;
    public static volatile SingularAttribute<Activity, Double> durationInDays;
    public static volatile ListAttribute<Activity, CourseTraineeActivity> courseTraineeActivityList;
    public static volatile ListAttribute<Activity, LessonSchedule> lessonScheduleList;
    public static volatile SingularAttribute<Activity, String> activityName;
    public static volatile SingularAttribute<Activity, Date> syncDate;
    public static volatile SingularAttribute<Activity, String> description;
    public static volatile SingularAttribute<Activity, Course> course;
    public static volatile SingularAttribute<Activity, Integer> priorityFlag;
    public static volatile SingularAttribute<Activity, Long> localID;

}