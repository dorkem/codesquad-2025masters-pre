package week2.school;

public class Student {
    private String name;
    private String major;
    private static int studentID = 1000;
    private int studentNumber;

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
        studentNumber = ++studentID;
    }
}
