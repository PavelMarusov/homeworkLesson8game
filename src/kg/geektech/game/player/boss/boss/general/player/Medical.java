package kg.geektech.game.player.boss.boss.general.player;

import kg.geektech.game.player.boss.boss.general.Boss.Boss;
import kg.geektech.game.player.boss.boss.general.General.AbilitiType;

public class Medical extends Player {

    private int healPoints;

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public Medical(int health, int damage) {
        super(health, damage, AbilitiType.HEAL);
    }

    @Override
    public void userAbility(Player[] player, Boss boss) {
        for (int i = 0; i <player.length; i++) {
            player[i].setHealth(player[i].getHealth() + healPoints);

        }

    }
}
