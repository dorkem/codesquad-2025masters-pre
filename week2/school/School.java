package week2.school;

import java.util.ArrayList;

public class School {
    private static School school;
    private ArrayList<Student> students = new ArrayList<>();

    private School() {
    }

    public static School getSubject() {
        if (school == null) {
            school = new School();
        }
        return school;
    }

    public Student addStudent(String name, String major) {
        Student s = new Student(name, major);
        students.add(s);
        return s;
    }
}
