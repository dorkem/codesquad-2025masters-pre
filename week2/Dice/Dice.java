package week2.Dice;

import java.util.Random;

public class Dice {
    private Random random;

    public Dice() {
        random = new Random();
    }

    public int throwDice(){
        return random.nextInt(6)+1;
    }

    public void printDiceNumber(int result) {
        System.out.println("주사위 결과: " + result);
    }
}
