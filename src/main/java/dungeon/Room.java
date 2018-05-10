package dungeon;

import enemies.Enemy;
import player.Player;
import player.Warrior;

import java.util.ArrayList;

public class Room {

    private ArrayList<Player> players;
    private ArrayList<Enemy> enemies;
    private ArrayList<Treasure> treasures;

    public Room(ArrayList<Player> players, ArrayList<Enemy> enemies, ArrayList<Treasure> treasures) {
        this.players = new ArrayList<>(players);
        this.enemies = new ArrayList<>(enemies);
        this.treasures = new ArrayList<>(treasures);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public ArrayList<Treasure> getTreasure() {
        return treasures;
    }

    public void setTreasure(ArrayList<Treasure> treasure) {
        this.treasures = treasure;
    }

    public int getPlayersCount(){
        return players.size();
    }

    public int getEnemiesCount(){
        return enemies.size();
    }

    public int getTreasureCount(){
        return treasures.size();
    }

    public int getWarriorWeaponDamage(){
//        warrior.getWeapons().get(0).getDamage()
        for (Player player : this.players){
                return ((Warrior) player.getWeaponDamagePoints();
        }
        return 0;
    }
}
