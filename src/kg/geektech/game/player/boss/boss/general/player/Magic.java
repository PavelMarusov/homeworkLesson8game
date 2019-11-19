package kg.geektech.game.player.boss.boss.general.player;

import kg.geektech.game.player.boss.boss.general.Boss.Boss;
import kg.geektech.game.player.boss.boss.general.General.AbilitiType;

import java.util.Random;

public class Magic extends Player {

    public Magic(int health, int damage) {

        super(health, damage, AbilitiType.BOOST);
    }

    @Override
    public void userAbillitu(Player[] player, Boss boss) {


        for (int i = 0; i <player.length ; i++) {
            Random r = new Random();
            int r1 = r.nextInt(5)+1;
            player[i].setDamage(player[i].getDamage() + r1);

        }

    }
}
