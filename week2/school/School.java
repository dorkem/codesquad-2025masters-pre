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

    public void printStudents() {
        for (Student s : students) {
            System.out.println(s.getName() + "학생은 " + s.getSubjectCount()+"과목을 수강했습니다.");
            System.out.println("총점은 "+s.getTotal()+"점이고 평균은 " + s.getAverage()+"점입니다.");
        }
    }
}
