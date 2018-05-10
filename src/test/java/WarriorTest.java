import org.junit.Before;
import org.junit.Test;
import player.Warrior;
import weapons.Weapon;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;
    Weapon weapon;

    @Before
    public void before(){
        ArrayList<Weapon> weapons = new ArrayList<>();
        warrior = new Warrior("Dwarf", 100, 0, 50, weapons);
    }

    @Test
    public void canGetName(){
        assertEquals("Dwarf", warrior.getName());
    }


}
