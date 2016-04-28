package pw.main;
import pw.metier.Lego;
public class MainLego {

	public static void main(String[] args) { // main est le point d'entrée du
												// programme
		// TODO Auto-generated method stub
		Lego monPremierLego = null; // est une conception; on ne peut s'en
									// servir pour l'instant

		monPremierLego = new Lego("mon premier lego", 12, 7, 3);// naissance
																// d'un lego
		monPremierLego.nommerMonLego("mon Premier Lego");
		Lego monSecondLego = new Lego("mon second lego", 15, 3, 5);// naissance
																	// d'un lego
																	// de meme
																	// propriété
		// mais différent
		monSecondLego.nommerMonLego("mon second lego");
		monPremierLego.setLargeur(5);
		int coul = 2;
		monSecondLego.setCouleur(coul);
		monSecondLego.setLongueur(monPremierLego.getLargeur());
		int long1 = 12;
		int lar1 = 5;
		int coul1 = 3;
		monPremierLego.initialiseMonLego(long1, lar1, coul1);
		monSecondLego.initialiseMonLego(13, 24, 3);
		monSecondLego.peindreMonLego(7);
		System.out.println("couleur de mon premier lego " + monPremierLego.getCouleur());
		System.out.println("couleur de mon second lego " + monSecondLego.getCouleur());

		

	}

}
