package week2.school;

public class Main {
    public static void main(String[] args) {
        School school = School.getSubject();

        Student kim = school.addStudent("Kim","수학");
        kim.addSubject("국어", 90);
        kim.addSubject("수학", 95);
        school.printStudents();
    }
}
