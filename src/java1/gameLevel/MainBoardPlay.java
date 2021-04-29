package java1.gameLevel;

public class MainBoardPlay {
    public static void main(String[] args) {

        BeginnerLevel bLevel = new BeginnerLevel();
        Player player = new Player();
        player.play(1);

        AdvancedLevel aLevel =  new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);

        UltraLevel uLevel = new UltraLevel();
        player.upgradeLevel(uLevel);
        player.play(4);

    }
}
