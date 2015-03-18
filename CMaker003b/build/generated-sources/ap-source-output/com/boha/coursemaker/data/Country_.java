package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Province;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Country.class)
public class Country_ { 

    public static volatile ListAttribute<Country, Province> provinceList;
    public static volatile SingularAttribute<Country, String> countryCode;
    public static volatile SingularAttribute<Country, Double> latitude;
    public static volatile SingularAttribute<Country, String> countryName;
    public static volatile SingularAttribute<Country, Integer> countryID;
    public static volatile SingularAttribute<Country, Double> longitude;

}