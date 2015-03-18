package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Company;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(ErrorStoreAndroid.class)
public class ErrorStoreAndroid_ { 

    public static volatile SingularAttribute<ErrorStoreAndroid, String> phoneModel;
    public static volatile SingularAttribute<ErrorStoreAndroid, String> logCat;
    public static volatile SingularAttribute<ErrorStoreAndroid, String> androidVersion;
    public static volatile SingularAttribute<ErrorStoreAndroid, Date> errorDate;
    public static volatile SingularAttribute<ErrorStoreAndroid, Company> company;
    public static volatile SingularAttribute<ErrorStoreAndroid, String> packageName;
    public static volatile SingularAttribute<ErrorStoreAndroid, String> stackTrace;
    public static volatile SingularAttribute<ErrorStoreAndroid, String> appVersionName;
    public static volatile SingularAttribute<ErrorStoreAndroid, String> appVersionCode;
    public static volatile SingularAttribute<ErrorStoreAndroid, String> brand;
    public static volatile SingularAttribute<ErrorStoreAndroid, Integer> errorStoreAndroidID;

}