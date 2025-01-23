package week2.Dice;

public class Main {
    public static void main(String[] args) {
        Gamers gamer = new Gamers();
        Memento memento = new Memento();
        Dice dice = new Dice();

        for(int i = 0; i<100; i++){
            if (gamer.getGameMoney() <= 0) {
                System.out.println("돈이 다 떨어졌습니다. 게임을 종료합니다.");
                break;
            }

            int result = dice.throwDice();
            dice.printDiceNumber(result);

            switch(result){
                case 1,3:
                    gamer.addGameMoney();
                    if(memento.getSaveMoney() < gamer.getGameMoney()){
                        memento.setSaveMoney(gamer);
                        memento.addFruit(gamer.getFruits(), gamer.getState());
                        memento.printMemento();
                    }
                    break;

                case 2,4:
                    gamer.halfGameMoney();
                    if(memento.getSaveMoney() / 2 > gamer.getGameMoney()){
                        gamer.setGameMoney(memento.getSaveMoney());
                        gamer.setFruit(memento.getSaveFruit(), memento.getState());
                    }
                    break;

                case 6:
                    gamer.addFruit();
                    break;

                default:
                    System.out.println("아무일도 일어나지 않았습니다.");
                    System.out.println();
            }
        }
    }
}
