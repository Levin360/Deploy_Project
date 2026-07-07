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

    public void viewSection(){
        System.out.println("Section Name: " + sectionName);
        System.out.println("Section's Advisor: " + nameOfAdvisor);
        System.out.println("Number of Students: " + numberOfStudents);

        System.out.println("---  Student List ---");

        for (int i = 0; i < studentList.size(); i++){
            Student student = studentList.get(i);

            System.out.println("ID: " + student.getStudentId());
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Student Age: " + student.getStudentAge());
            System.out.println("---------------------");

        }
    }
}
