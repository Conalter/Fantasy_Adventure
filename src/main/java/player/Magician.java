package player;

import protect.Protectable;
import weapons.Spell;

import java.util.ArrayList;

public class Magician extends Player  {

    Spell spell;

    private ArrayList<Spell> spells;
    private int forceField;
    Protectable protectable;

    public Magician(String name, int hitpoints, double backpack, ArrayList<Spell> spells, int forceField, Protectable protectable) {
        super(name, hitpoints, backpack);
        this.spells = spells;
        this.forceField = forceField;
        this.protectable = protectable;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public int getForceField() {
        return forceField;
    }

    public Protectable getProtectable() {
        return protectable;
    }

    public void setForceField(int forceField) {
        this.forceField = forceField;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }
}
