package controleur;

import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	public Gaulois[] trouverProduit(String produit) {
		if(village.rechercherVendeursProduit(produit)!=null) 
			return village.rechercherVendeursProduit(produit);
		else
			return null;
	}
	
	public boolean isVillageois (String nom) {
		return controlVerifierIdentite.verifierIdentite(nom);
	}
	
	public int nbProduitDispo (String nomVendeur) {
		Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		return etal.getQuantite();
		
	}
	
	public int acheterProduit(String nomVendeur, int nbAchete) {
		Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		etal.acheterProduit(nbAchete);
		return nbAchete;
	}
}
