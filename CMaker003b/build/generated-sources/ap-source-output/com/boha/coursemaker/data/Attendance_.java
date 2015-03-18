package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Trainee;
import com.boha.coursemaker.data.TrainingClass;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Attendance.class)
public class Attendance_ { 

    public static volatile SingularAttribute<Attendance, Date> checkOutDate;
    public static volatile SingularAttribute<Attendance, Double> checkOutLongitude;
    public static volatile SingularAttribute<Attendance, Double> checkOutLatitude;
    public static volatile SingularAttribute<Attendance, TrainingClass> trainingClass;
    public static volatile SingularAttribute<Attendance, Double> checkInLatitude;
    public static volatile SingularAttribute<Attendance, Trainee> trainee;
    public static volatile SingularAttribute<Attendance, Date> checkInDate;
    public static volatile SingularAttribute<Attendance, Double> checkInLongitude;
    public static volatile SingularAttribute<Attendance, Integer> attendanceID;

}