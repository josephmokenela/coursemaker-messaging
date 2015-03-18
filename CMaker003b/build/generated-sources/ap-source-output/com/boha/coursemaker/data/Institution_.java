package com.boha.coursemaker.data;

import com.boha.coursemaker.data.City;
import com.boha.coursemaker.data.Trainee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Institution.class)
public class Institution_ { 

    public static volatile SingularAttribute<Institution, Integer> institutionID;
    public static volatile SingularAttribute<Institution, City> city;
    public static volatile SingularAttribute<Institution, String> institutionName;
    public static volatile ListAttribute<Institution, Trainee> traineeList;

}