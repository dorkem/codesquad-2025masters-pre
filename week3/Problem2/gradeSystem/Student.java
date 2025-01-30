package week3.Problem2.gradeSystem;

import java.util.ArrayList;

public class Student {
    public Student(String name, int studentID, String major, String requiredSubject){
        this.name = name;
        this.studentID = studentID;
        this.major = major;
        this.requiredSubject = requiredSubject;
    }

    private String name;
    private int studentID;
    private String major;
    private String requiredSubject;

    public String getRequiredSubject() {
        return requiredSubject;
    }

    public String getName(){
        return name;
    }

    public int getStudentID(){
        return studentID;
    }

    public String getMajor(){
        return major;
    }


}
