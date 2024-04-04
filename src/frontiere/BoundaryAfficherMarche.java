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
		int cmp = 0;
		if(infosMarche.length == 0) {
			System.out.println("Le marché est vide, revenez plus tard.");
		}
		else {
			System.out.println(nomAcheteur+" vous trouverez au marché:");
		}
		while(infosMarche.length!=cmp) {
			if(infosMarche[i]==String.valueOf(true))
				System.out.println("-"+infosMarche[i]+"qui vend"
			+infosMarche[i+1]+" "+infosMarche[i+2]);
			cmp++;
		}
	}
}
