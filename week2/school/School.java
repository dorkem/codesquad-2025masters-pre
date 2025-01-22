package week2.school;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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

    public void addScore(String name, String subject, int score) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.addSubject(subject, score);
                System.out.println(subject + " 과목이 추가되었습니다.");
                return;
            }
        }
        System.out.println("해당 이름의 학생을 찾을 수 없습니다.");
    }

    public void setScore(String name, String subject, int score) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.setScore(subject, score);
                return;
            }
        }
        System.out.println("해당 이름의 학생을 찾을 수 없습니다.");
    }

    public void printStudent(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student.getName() + " 학생은 " + student.getSubjectCount() + " 과목을 수강했습니다.");
                System.out.println("총점은 " + student.getTotal() + "점이고 평균은 " + String.format("%.2f", student.getAverage()) + "점입니다.");
                return;
            }
        }
        System.out.println("해당 이름의 학생은 등록되어 있지 않습니다.");
    }

    public void printAllStudent(){
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }

    public void saveFile() {
        Set<String> subjectSet = new LinkedHashSet<>();

        for (Student student : students) {
            for (Subject subject : student.getSubjects()) {
                subjectSet.add(subject.getName());  // 모든 과목 추가 (중복 방지)
            }
        }

        List<String> subjectList = new ArrayList<>(subjectSet);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("week2/school/input.txt"))) {
            writer.write("이름,학번,전공과목," + String.join(",", subjectList));
            writer.newLine();

            for (Student student : students) {
                StringBuilder sb = new StringBuilder();
                sb.append(student.getName()).append(",");
                sb.append(student.getStudentNumber()).append(",");
                sb.append(student.getMajor()).append(",");

                for (String subjectName : subjectList) {
                    boolean found = false;
                    for (Subject subject : student.getSubjects()) {
                        if (subject.getName().equals(subjectName)) {
                            sb.append(subject.getScore()).append(",");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        sb.append(",");
                    }
                }
                writer.write(sb.toString());
                writer.newLine();
            }
            System.out.println("학생 정보가 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
        }
    }

}
