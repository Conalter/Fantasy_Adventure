public class Warrior {

    private String name;
    private int hitpoints;
    private int armour;
    private double backpack;
    private ArrayList<Weapon> weapons;

    public Warrior(String name, int hitpoints, int armour, double backpack, ArrayList<Weapon> weapons) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.armour = armour;
        this.backpack = backpack;
        this.weapons = weapons;
    }

    public String getName() {
        return name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public int getArmour() {
        return armour;
    }

    public double getBackpack() {
        return backpack;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public void setBackpack(double backpack) {
        this.backpack = backpack;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }
}
