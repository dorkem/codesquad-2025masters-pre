package week4.membership3;

public class Member {
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(GRADE grade) {
        this.grade = grade;
    }

    private String name;
    private GRADE grade;

    public Member(int id, String name, GRADE grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name+"님의 아이디는 " + id + "이고 등급은 " + grade + "입니다.";
    }
}
