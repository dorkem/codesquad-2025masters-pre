package week2.Dice;

import java.util.ArrayList;

public class Gamers {

    private int gameMoney;
    private ArrayList<String> fruits;
    private int state; //memento로 fruits 복귀할 때 사용
    private final String[] FRUITS = {"사과", "샤인머스켓", "귤"};

    public Gamers(){
        this.gameMoney = 1000;
        this.fruits = new ArrayList<>();
        this.state = 0;
    }

    public void addGameMoney(){
        this.gameMoney += 100;
    }

    public int getGameMoney(){
        return gameMoney;
    }

    public ArrayList<String> getFruits(){
        return fruits;
    }
}
