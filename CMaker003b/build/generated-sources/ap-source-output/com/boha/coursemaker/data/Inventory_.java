package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Administrator;
import com.boha.coursemaker.data.Equipment;
import com.boha.coursemaker.data.TraineeEquipment;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Inventory.class)
public class Inventory_ { 

    public static volatile SingularAttribute<Inventory, Administrator> administrator;
    public static volatile SingularAttribute<Inventory, String> serialNumber;
    public static volatile ListAttribute<Inventory, TraineeEquipment> traineeEquipmentList;
    public static volatile SingularAttribute<Inventory, Integer> inventoryID;
    public static volatile SingularAttribute<Inventory, Equipment> equipment;
    public static volatile SingularAttribute<Inventory, String> model;
    public static volatile SingularAttribute<Inventory, Integer> yearPurchased;
    public static volatile SingularAttribute<Inventory, Date> dateRegistered;
    public static volatile SingularAttribute<Inventory, Integer> conditionFlag;
    public static volatile SingularAttribute<Inventory, Date> dateUpdated;

}