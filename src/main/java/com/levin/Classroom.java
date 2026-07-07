package com.levin;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private String sectionName; //camelcase
    private int numberOfStudents;
    private  String nameOfAdvisor;
    private List<Student> studentList = new ArrayList<Student>();


    public void setSectionName(String sectionName){
        this.sectionName = sectionName;
    }

    public String getSectionName(){
        return this.sectionName;
    }

    public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfStudents(){
        return this.numberOfStudents;
    }

    public void setNameofAdvisor(String nameOfAdvisor){
        this.nameOfAdvisor = nameOfAdvisor;
    }

    public String getNameOfAdvisor(){
        return this.nameOfAdvisor;
    }

    public void setStudentList (List<Student> studentList){
        this.studentList = studentList;
    }

    public List<Student> getStudentList(){
        return this.studentList;
    }
}
