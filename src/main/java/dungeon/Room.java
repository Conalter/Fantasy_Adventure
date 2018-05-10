package dungeon;

import enemies.Enemy;
import player.Player;

import java.util.ArrayList;

public class Room {

    private ArrayList<Player> players;
    private ArrayList<Enemy> enemies;
    private ArrayList<Treasure> treasure;

    public Room(ArrayList<Player> players, ArrayList<Enemy> enemies, ArrayList<Treasure> treasure) {
        this.players = players;
        this.enemies = enemies;
        this.treasure = treasure;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public ArrayList<Treasure> getTreasure() {
        return treasure;
    }

    public void setTreasure(ArrayList<Treasure> treasure) {
        this.treasure = treasure;
    }

    public int getPlayersCount(){
        return players.size();
    }

    public int getEnemiesCount(){
        return enemies.size();
    }

    public int getTreasureCount(){
        return treasure.size();
    }
}
