package com.boha.coursemaker.data;

import com.boha.coursemaker.data.GuardianTrainee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Guardian.class)
public class Guardian_ { 

    public static volatile SingularAttribute<Guardian, String> lastName;
    public static volatile ListAttribute<Guardian, GuardianTrainee> guardianTraineeList;
    public static volatile SingularAttribute<Guardian, String> name;
    public static volatile SingularAttribute<Guardian, Integer> guardianID;
    public static volatile SingularAttribute<Guardian, String> cellphone;
    public static volatile SingularAttribute<Guardian, String> email;
    public static volatile SingularAttribute<Guardian, Date> dateRegistered;

}