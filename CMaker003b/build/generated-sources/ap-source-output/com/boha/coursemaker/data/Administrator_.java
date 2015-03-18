package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Company;
import com.boha.coursemaker.data.Equipment;
import com.boha.coursemaker.data.GcmDevice;
import com.boha.coursemaker.data.Instructor;
import com.boha.coursemaker.data.Inventory;
import com.boha.coursemaker.data.Trainee;
import com.boha.coursemaker.data.TraineeEquipment;
import com.boha.coursemaker.data.TrainingClass;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Administrator.class)
public class Administrator_ { 

    public static volatile SingularAttribute<Administrator, String> lastName;
    public static volatile ListAttribute<Administrator, TrainingClass> trainingClassList;
    public static volatile ListAttribute<Administrator, TraineeEquipment> traineeEquipmentList;
    public static volatile ListAttribute<Administrator, Inventory> inventoryList;
    public static volatile SingularAttribute<Administrator, Integer> superUserFlag;
    public static volatile ListAttribute<Administrator, GcmDevice> gcmDeviceList;
    public static volatile SingularAttribute<Administrator, Date> dateRegistered;
    public static volatile ListAttribute<Administrator, Equipment> equipmentList;
    public static volatile SingularAttribute<Administrator, String> firstName;
    public static volatile SingularAttribute<Administrator, Integer> administratorID;
    public static volatile SingularAttribute<Administrator, String> password;
    public static volatile SingularAttribute<Administrator, String> gCMRegistrationID;
    public static volatile ListAttribute<Administrator, Instructor> instructorList;
    public static volatile SingularAttribute<Administrator, String> cellphone;
    public static volatile SingularAttribute<Administrator, Company> company;
    public static volatile SingularAttribute<Administrator, String> email;
    public static volatile SingularAttribute<Administrator, Integer> activeFlag;
    public static volatile ListAttribute<Administrator, Trainee> traineeList;

}