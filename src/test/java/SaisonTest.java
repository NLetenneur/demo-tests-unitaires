import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import fr.diginamic.enumerations.Saison;

public class SaisonTest {

	  @Test
	    public void testValueOfLibelleValid() {
	        assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
	        assertEquals(Saison.ETE, Saison.valueOfLibelle("Été"));
	        assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("Automne"));
	        assertEquals(Saison.HIVER, Saison.valueOfLibelle("Hiver"));
	    }

	    @Test
	    public void testValueOfLibelleInvalid() {
	        assertNull(Saison.valueOfLibelle("printemps")); // Case sensitivity
	        assertNull(Saison.valueOfLibelle("Eté"));       // Incorrect case
	        assertNull(Saison.valueOfLibelle("Sommer"));    // Incorrect string
	        assertNull(Saison.valueOfLibelle(""));          // Empty string
	    }

	    @Test
	    public void testValueOfLibelleNull() {
	        assertNull(Saison.valueOfLibelle(null));
	    }
	}

