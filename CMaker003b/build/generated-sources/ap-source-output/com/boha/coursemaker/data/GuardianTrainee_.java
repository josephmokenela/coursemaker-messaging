package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Guardian;
import com.boha.coursemaker.data.Trainee;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(GuardianTrainee.class)
public class GuardianTrainee_ { 

    public static volatile SingularAttribute<GuardianTrainee, Trainee> trainee;
    public static volatile SingularAttribute<GuardianTrainee, Guardian> guardian;
    public static volatile SingularAttribute<GuardianTrainee, Integer> guardianTraineeID;
    public static volatile SingularAttribute<GuardianTrainee, Integer> activeFlag;

}