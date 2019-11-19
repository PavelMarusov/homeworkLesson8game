package kg.geektech.game.player.boss.boss.general.player;

import kg.geektech.game.player.boss.boss.general.Boss.Boss;
import kg.geektech.game.player.boss.boss.general.General.AbilitiType;
import kg.geektech.game.player.boss.boss.general.General.GameEntyti;
import kg.geektech.game.player.boss.boss.general.General.RPGGame;

import java.util.Random;
import java.util.spi.AbstractResourceBundleProvider;

public class Thor extends Player implements HavingAbillity {



    public Thor(int health, int damage) {
        super(health, damage, AbilitiType.STUN);
    }

    @Override
    public void userAbility(Player[] player, Boss boss) {
        Random r = new Random();

        int[] a = {r.nextInt(2)};

        for (int b : a) {
            if (b == 1) {
                boss.setDamage(0);
                break;


            }




        }


    }
}

