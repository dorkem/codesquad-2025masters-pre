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

    public void printStudents(Student student) {
        if (students.contains(student)) {
            System.out.println(student.getName() + "학생은 " + student.getSubjectCount()+"과목을 수강했습니다.");
            System.out.println("총점은 "+student.getTotal()+"점이고 평균은 " + String.format("%.2f", student.getAverage())+"점입니다.");
        } else {
            System.out.println("해당 학생은 등록되어 있지 않습니다.");
        }
    }
}
