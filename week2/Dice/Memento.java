package week2.Dice;

import java.util.ArrayList;

public class Memento {
    private int saveMoney;
    private ArrayList<String> saveFruit;
    public Memento() {
        this.saveMoney = 1000;
    }

    public int getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(Gamers gamer) {
        this.saveMoney = gamer.getGameMoney();
        this.saveFruit = new ArrayList<>(gamer.getFruits());
    }
}
