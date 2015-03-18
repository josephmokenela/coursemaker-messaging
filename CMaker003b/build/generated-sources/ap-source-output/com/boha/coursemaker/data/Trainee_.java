package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Administrator;
import com.boha.coursemaker.data.Attendance;
import com.boha.coursemaker.data.City;
import com.boha.coursemaker.data.Company;
import com.boha.coursemaker.data.CourseTrainee;
import com.boha.coursemaker.data.DemoAnnouncement;
import com.boha.coursemaker.data.GcmDevice;
import com.boha.coursemaker.data.GuardianTrainee;
import com.boha.coursemaker.data.Institution;
import com.boha.coursemaker.data.LessonResource;
import com.boha.coursemaker.data.TeamMember;
import com.boha.coursemaker.data.TraineeEquipment;
import com.boha.coursemaker.data.TraineeRating;
import com.boha.coursemaker.data.TraineeShout;
import com.boha.coursemaker.data.TraineeSkill;
import com.boha.coursemaker.data.TraineeSkillHistory;
import com.boha.coursemaker.data.TraineeStatus;
import com.boha.coursemaker.data.TrainingClass;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Trainee.class)
public class Trainee_ { 

    public static volatile SingularAttribute<Trainee, String> lastName;
    public static volatile SingularAttribute<Trainee, Integer> gender;
    public static volatile ListAttribute<Trainee, TraineeStatus> traineeStatusList;
    public static volatile SingularAttribute<Trainee, City> city;
    public static volatile ListAttribute<Trainee, TraineeShout> traineeShoutList;
    public static volatile SingularAttribute<Trainee, Date> dateRegistered;
    public static volatile SingularAttribute<Trainee, Institution> institution;
    public static volatile SingularAttribute<Trainee, String> password;
    public static volatile SingularAttribute<Trainee, Administrator> administrator;
    public static volatile SingularAttribute<Trainee, String> cellphone;
    public static volatile ListAttribute<Trainee, LessonResource> lessonResourceList;
    public static volatile SingularAttribute<Trainee, Company> company;
    public static volatile SingularAttribute<Trainee, String> email;
    public static volatile SingularAttribute<Trainee, Integer> activeFlag;
    public static volatile SingularAttribute<Trainee, String> address;
    public static volatile ListAttribute<Trainee, GuardianTrainee> guardianTraineeList;
    public static volatile ListAttribute<Trainee, TraineeEquipment> traineeEquipmentList;
    public static volatile SingularAttribute<Trainee, String> iDNumber;
    public static volatile SingularAttribute<Trainee, TrainingClass> trainingClass;
    public static volatile ListAttribute<Trainee, DemoAnnouncement> demoAnnouncementList;
    public static volatile ListAttribute<Trainee, Attendance> attendanceList;
    public static volatile ListAttribute<Trainee, TeamMember> teamMemberList;
    public static volatile SingularAttribute<Trainee, Integer> traineeID;
    public static volatile ListAttribute<Trainee, GcmDevice> gcmDeviceList;
    public static volatile SingularAttribute<Trainee, Date> dateUpdated;
    public static volatile SingularAttribute<Trainee, String> firstName;
    public static volatile SingularAttribute<Trainee, String> gCMRegistrationID;
    public static volatile ListAttribute<Trainee, TraineeRating> traineeRatingList;
    public static volatile SingularAttribute<Trainee, String> middleName;
    public static volatile ListAttribute<Trainee, CourseTrainee> courseTraineeList;
    public static volatile ListAttribute<Trainee, TraineeSkill> traineeSkillList;
    public static volatile ListAttribute<Trainee, TraineeSkillHistory> traineeSkillHistoryList;

}