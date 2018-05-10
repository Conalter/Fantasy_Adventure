package player;

import protect.Protectable;

public class Minotaur implements Protectable {

    private String name;
    private int damage;
    private int hitpoints;

    public Minotaur(String name, int damage, int hitpoints){
        this.name = name;
        this.damage = damage;
        this.hitpoints = hitpoints;
    }

    public String protect(){
        return "The minotaur growls and leaps in to protect his wizard master!";
    }

}
