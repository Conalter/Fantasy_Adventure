package player;

import weapons.HealingTool;

import java.util.ArrayList;

public class Cleric extends Player {

    private int armour;
    private ArrayList<HealingTool> tools;

    public Cleric(String name, int hitpoints, double backpack, int armour, ArrayList<HealingTool> tools) {
        super(name, hitpoints, backpack);
        this.armour = armour;
        this.tools = tools;
    }

    public int getSizeOfToolPouch(){
        return tools.size();
    }
}
