import dungeon.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Treasure treasure;

    @Before
    public void before(){
        treasure = new Treasure("Goblet", 50);
    }

    @Test
    public void canGetName(){
        assertEquals("Goblet", treasure.getName());
    }

    @Test
    public void canGetValue(){
        assertEquals(50, treasure.getValue(), 0.01);
    }

}
