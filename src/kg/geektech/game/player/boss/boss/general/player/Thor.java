package kg.geektech.game.player.boss.boss.general.player;

import kg.geektech.game.player.boss.boss.general.Boss.Boss;
import kg.geektech.game.player.boss.boss.general.General.AbilitiType;
import kg.geektech.game.player.boss.boss.general.General.GameEntyti;

import java.util.Random;

public class Thor extends Player implements HavingAbillity {


    public Thor(int health, int damage) {
        super(health, damage, AbilitiType.STUN);
    }

    @Override
    public void userAbillitu(Player[] player, Boss boss) {
        Random r = new Random();
        int number = r.nextInt(2);
        if (number==1){
            boss.setDamage(0);
        }

    }
}
