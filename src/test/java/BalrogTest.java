import enemies.Balrog;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BalrogTest {

    Balrog balrog;

    @Before
    public void before(){
        balrog = new Balrog("Balthazar", 150, 40);
    }

    @Test
    public void canGetBalrogName(){
        assertEquals("Balthazar", balrog.getName());
    }

    @Test
    public void canGetBalrogHitpoints(){
        assertEquals(150, balrog.getHitpoints());
    }

    @Test
    public void canGetBalrogDamage(){
        assertEquals(40, balrog.getDamage());
    }

}
