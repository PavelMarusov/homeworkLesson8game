package kg.geektech.game.player.boss.boss.general.player;

import kg.geektech.game.player.boss.boss.general.Boss.Boss;
import kg.geektech.game.player.boss.boss.general.General.AbilitiType;

import java.util.Random;

public class Hunter extends Player {

    public Hunter(int health, int damage) {
        super(health, damage, AbilitiType.CRITICAL_DAMAGE);
    }

    @Override
    public void userAbility(Player[] player, Boss boss) {
        for (int i = 0; i <player.length ; i++) {
            if (i==3){
            Random r = new Random();
            int generationNumber =r.nextInt(4)+2;
            player[3].setDamage(player[3].getDamage() * generationNumber);}

        }




    }
}
