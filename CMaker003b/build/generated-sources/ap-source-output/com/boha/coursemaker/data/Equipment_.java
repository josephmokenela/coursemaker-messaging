package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Administrator;
import com.boha.coursemaker.data.Company;
import com.boha.coursemaker.data.Inventory;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Equipment.class)
public class Equipment_ { 

    public static volatile SingularAttribute<Equipment, Administrator> administrator;
    public static volatile SingularAttribute<Equipment, String> equipmentName;
    public static volatile SingularAttribute<Equipment, Company> company;
    public static volatile ListAttribute<Equipment, Inventory> inventoryList;
    public static volatile SingularAttribute<Equipment, Integer> equipmentID;

}