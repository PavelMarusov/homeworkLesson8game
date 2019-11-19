package kg.geektech.game.player.boss.boss.general.player;

import kg.geektech.game.player.boss.boss.general.Boss.Boss;
import kg.geektech.game.player.boss.boss.general.General.AbilitiType;

public class Warrior extends Player {

    public Warrior(int health, int damage) {
        super(health, damage, AbilitiType.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void userAbility(Player[] player, Boss boss) {

        for (int i = 0; i <player.length; i++) {
            if (i==0){


            player[0].setDamage(player[0].getDamage()+ boss.getDamage());}




        }

    }
}
