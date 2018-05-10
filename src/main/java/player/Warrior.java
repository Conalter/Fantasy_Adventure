package player;

import weapons.Weapon;

import java.util.ArrayList;

public class Warrior extends Player{

    Weapon weapon;

    private int armour;
    private ArrayList<Weapon> weapons;

    public Warrior(String name, int hitpoints, double backpack, int armour, ArrayList<Weapon> weapons) {
        super(name, hitpoints, backpack);
        this.armour = armour;
        this.weapons = weapons;
    }

    public int getArmour() {
        return armour;
    }

      public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public int getSizeOfWeaponBag(){
        return weapons.size();
    }
}
