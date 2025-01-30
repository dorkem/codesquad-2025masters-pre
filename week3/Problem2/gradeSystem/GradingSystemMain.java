package week3.Problem2.gradeSystem;

public class GradingSystemMain {
    public static void main(String[] args) {
        Subject korea = new Subject("국어","GRADE");
        Subject math = new Subject("수학", "GRADE");
        Subject dance = new Subject("방송댄스","PASS_FAIL");

        Student gamchan = new Student("강감찬", 211213, "국어국문학과", "국어");
        korea.addScore(gamchan, 95);
        math.addScore(gamchan, 56);
        dance.addScore(gamchan, 95);

        Student yushin = new Student("김유신", 212330, "컴퓨터공학과", "수학");
        korea.addScore(yushin, 95);
        math.addScore(yushin, 98);
        dance.addScore(yushin, 85);

        Student saimdang = new Student("신사임당", 201518, "국어국문학과", "국어");
        korea.addScore(saimdang, 100);
        math.addScore(saimdang, 88);
        dance.addScore(saimdang, 55);

        Student soonshin = new Student("이순신", 202360, "국어국문학과", "국어");
        korea.addScore(soonshin, 89);
        math.addScore(soonshin, 95);

        Student gildong = new Student("홍길동", 201290, "컴퓨터공학과", "수학");
        korea.addScore(gildong, 83);
        math.addScore(gildong, 56);

        korea.printScore();
        math.printScore();
        dance.printScore();
    }
}
