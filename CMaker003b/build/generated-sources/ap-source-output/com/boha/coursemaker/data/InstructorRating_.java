package com.boha.coursemaker.data;

import com.boha.coursemaker.data.CourseTraineeActivity;
import com.boha.coursemaker.data.Instructor;
import com.boha.coursemaker.data.Rating;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(InstructorRating.class)
public class InstructorRating_ { 

    public static volatile SingularAttribute<InstructorRating, CourseTraineeActivity> courseTraineeActivity;
    public static volatile SingularAttribute<InstructorRating, Instructor> instructor;
    public static volatile SingularAttribute<InstructorRating, Rating> rating;
    public static volatile SingularAttribute<InstructorRating, String> comment;
    public static volatile SingularAttribute<InstructorRating, Integer> instructorRatingID;
    public static volatile SingularAttribute<InstructorRating, Date> dateUpdated;
    public static volatile SingularAttribute<InstructorRating, Integer> completedFlag;

}