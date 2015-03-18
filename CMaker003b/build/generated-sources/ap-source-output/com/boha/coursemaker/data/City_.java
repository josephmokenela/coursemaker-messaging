package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Company;
import com.boha.coursemaker.data.Institution;
import com.boha.coursemaker.data.Instructor;
import com.boha.coursemaker.data.Province;
import com.boha.coursemaker.data.Trainee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(City.class)
public class City_ { 

    public static volatile ListAttribute<City, Instructor> instructorList;
    public static volatile ListAttribute<City, Institution> institutionList;
    public static volatile SingularAttribute<City, String> cityName;
    public static volatile SingularAttribute<City, Province> province;
    public static volatile ListAttribute<City, Company> companyList;
    public static volatile SingularAttribute<City, Double> latitude;
    public static volatile SingularAttribute<City, Integer> cityID;
    public static volatile SingularAttribute<City, Double> longitude;
    public static volatile ListAttribute<City, Trainee> traineeList;

}