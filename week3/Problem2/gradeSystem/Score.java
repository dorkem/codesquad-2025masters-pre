package week3.Problem2.gradeSystem;

public class Score {
    private Student student;
    private String grade;
    private int score;

    public Score(Student student, String grade, int score) {
        this.student = student;
        this.score = score;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return String.format("%-5s | %-6s | %-5s | %3d : %s |",
                student.getName(), student.getStudentID(), student.getMajor(), score, grade);
    }
}
