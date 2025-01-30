package week3.Problem2.gradeSystem;

import java.util.ArrayList;

public class Subject {
    private String name;
    private ArrayList<Score> scores;
    private String evaluationType;

    public Subject(String name, String evaluationType) {
        this.name = name;
        scores = new ArrayList<>();
        this.evaluationType = evaluationType;
    }

    public void addScore(Student student, int score) {
        GradeEvaluation evaluator;
        if ("PASS_FAIL".equals(evaluationType)) {
            evaluator = new PassFailEvaluation();
        }
        else if (student.getRequiredSubject().equals(name)) {
            evaluator = new MajorEvaluation();
        } else {
            evaluator = new BasicEvaluation();
        }

        String grade = evaluator.getGrade(score);
        scores.add(new Score(student, grade, score));
    }

    public String getName() {
        return name;
    }

    public void printScore(){
        System.out.printf("%s 수강생 학점%n", name);
        System.out.printf("%-5s | %-6s | %-5s | %-4s%n", "이름", "학번", "중점과목", "점수");
        System.out.println("-------------------------------------");

        for (Score score : scores) {
            System.out.println(score);
        }
        System.out.println();
    }
}