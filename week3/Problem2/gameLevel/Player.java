package week3.Problem2.gameLevel;

public class Player {
    public static final PlayerLevel BEGINNER_LEVEL = new BeginnerLevel();
    public static final PlayerLevel ADVANCED_LEVEL = new AdvancedLevel();
    public static final PlayerLevel SUPER_LEVEL = new SuperLevel();

    private PlayerLevel level;

    public Player() {
        this.level = new BeginnerLevel();
    }

    public void play(int count){
        level.go(count);
    }

    public void upgradeLevel(PlayerLevel level){
        System.out.println();
        this.level = level;
        System.out.println("Level UP!");
        System.out.println();
    }
}
