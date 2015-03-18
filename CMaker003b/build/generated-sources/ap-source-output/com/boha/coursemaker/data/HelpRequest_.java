package com.boha.coursemaker.data;

import com.boha.coursemaker.data.CourseTraineeActivity;
import com.boha.coursemaker.data.HelpResponse;
import com.boha.coursemaker.data.HelpType;
import com.boha.coursemaker.data.TrainingClass;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(HelpRequest.class)
public class HelpRequest_ { 

    public static volatile SingularAttribute<HelpRequest, CourseTraineeActivity> courseTraineeActivity;
    public static volatile SingularAttribute<HelpRequest, Integer> helpRequestID;
    public static volatile SingularAttribute<HelpRequest, TrainingClass> trainingClass;
    public static volatile SingularAttribute<HelpRequest, HelpType> helpType;
    public static volatile SingularAttribute<HelpRequest, Date> dateRequested;
    public static volatile ListAttribute<HelpRequest, HelpResponse> helpResponseList;
    public static volatile SingularAttribute<HelpRequest, String> comment;

}