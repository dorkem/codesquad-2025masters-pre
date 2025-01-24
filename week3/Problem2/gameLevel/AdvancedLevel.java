package week3.Problem2.gameLevel;

public class AdvancedLevel extends PlayerLevel{
    public void run(){
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }
}
