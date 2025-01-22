package week2.Dice;

public class Main {
    public static void main(String[] args) {
        Gamers gamer = new Gamers();
        Memento memento = new Memento();
        Dice dice = new Dice();

        for(int i = 0; i<2; i++){
            int result = dice.throwDice();

            switch(result){
                case 1,3:
                    gamer.addGameMoney();
                    if(memento.getSaveMoney() > gamer.getGameMoney()){
                        memento.setSaveMoney(gamer);
                    }
                case 2,4:
                default:
            }
        }
    }
}
