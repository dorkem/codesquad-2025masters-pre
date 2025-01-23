package week2.Dice;

import java.util.ArrayList;

public class Gamers {

    private int gameMoney;
    private ArrayList<String> fruits;
    private final String[] FRUITS = {"사과", "샤인머스켓", "귤"};
    private int state;

    public Gamers(){
        this.gameMoney = 1000;
        this.fruits = new ArrayList<>();
        state = 0;
    }

    public void addGameMoney(){
        this.gameMoney += 100;
        System.out.println("입금되었습니다. " + printMoney());
        System.out.println();
    }

    public void halfGameMoney(){
        this.gameMoney /= 2;
        System.out.println("돈을 잃었습니다. " + printMoney());
        System.out.println();
    }

    public void addFruit(){
        this.fruits.add(FRUITS[state%3]);
        state++;
        System.out.println("과일이 추가되었습니다. " + printFruits());
        System.out.println();
    }

    public int getGameMoney(){
        return gameMoney;
    }

    public void setGameMoney(int gameMoney) {
        this.gameMoney = gameMoney;
        printFruits();
    }

    public ArrayList<String> getFruits(){
        return fruits;
    }

    public void setFruit(ArrayList<String> fruit, int state){
        this.fruits = new ArrayList<>(fruit);
        this.state = state;
        System.out.println("과일과 돈을 복구하였습니다. " + printMoney() + ", " + printFruits());
        System.out.println();
    }

    public int getState() {
        return state;
    }

    public String printFruits() {
        return "저장된 과일 목록: " + fruits;
    }

    public String printMoney() {
        return "현재 금액: " + gameMoney;
    }
}
