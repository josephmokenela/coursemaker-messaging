package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Company;
import com.boha.coursemaker.data.HelpRequest;
import com.boha.coursemaker.data.TraineeShout;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(HelpType.class)
public class HelpType_ { 

    public static volatile SingularAttribute<HelpType, Integer> helpTypeID;
    public static volatile ListAttribute<HelpType, TraineeShout> traineeShoutList;
    public static volatile ListAttribute<HelpType, HelpRequest> helpRequestList;
    public static volatile SingularAttribute<HelpType, Company> company;
    public static volatile SingularAttribute<HelpType, String> helpTypeName;

}