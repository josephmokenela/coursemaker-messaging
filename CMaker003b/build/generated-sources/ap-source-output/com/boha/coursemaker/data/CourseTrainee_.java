package com.boha.coursemaker.data;

import com.boha.coursemaker.data.CourseTraineeActivity;
import com.boha.coursemaker.data.Rating;
import com.boha.coursemaker.data.Trainee;
import com.boha.coursemaker.data.TrainingClassCourse;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(CourseTrainee.class)
public class CourseTrainee_ { 

    public static volatile SingularAttribute<CourseTrainee, Integer> courseTraineeID;
    public static volatile SingularAttribute<CourseTrainee, Date> ratingDate;
    public static volatile ListAttribute<CourseTrainee, CourseTraineeActivity> courseTraineeActivityList;
    public static volatile SingularAttribute<CourseTrainee, Rating> rating;
    public static volatile SingularAttribute<CourseTrainee, TrainingClassCourse> trainingClassCourse;
    public static volatile SingularAttribute<CourseTrainee, Date> dateEnrolled;
    public static volatile SingularAttribute<CourseTrainee, String> comment;
    public static volatile SingularAttribute<CourseTrainee, Trainee> trainee;

}