package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Course;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Objective.class)
public class Objective_ { 

    public static volatile SingularAttribute<Objective, Integer> objectiveID;
    public static volatile SingularAttribute<Objective, String> description;
    public static volatile SingularAttribute<Objective, Course> course;
    public static volatile SingularAttribute<Objective, String> objectiveName;

}