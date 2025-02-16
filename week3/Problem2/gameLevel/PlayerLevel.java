package week3.Problem2.gameLevel;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();

    public void go(int count){
        run();
        for(int i = 0; i<count; i++){
            jump();
        }
        turn();
    }
}
