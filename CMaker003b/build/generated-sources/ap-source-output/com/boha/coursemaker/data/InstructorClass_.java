package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Instructor;
import com.boha.coursemaker.data.TrainingClass;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(InstructorClass.class)
public class InstructorClass_ { 

    public static volatile SingularAttribute<InstructorClass, Integer> instructorClassID;
    public static volatile SingularAttribute<InstructorClass, Instructor> instructor;
    public static volatile SingularAttribute<InstructorClass, TrainingClass> trainingClass;
    public static volatile SingularAttribute<InstructorClass, Date> dateRegistered;

}