import org.junit.Before;
import org.junit.Test;
import player.Magician;
import protect.Protectable;
import weapons.Spell;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MagicianTest {

    Magician magician;
    Spell spell;

    @Before
    public void before(){
        ArrayList<Spell> spells = new ArrayList<>();
        magician = new Magician("Warlock", 100, 30, spells, 50);
    }

    @Test
    public void spellbookStartsEmpty(){
        assertEquals(0, magician.getSizeOfSpellbook());
    }

    @Test
    public void canGetForceFieldStrength(){
        assertEquals(50, magician.getForceField());
    }

    @Test
    public void canAddSpellFromSpellbook(){
        ArrayList<Spell> spells = new ArrayList<>();
        spell = new Spell("FIREBLAST!", 80);
        spells.add(spell);
        magician = new Magician("Warlock", 100, 30, spells, 50);
        assertEquals(1, magician.getSizeOfSpellbook());
    }

}
