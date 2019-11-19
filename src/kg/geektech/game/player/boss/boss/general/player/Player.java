package kg.geektech.game.player.boss.boss.general.player;

import kg.geektech.game.player.boss.boss.general.Boss.Boss;
import kg.geektech.game.player.boss.boss.general.General.AbilitiType;
import kg.geektech.game.player.boss.boss.general.General.GameEntyti;

public abstract class Player extends GameEntyti implements HavingAbillity {
    private AbilitiType abillityType;


    public Player(int health, int damage, AbilitiType abillityType) {
        super(health, damage);
        this.abillityType=abillityType;
    }
    public AbilitiType getAbillityType() {
        return abillityType;
    }

    public void setAbillityType(AbilitiType abillityType) {
        this.abillityType = abillityType;
    }



}
