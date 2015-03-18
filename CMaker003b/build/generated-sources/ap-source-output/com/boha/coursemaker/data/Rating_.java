package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Company;
import com.boha.coursemaker.data.CourseTrainee;
import com.boha.coursemaker.data.CourseTraineeActivity;
import com.boha.coursemaker.data.InstructorRating;
import com.boha.coursemaker.data.TraineeRating;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Rating.class)
public class Rating_ { 

    public static volatile ListAttribute<Rating, CourseTraineeActivity> courseTraineeActivityList;
    public static volatile SingularAttribute<Rating, String> ratingName;
    public static volatile ListAttribute<Rating, TraineeRating> traineeRatingList;
    public static volatile SingularAttribute<Rating, Integer> ratingID;
    public static volatile SingularAttribute<Rating, Company> company;
    public static volatile SingularAttribute<Rating, Integer> ratingNumber;
    public static volatile ListAttribute<Rating, CourseTrainee> courseTraineeList;
    public static volatile ListAttribute<Rating, InstructorRating> instructorRatingList;

}