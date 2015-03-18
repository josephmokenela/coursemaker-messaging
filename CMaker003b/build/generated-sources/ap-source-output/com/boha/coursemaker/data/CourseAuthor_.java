package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Author;
import com.boha.coursemaker.data.Course;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(CourseAuthor.class)
public class CourseAuthor_ { 

    public static volatile SingularAttribute<CourseAuthor, Author> author;
    public static volatile SingularAttribute<CourseAuthor, Course> course;
    public static volatile SingularAttribute<CourseAuthor, Integer> courseAuthorID;
    public static volatile SingularAttribute<CourseAuthor, Date> dateUpdated;

}