package kg.geektech.game.player.boss.boss.general.General;

import kg.geektech.game.player.boss.boss.general.Boss.Boss;
import kg.geektech.game.player.boss.boss.general.player.*;

public class RPGGame {
    public static void startGame() {
        Boss boss = new Boss(1000, 30);

        Warrior warrior = new Warrior(100, 10);
        Medical medical = new Medical(100, 10 );
        medical.setHealPoints(5);
        Magic magic = new Magic(100, 10);
        Hunter hunter = new Hunter(100, 10);
        Thor thor = new Thor(100,10);
        Tanck tanck = new Tanck(150,5);

        Player[] heroes = {warrior, magic, medical, hunter,thor,tanck};








        printStatistic(heroes,boss);
        while (!isFinished(heroes,boss)){
            round(heroes,boss);
        }


    }

    private static void heroerUserSuperAbillity(Player[] heroes, Boss boss){
        for (int i = 0; i <heroes.length; i++) {
            heroes[i].userAbility(heroes,boss);

        }


    }


    private static void round(Player[] heroes, Boss boss){
        heroesHit(heroes, boss);
        bossHit(heroes,boss);
        heroerUserSuperAbillity(heroes,boss);
        printStatistic(heroes,boss);
    }

    private static Player printStatistic(Player[] heroes, Boss boss){
        System.out.println("__________________________________");
        System.out.println("Boss health" + boss.getHealth());
        for (int i = 0; i <heroes.length ; i++) {
            System.out.println(heroes[i].getClass().getSimpleName() + "health" + heroes[i].getHealth());

        }

        System.out.println("__________________________________");
        return null;
    }

    private static void heroesHit(Player[] heroes, Boss boss){
        for (int i = 0; i <heroes.length; i++) {
            boss.setHealth(boss.getHealth()-heroes[i].getDamage());

        }
    }
    private static void bossHit(Player[] heroes, Boss boss){
        for (int i = 0; i <heroes.length; i++) {
            heroes[i].setHealth(heroes[i].getHealth()-boss.getDamage());

        }
    }

    private static boolean isFinished(Player[] heroes, Boss boss) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth()>0) {
                allHeroesDead = false;
                break;

            }


        }
        if (allHeroesDead){
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;

    }

}
