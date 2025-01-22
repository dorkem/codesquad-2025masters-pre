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

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getMajor() {
        return major;
    }

    public int getSubjectCount() {
        return subjects.size();
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
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

    public void setScore(String subjectName, int score) {
        for (Subject subject : subjects) {
            if (subject.getName().equals(subjectName)) {
                subjects.remove(subject);
                addSubject(subjectName, score);
                System.out.println("업데이트 되었습니다.");
                return;
            }
        }
        System.out.println(subjectName + " 과목을 찾을 수 없습니다.");
    }
}