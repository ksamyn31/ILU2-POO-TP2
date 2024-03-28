package test.controleur;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controleur.ControlEmmenager;
import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlAfficherMarcheTest {
	private Village village;
	

	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		village = new Village("le village des irréductibles", 10, 5);
		Chef abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
		Gaulois bonemine = new Gaulois("Bonemine", 10);
		village.ajouterHabitant(bonemine);
		village.installerVendeur(bonemine, "savon", 3);
		Gaulois asterix = new Gaulois("Astérix", 10);
		village.ajouterHabitant(asterix);
		village.installerVendeur(asterix, "pain", 10);
		
	}
	
	@Test
	void testControlAfficherMarche(Village village) {
		//jsp
	}

	@Test
	void testDonnerInfosMarche() {
		//jsp
	}

}
