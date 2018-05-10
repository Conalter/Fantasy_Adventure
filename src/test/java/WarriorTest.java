import org.junit.Before;
import org.junit.Test;
import player.Warrior;
import weapons.Weapon;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;
    Weapon weapon1;


    @Before
    public void before(){
        ArrayList<Weapon> weapons = new ArrayList<>();
        warrior = new Warrior("Dwarf", 100, 10, 50, weapons);
    }

    @Test
    public void canGetName(){
        assertEquals("Dwarf", warrior.getName());
    }

    @Test
    public void canGetHitPoints(){
        assertEquals(100, warrior.getHitpoints());
    }

    @Test
    public void canGetBackpackValue(){
        assertEquals(10, warrior.getBackpack(), 0.1);
    }

    @Test
    public void canGetArmour(){
        assertEquals(50, warrior.getArmour());
    }

    @Test
    public void weaponBagIsEmpty(){
        assertEquals(0, warrior.getSizeOfWeaponBag());
    }

    @Test
    public void canAddWeapons(){
        ArrayList<Weapon> weapons = new ArrayList<>();
        weapon1 = new Weapon("axe", 30);
        weapons.add(weapon1);
        warrior = new Warrior("Dwarf", 100, 10, 50, weapons);
        assertEquals(1, warrior.getSizeOfWeaponBag());
    }

}
