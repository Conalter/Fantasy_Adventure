import dungeon.Room;
import dungeon.Treasure;
import enemies.Balrog;
import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;
import player.Cleric;
import player.Magician;
import player.Player;
import player.Warrior;
import weapons.HealingTool;
import weapons.Spell;
import weapons.Weapon;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    ArrayList<Player> players;
    ArrayList<Enemy> enemies;
    ArrayList<Treasure> treasures;
    ArrayList<Weapon> weapons_holster;
    ArrayList<Spell> spell_pouch;
    ArrayList<HealingTool> healingTools;
    Warrior warrior;
    Magician magician;
    Cleric cleric;
    Balrog balrog;
    Treasure treasure;
    Weapon weapon;
    Weapon weapon1;
    Spell spell;
    HealingTool healingTool;

    @Before
    public void before(){
        players = new ArrayList<>();
        enemies = new ArrayList<>();
        treasures = new ArrayList<>();
        weapons_holster = new ArrayList<>();
        spell_pouch = new ArrayList<>();
        healingTools = new ArrayList<>();

        weapon = new Weapon("Warhammer", 40);
        weapons_holster.add(weapon);
        warrior = new Warrior("Dwarf", 50, 0, 25, weapons_holster);

        spell = new Spell("Ice Blast", 60);
        spell_pouch.add(spell);
        magician = new Magician("Warlock", 30, 0, spell_pouch, 15);

        healingTool = new HealingTool("Potion", 50);
        healingTools.add(healingTool);
        cleric = new Cleric("Jimmy", 100, 0, 10, healingTools);

        balrog = new Balrog("Balthazar", 100, 25);

        treasure = new Treasure("Sceptre", 1000.00);

        players.add(warrior);
//        players.add(magician);
//        players.add(cleric);

        enemies.add(balrog);

        treasures.add(treasure);

        room = new Room(players, enemies, treasures);

    }

    @Test
    public void canGetNumberOfPlayers(){
        assertEquals(3, room.getPlayersCount());
    }

    @Test
    public void canGetNumberOfEnemies(){
        assertEquals(1, room.getEnemiesCount());
    }

    @Test
    public void canGetNumberOfTreasures(){
        assertEquals(1, room.getTreasureCount());
    }

    @Test
    public void getWarriorWeaponDamage(){
        weapons_holster.clear();
        weapon1 = new Weapon("Club", 40);
        weapons_holster.add(weapon1);
//        assertEquals(40, warrior.getWeapons().get(0).getDamage());

        assertEquals(40, room.getWarriorWeaponDamage());

    }
}
