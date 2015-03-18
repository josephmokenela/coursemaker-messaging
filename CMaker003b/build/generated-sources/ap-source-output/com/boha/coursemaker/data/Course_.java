package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Activity;
import com.boha.coursemaker.data.Category;
import com.boha.coursemaker.data.Company;
import com.boha.coursemaker.data.CourseAuthor;
import com.boha.coursemaker.data.LessonResource;
import com.boha.coursemaker.data.Objective;
import com.boha.coursemaker.data.TrainingClassCourse;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Course.class)
public class Course_ { 

    public static volatile SingularAttribute<Course, Integer> shareFlag;
    public static volatile SingularAttribute<Course, Date> syncDate;
    public static volatile SingularAttribute<Course, String> description;
    public static volatile SingularAttribute<Course, Long> localID;
    public static volatile ListAttribute<Course, Objective> objectiveList;
    public static volatile SingularAttribute<Course, Date> dateUpdated;
    public static volatile SingularAttribute<Course, String> courseName;
    public static volatile ListAttribute<Course, LessonResource> lessonResourceList;
    public static volatile SingularAttribute<Course, Company> company;
    public static volatile SingularAttribute<Course, Integer> priorityFlag;
    public static volatile SingularAttribute<Course, Category> category;
    public static volatile ListAttribute<Course, Activity> activityList;
    public static volatile SingularAttribute<Course, Integer> courseID;
    public static volatile SingularAttribute<Course, Integer> activeFlag;
    public static volatile ListAttribute<Course, CourseAuthor> courseAuthorList;
    public static volatile ListAttribute<Course, TrainingClassCourse> trainingClassCourseList;

}