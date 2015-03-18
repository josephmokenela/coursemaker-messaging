package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Company;
import com.boha.coursemaker.data.TraineeSkill;
import com.boha.coursemaker.data.TraineeSkillHistory;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(Skill.class)
public class Skill_ { 

    public static volatile SingularAttribute<Skill, String> skillName;
    public static volatile SingularAttribute<Skill, Integer> skillID;
    public static volatile SingularAttribute<Skill, Company> company;
    public static volatile ListAttribute<Skill, TraineeSkill> traineeSkillList;
    public static volatile ListAttribute<Skill, TraineeSkillHistory> traineeSkillHistoryList;

}