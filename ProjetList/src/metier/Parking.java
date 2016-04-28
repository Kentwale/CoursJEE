package metier;

public class Parking {
	public static int NB_PLACES_PAR_DEFAUT = 200; // on renseigne le nombre de places

	Etage[] etages;

	public Parking(int nbEtage) {
		etages = new Etage[nbEtage];// constructeur
		for (int i = 0; i < etages.length; i++) {
			etages[i] = new Etage(NB_PLACES_PAR_DEFAUT);
		}
	}

	public Parking(int nbEtage, int nbPlace) {
		etages = new Etage[nbEtage];
		for (int i = 0; i < etages.length; i++) {
			etages[i] = new Etage(nbPlace);
		}
	}
}
