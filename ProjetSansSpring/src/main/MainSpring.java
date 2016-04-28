package main;

import java.util.logging.Logger;

import beans.Deve;
import beans.Develop;
import beans.SocieteDev;
import metier.Developpeur;
import metier.SocieteDevLogiciel;

public class MainSpring {

	public static void main(String[] args) {
		MainSpring m =new MainSpring();
		//m.init();
		m.initSans();

	}

	private void init() {
		Logger logger = Logger.getLogger(this.getClass().getName());
		SocieteDevLogiciel societe = new SocieteDevLogiciel();
		Developpeur olivier = new Developpeur();
		olivier.setNom("Olivier");
		olivier.setAnneesExperience(7);
		Developpeur marc = new Developpeur();
		marc.setNom("Marc");
		marc.setAnneesExperience(10);
		societe.setChefDeveloppeur(marc);
		societe.setDeveloppeur(olivier);
		
		/*recuperation d'un bean du conteneur*/
		/* utilisation du bean avec injection du dependance*/

		logger.info("Chef developpeur: "+ societe.getChefDeveloppeur().getNom());
		logger.info("Developpeur: "+ societe.getDeveloppeur().getNom());
		
	}
	private void initSans() {
		Logger logger = Logger.getLogger(this.getClass().getName());
		Deve societe = new SocieteDev();
		Develop olivier = new Develop ("Olivier", 7);
		Develop marc= new Develop("Marc", 10);
		societe.chefDevelop("Marc", 10);
		societe.develop("Olivier", 7);
		
	}

}
