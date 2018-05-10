package enemies;

public abstract class Enemy {

    private String name;
    private int hitpoints;
    private int damage;

    public Enemy(String name, int hitpoints, int damage) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
