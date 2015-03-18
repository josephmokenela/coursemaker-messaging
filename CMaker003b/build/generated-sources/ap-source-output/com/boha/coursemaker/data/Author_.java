package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Company;
import com.boha.coursemaker.data.CourseAuthor;
import com.boha.coursemaker.data.GcmDevice;
import com.boha.coursemaker.data.LessonResource;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Author.class)
public class Author_ { 

    public static volatile SingularAttribute<Author, String> lastName;
    public static volatile SingularAttribute<Author, Integer> authorID;
    public static volatile ListAttribute<Author, GcmDevice> gcmDeviceList;
    public static volatile SingularAttribute<Author, Date> dateRegistered;
    public static volatile SingularAttribute<Author, String> firstName;
    public static volatile SingularAttribute<Author, String> password;
    public static volatile SingularAttribute<Author, String> gCMRegistrationID;
    public static volatile SingularAttribute<Author, String> cellphone;
    public static volatile ListAttribute<Author, LessonResource> lessonResourceList;
    public static volatile SingularAttribute<Author, Company> company;
    public static volatile SingularAttribute<Author, String> email;
    public static volatile SingularAttribute<Author, Integer> activeFlag;
    public static volatile ListAttribute<Author, CourseAuthor> courseAuthorList;

}