/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boha.coursemaker.dto;

import com.boha.coursemaker.data.Course;
import java.util.List;

/**
 *
 * @author aubreyM
 */
public class CourseDTO {

    private int courseID, activeFlag, shareFlag;
    private long dateUpdated;
    private String courseName, description;
    private int priorityFlag;
    private CategoryDTO category;
    private int companyID;
    private long syncDate;
    private List<ActivityDTO> activityList;
    private List<ObjectiveDTO> objectiveList;
    private List<LessonResourceDTO> lessonResourceList;

    public CourseDTO(Course a) {
        courseID = a.getCourseID();
        dateUpdated = a.getDateUpdated().getTime();
        priorityFlag = a.getPriorityFlag();
        activeFlag = a.getActiveFlag();
        courseName = a.getCourseName();
        description = a.getDescription();
        activeFlag = a.getActiveFlag();
        category = new CategoryDTO(a.getCategory());
        companyID = a.getCompany().getCompanyID();
 
    }

    public CourseDTO() {
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public long getDateUpdated() {
        return dateUpdated;
    }

    public int getPriorityFlag() {
        return priorityFlag;
    }

    public void setPriorityFlag(int priorityFlag) {
        this.priorityFlag = priorityFlag;
    }

 

    public List<ObjectiveDTO> getObjectiveList() {
        return objectiveList;
    }

    public List<LessonResourceDTO> getLessonResourceList() {
        return lessonResourceList;
    }

    public void setLessonResourceList(List<LessonResourceDTO> lessonResourceList) {
        this.lessonResourceList = lessonResourceList;
    }

    public void setObjectiveList(List<ObjectiveDTO> objectiveList) {
        this.objectiveList = objectiveList;
    }

   
    public long getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(long syncDate) {
        this.syncDate = syncDate;
    }

  

    public int getShareFlag() {
        return shareFlag;
    }

   

    public void setShareFlag(int shareFlag) {
        this.shareFlag = shareFlag;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ActivityDTO> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<ActivityDTO> activityList) {
        this.activityList = activityList;
    }

    public int getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(int activeFlag) {
        this.activeFlag = activeFlag;
    }

    public void setDateUpdated(long dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }
}
