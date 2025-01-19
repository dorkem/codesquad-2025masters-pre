package week2.school;

import java.util.ArrayList;

public class Student {
    private String name;
    private String major;
    private static int studentID = 1000;
    private int studentNumber;
    private ArrayList<Subject> subjects;

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
        studentNumber = ++studentID;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(String subject, int score) {
        subjects.add(new Subject(subject, score));
    }

    public String getName() {
        return name;
    }

    public int getSubjectCount() {
        return subjects.size();
    }

    public int getTotal() {
        int total = 0;
        for (Subject subject : subjects) {
            total += subject.getScore();
        }
        return total;
    }

    public double getAverage() {
        if (subjects.isEmpty()) return 0;
        return (double) getTotal() / subjects.size();
    }
}