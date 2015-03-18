package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Activity;
import com.boha.coursemaker.data.CourseTrainee;
import com.boha.coursemaker.data.HelpRequest;
import com.boha.coursemaker.data.InstructorRating;
import com.boha.coursemaker.data.Rating;
import com.boha.coursemaker.data.TraineeRating;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(CourseTraineeActivity.class)
public class CourseTraineeActivity_ { 

    public static volatile SingularAttribute<CourseTraineeActivity, Integer> courseTraineeActivityID;
    public static volatile SingularAttribute<CourseTraineeActivity, Activity> activity;
    public static volatile SingularAttribute<CourseTraineeActivity, Integer> refreshRequested;
    public static volatile SingularAttribute<CourseTraineeActivity, Rating> rating;
    public static volatile SingularAttribute<CourseTraineeActivity, Integer> completedFlag;
    public static volatile SingularAttribute<CourseTraineeActivity, Date> dateUpdated;
    public static volatile SingularAttribute<CourseTraineeActivity, CourseTrainee> courseTrainee;
    public static volatile SingularAttribute<CourseTraineeActivity, Integer> completionPercentage;
    public static volatile ListAttribute<CourseTraineeActivity, TraineeRating> traineeRatingList;
    public static volatile ListAttribute<CourseTraineeActivity, HelpRequest> helpRequestList;
    public static volatile SingularAttribute<CourseTraineeActivity, String> comment;
    public static volatile SingularAttribute<CourseTraineeActivity, Date> completionDate;
    public static volatile ListAttribute<CourseTraineeActivity, InstructorRating> instructorRatingList;

}