package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Author;
import com.boha.coursemaker.data.Course;
import com.boha.coursemaker.data.Instructor;
import com.boha.coursemaker.data.Trainee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(LessonResource.class)
public class LessonResource_ { 

    public static volatile SingularAttribute<LessonResource, Integer> lessonResourceID;
    public static volatile SingularAttribute<LessonResource, Instructor> instructor;
    public static volatile SingularAttribute<LessonResource, Author> author;
    public static volatile SingularAttribute<LessonResource, Date> syncDate;
    public static volatile SingularAttribute<LessonResource, Course> course;
    public static volatile SingularAttribute<LessonResource, String> resourceName;
    public static volatile SingularAttribute<LessonResource, Trainee> trainee;
    public static volatile SingularAttribute<LessonResource, Long> localID;
    public static volatile SingularAttribute<LessonResource, String> url;
    public static volatile SingularAttribute<LessonResource, Date> dateUpdated;

}