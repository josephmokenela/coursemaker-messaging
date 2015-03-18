package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Administrator;
import com.boha.coursemaker.data.Inventory;
import com.boha.coursemaker.data.Trainee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(TraineeEquipment.class)
public class TraineeEquipment_ { 

    public static volatile SingularAttribute<TraineeEquipment, Administrator> administrator;
    public static volatile SingularAttribute<TraineeEquipment, Integer> traineeEquipmentID;
    public static volatile SingularAttribute<TraineeEquipment, Trainee> trainee;
    public static volatile SingularAttribute<TraineeEquipment, Date> dateReturned;
    public static volatile SingularAttribute<TraineeEquipment, Inventory> inventory;
    public static volatile SingularAttribute<TraineeEquipment, Date> dateRegistered;
    public static volatile SingularAttribute<TraineeEquipment, Integer> conditionFlag;

}