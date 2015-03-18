package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Administrator;
import com.boha.coursemaker.data.City;
import com.boha.coursemaker.data.Company;
import com.boha.coursemaker.data.GcmDevice;
import com.boha.coursemaker.data.HelpResponse;
import com.boha.coursemaker.data.InstructorClass;
import com.boha.coursemaker.data.InstructorRating;
import com.boha.coursemaker.data.LessonResource;
import com.boha.coursemaker.data.TraineeSkill;
import com.boha.coursemaker.data.TraineeSkillHistory;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Instructor.class)
public class Instructor_ { 

    public static volatile SingularAttribute<Instructor, String> lastName;
    public static volatile SingularAttribute<Instructor, City> city;
    public static volatile ListAttribute<Instructor, HelpResponse> helpResponseList;
    public static volatile ListAttribute<Instructor, GcmDevice> gcmDeviceList;
    public static volatile SingularAttribute<Instructor, Date> dateRegistered;
    public static volatile SingularAttribute<Instructor, String> firstName;
    public static volatile SingularAttribute<Instructor, String> password;
    public static volatile SingularAttribute<Instructor, String> gCMRegistrationID;
    public static volatile SingularAttribute<Instructor, Administrator> administrator;
    public static volatile ListAttribute<Instructor, InstructorClass> instructorClassList;
    public static volatile SingularAttribute<Instructor, String> cellphone;
    public static volatile ListAttribute<Instructor, LessonResource> lessonResourceList;
    public static volatile SingularAttribute<Instructor, Company> company;
    public static volatile ListAttribute<Instructor, TraineeSkill> traineeSkillList;
    public static volatile ListAttribute<Instructor, TraineeSkillHistory> traineeSkillHistoryList;
    public static volatile SingularAttribute<Instructor, String> email;
    public static volatile ListAttribute<Instructor, InstructorRating> instructorRatingList;
    public static volatile SingularAttribute<Instructor, Integer> activeFlag;
    public static volatile SingularAttribute<Instructor, Integer> instructorID;

}