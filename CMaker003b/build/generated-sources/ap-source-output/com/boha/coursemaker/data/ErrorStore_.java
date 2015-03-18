package com.boha.coursemaker.data;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(ErrorStore.class)
public class ErrorStore_ { 

    public static volatile SingularAttribute<ErrorStore, Date> dateOccured;
    public static volatile SingularAttribute<ErrorStore, String> origin;
    public static volatile SingularAttribute<ErrorStore, Integer> errorStoreID;
    public static volatile SingularAttribute<ErrorStore, String> message;
    public static volatile SingularAttribute<ErrorStore, Integer> statusCode;

}