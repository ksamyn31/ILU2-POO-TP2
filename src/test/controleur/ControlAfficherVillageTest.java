package test.controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controleur.ControlAfficherVillage;
import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlAfficherVillageTest {
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
	void testControlAfficherVillage() {
		ControlAfficherVillageTest cavt = new ControlAfficherVillageTest();
		assertNotNull(cavt, "Constructeur ne renvoie pas null");
	}

	@Test
	void testDonnerNomsVillageois() {
		fail("Not yet implemented");
	}

	@Test
	void testDonnerNomVillage() {
		fail("Not yet implemented");
	}

	@Test
	void testDonnerNbEtals() {
		ControlAfficherVillageTest cavt = new ControlAfficherVillageTest();
		//jsp
	}

}
