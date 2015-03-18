package com.boha.coursemaker.data;

import com.boha.coursemaker.data.CourseTraineeActivity;
import com.boha.coursemaker.data.Rating;
import com.boha.coursemaker.data.Trainee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(TraineeRating.class)
public class TraineeRating_ { 

    public static volatile SingularAttribute<TraineeRating, CourseTraineeActivity> courseTraineeActivity;
    public static volatile SingularAttribute<TraineeRating, Rating> rating;
    public static volatile SingularAttribute<TraineeRating, Integer> traineeRatingID;
    public static volatile SingularAttribute<TraineeRating, String> comment;
    public static volatile SingularAttribute<TraineeRating, Trainee> trainee;
    public static volatile SingularAttribute<TraineeRating, Date> dateUpdated;

}