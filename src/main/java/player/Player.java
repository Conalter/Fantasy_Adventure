package player;

import weapons.Weapon;

public abstract class Player {

    private String name;
    private int hitpoints;
    private double backpack;
    Weapon weapon;

    public Player(String name, int hitpoints, double backpack) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.backpack = backpack;
        this.weapon = new Weapon("Axe", 30);
    }

    public String getName() {
        return name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public double getBackpack() {
        return backpack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public void setBackpack(double backpack) {
        this.backpack = backpack;
    }

}
