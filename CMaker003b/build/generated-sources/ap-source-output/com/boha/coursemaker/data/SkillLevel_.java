package com.boha.coursemaker.data;

import com.boha.coursemaker.data.Company;
import com.boha.coursemaker.data.TraineeSkill;
import com.boha.coursemaker.data.TraineeSkillHistory;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-15T13:04:27")
@StaticMetamodel(SkillLevel.class)
public class SkillLevel_ { 

    public static volatile SingularAttribute<SkillLevel, Integer> level;
    public static volatile SingularAttribute<SkillLevel, Company> company;
    public static volatile SingularAttribute<SkillLevel, Integer> skillLevelID;
    public static volatile ListAttribute<SkillLevel, TraineeSkill> traineeSkillList;
    public static volatile SingularAttribute<SkillLevel, String> skillLevelName;
    public static volatile ListAttribute<SkillLevel, TraineeSkillHistory> traineeSkillHistoryList;

}