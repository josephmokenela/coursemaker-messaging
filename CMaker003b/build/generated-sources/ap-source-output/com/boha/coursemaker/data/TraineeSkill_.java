package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Instructor;
import com.boha.coursemaker.data.Skill;
import com.boha.coursemaker.data.SkillLevel;
import com.boha.coursemaker.data.Trainee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(TraineeSkill.class)
public class TraineeSkill_ { 

    public static volatile SingularAttribute<TraineeSkill, Integer> traineeSkillID;
    public static volatile SingularAttribute<TraineeSkill, Instructor> instructor;
    public static volatile SingularAttribute<TraineeSkill, Skill> skill;
    public static volatile SingularAttribute<TraineeSkill, Trainee> trainee;
    public static volatile SingularAttribute<TraineeSkill, SkillLevel> skillLevel;
    public static volatile SingularAttribute<TraineeSkill, Date> dateAssessed;

}