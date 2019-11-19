package kg.geektech.game.player.boss.boss.general.player;

import kg.geektech.game.player.boss.boss.general.Boss.Boss;
import kg.geektech.game.player.boss.boss.general.General.AbilitiType;

import java.util.Random;

public class Tanck extends Player implements HavingAbillity {

    public Tanck(int health, int damage) {
        super(health, damage, AbilitiType.TAKE_DAMAGE);
    }

    @Override
    public void userAbility(Player[] player, Boss boss) {
        Random r =  new Random();
        int number = r.nextInt(5)+3;
        player[2].setHealth(getHealth()-(boss.getDamage()+number));


    }
}
