package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Course;
import com.boha.coursemaker.data.CourseTrainee;
import com.boha.coursemaker.data.TrainingClass;
import com.boha.coursemaker.data.TrainingClassEvent;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(TrainingClassCourse.class)
public class TrainingClassCourse_ { 

    public static volatile SingularAttribute<TrainingClassCourse, Integer> trainingClassCourseID;
    public static volatile SingularAttribute<TrainingClassCourse, Date> endDate;
    public static volatile SingularAttribute<TrainingClassCourse, TrainingClass> trainingClass;
    public static volatile SingularAttribute<TrainingClassCourse, Course> course;
    public static volatile ListAttribute<TrainingClassCourse, CourseTrainee> courseTraineeList;
    public static volatile SingularAttribute<TrainingClassCourse, Integer> priorityFlag;
    public static volatile SingularAttribute<TrainingClassCourse, Date> startDate;
    public static volatile ListAttribute<TrainingClassCourse, TrainingClassEvent> trainingClassEventList;
    public static volatile SingularAttribute<TrainingClassCourse, Date> dateUpdated;

}