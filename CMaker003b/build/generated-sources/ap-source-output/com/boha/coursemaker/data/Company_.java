package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Administrator;
import com.boha.coursemaker.data.Author;
import com.boha.coursemaker.data.Category;
import com.boha.coursemaker.data.City;
import com.boha.coursemaker.data.Course;
import com.boha.coursemaker.data.Equipment;
import com.boha.coursemaker.data.ErrorStoreAndroid;
import com.boha.coursemaker.data.HelpType;
import com.boha.coursemaker.data.Instructor;
import com.boha.coursemaker.data.Rating;
import com.boha.coursemaker.data.Skill;
import com.boha.coursemaker.data.SkillLevel;
import com.boha.coursemaker.data.Trainee;
import com.boha.coursemaker.data.TrainingClass;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Company.class)
public class Company_ { 

    public static volatile ListAttribute<Company, HelpType> helpTypeList;
    public static volatile ListAttribute<Company, TrainingClass> trainingClassList;
    public static volatile ListAttribute<Company, Skill> skillList;
    public static volatile SingularAttribute<Company, City> city;
    public static volatile ListAttribute<Company, Rating> ratingList;
    public static volatile SingularAttribute<Company, String> companyName;
    public static volatile ListAttribute<Company, Course> courseList;
    public static volatile SingularAttribute<Company, Date> dateRegistered;
    public static volatile ListAttribute<Company, Equipment> equipmentList;
    public static volatile ListAttribute<Company, Administrator> administratorList;
    public static volatile SingularAttribute<Company, Integer> companyID;
    public static volatile ListAttribute<Company, Instructor> instructorList;
    public static volatile ListAttribute<Company, ErrorStoreAndroid> errorStoreAndroidList;
    public static volatile ListAttribute<Company, Author> authorList;
    public static volatile ListAttribute<Company, Category> categoryList;
    public static volatile ListAttribute<Company, SkillLevel> skillLevelList;
    public static volatile SingularAttribute<Company, String> email;
    public static volatile ListAttribute<Company, Trainee> traineeList;

}