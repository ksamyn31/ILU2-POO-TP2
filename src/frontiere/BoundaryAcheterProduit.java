package frontiere;


import java.util.Scanner;

import controleur.ControlAcheterProduit;
import personnages.Gaulois;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		if(controlAcheterProduit.isVillageois(nomAcheteur)==false)
			System.out.println("Je suis désolé "+nomAcheteur+
					" mais il faut être habitant de notre village pour commercer ici");
		System.out.println("Quel produit voulez-vous acheter ?");
		String produits = scan.next();
		if(controlAcheterProduit.trouverProduit(produits)==null)
			System.out.println("Désolé personne ne vend ce produit au marché.");
		System.out.println("Chez quel commerçant voulez-vous achetez des "+produits+" ?");
		int nbVendeur = controlAcheterProduit.trouverProduit(produits).length;
		Gaulois Vendeurs[] = controlAcheterProduit.trouverProduit(produits);
		for(int i=0;i<nbVendeur;i++) {
			System.out.println(i+" - "+Vendeurs[i]);
		}
		String nomVendeur = Vendeurs[scan.nextInt()].getNom();
		if(controlAcheterProduit.isVillageois(nomVendeur)==false)
			System.out.println("Je suis désolé mais "+nomVendeur+
					" mais il faut être un habitant de notre village pour commercer ici");
		System.out.println("Panoramix se déplace jusqu'à l'étal du vendeur "+nomVendeur);
		System.out.println("Bonjour "+nomAcheteur);
		System.out.println("Combien de "+produits+" voulez-vous acheter ?");
		int nbProduitAch = scan.nextInt();
		int nbProduitDispo = controlAcheterProduit.nbProduitDispo(nomVendeur);
		if(nbProduitAch>nbProduitDispo) {
			int nbProduitAchF=controlAcheterProduit.acheterProduit(nomVendeur,nbProduitAch);
			System.out.println(nomAcheteur+" veut acheter "+nbProduitAchF+" "+produits+
					", malheureusement "+nomVendeur+" n'en a plus que "+nbProduitDispo+". "+
					nomAcheteur+" achète tout le stock de"+nomVendeur+".");
		}
		if(nbProduitDispo==0)
			System.out.println(nomVendeur+" veut acheter "+nbProduitAch+" "+produits+
					", malheureusement il n'y a en a plus");
		if(nbProduitDispo>nbProduitAch) {
			int nbProduitAchF=controlAcheterProduit.acheterProduit(nomVendeur, nbProduitAch);
			System.out.println(nomVendeur+" achète "+nbProduitAchF+" "+produits+ " à "
		+nomVendeur);
			
		}
		
	}	
}
