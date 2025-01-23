package week2.Dice;

import java.util.ArrayList;

public class Memento {
    private int saveMoney;
    private ArrayList<String> saveFruit;
    private int state;

    public Memento() {
        this.saveMoney = 1000;
        this.saveFruit = new ArrayList<>();
    }

    public ArrayList<String> getSaveFruit() {
        return saveFruit;
    }

    public void addFruit(ArrayList<String> fruit, int state) {
        this.saveFruit = new ArrayList<>(fruit);
        this.state = state;
    }

    public int getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(Gamers gamer) {
        this.saveMoney = gamer.getGameMoney();
        this.saveFruit = new ArrayList<>(gamer.getFruits());
        this.state = gamer.getState();
    }

    public int getState() {
        return state;
    }

    public void printMemento() {
        System.out.println("--Memento에 저장되었습니다.--");
        System.out.println("저장된 과일: "+ saveFruit + ", 저장된 돈: " + saveMoney);
        System.out.println();

    }

}
