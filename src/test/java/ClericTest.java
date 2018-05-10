import org.junit.Before;
import org.junit.Test;
import player.Cleric;
import weapons.HealingTool;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    HealingTool healingTool;

    @Before
    public void before(){
        ArrayList<HealingTool> tools = new ArrayList<>();
        cleric = new Cleric("Jimmy", 30, 0, 40, tools);
    }

    @Test
    public void canAddToHealingTools(){
        ArrayList<HealingTool> tools = new ArrayList<>();
        healingTool = new HealingTool("herbs", 20);
        tools.add(healingTool);
        cleric = new Cleric("Jimmy", 30, 0, 40, tools);
        assertEquals(1, cleric.getSizeOfToolPouch());
    }
}
