package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Administrator;
import com.boha.coursemaker.data.Attendance;
import com.boha.coursemaker.data.Company;
import com.boha.coursemaker.data.DemoAnnouncement;
import com.boha.coursemaker.data.HelpRequest;
import com.boha.coursemaker.data.InstructorClass;
import com.boha.coursemaker.data.LessonSchedule;
import com.boha.coursemaker.data.Team;
import com.boha.coursemaker.data.Trainee;
import com.boha.coursemaker.data.TrainingClassCourse;
import com.boha.coursemaker.data.TrainingClassEvent;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(TrainingClass.class)
public class TrainingClass_ { 

    public static volatile SingularAttribute<TrainingClass, Date> endDate;
    public static volatile ListAttribute<TrainingClass, LessonSchedule> lessonScheduleList;
    public static volatile ListAttribute<TrainingClass, DemoAnnouncement> demoAnnouncementList;
    public static volatile SingularAttribute<TrainingClass, Integer> trainingClassID;
    public static volatile ListAttribute<TrainingClass, Attendance> attendanceList;
    public static volatile SingularAttribute<TrainingClass, Administrator> administrator;
    public static volatile SingularAttribute<TrainingClass, Integer> isOpen;
    public static volatile SingularAttribute<TrainingClass, Integer> calendarID;
    public static volatile ListAttribute<TrainingClass, InstructorClass> instructorClassList;
    public static volatile SingularAttribute<TrainingClass, String> trainingClassName;
    public static volatile ListAttribute<TrainingClass, HelpRequest> helpRequestList;
    public static volatile SingularAttribute<TrainingClass, Company> company;
    public static volatile ListAttribute<TrainingClass, Team> teamList;
    public static volatile SingularAttribute<TrainingClass, Date> startDate;
    public static volatile ListAttribute<TrainingClass, TrainingClassEvent> trainingClassEventList;
    public static volatile ListAttribute<TrainingClass, TrainingClassCourse> trainingClassCourseList;
    public static volatile ListAttribute<TrainingClass, Trainee> traineeList;

}