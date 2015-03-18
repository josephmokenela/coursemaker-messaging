package com.boha.coursemaker.data;

import com.boha.coursemaker.data.City;
import com.boha.coursemaker.data.Country;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Province.class)
public class Province_ { 

    public static volatile SingularAttribute<Province, Country> country;
    public static volatile SingularAttribute<Province, String> provinceName;
    public static volatile ListAttribute<Province, City> cityList;
    public static volatile SingularAttribute<Province, Integer> provinceID;

}