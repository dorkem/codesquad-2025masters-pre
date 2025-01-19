package week2.school;

public class Subject {
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
