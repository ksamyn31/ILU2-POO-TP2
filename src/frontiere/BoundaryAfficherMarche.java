package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infosMarche=controlAfficherMarche.donnerInfosMarche();
		int i = 0;
		if(infosMarche.length == 0) {
			System.out.println("Le marché est vide, revenez plus tard.");
		}
		else {
			System.out.println(nomAcheteur+"vous trouverez au marché:");
		}
		while(infosMarche != null) {
			System.out.println("-"+infosMarche[i]);
			i++;
			System.out.println("qui vend"+infosMarche[i]);
			i++;
			System.out.println(" "+infosMarche[i]);
		}
	}
}
