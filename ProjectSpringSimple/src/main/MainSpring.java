package main;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.SocieteDevLogiciel;



public class MainSpring {

	public static void main(String[] args) {
		MainSpring m =new MainSpring();
		m.init();
	

	}

	private void init() {
		Logger logger = Logger.getLogger(this.getClass().getName());
		/*chargement du conteneur spring*/
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("simple-beans.xml");
		/*recupeeration d'un bean conteneur*/
		SocieteDevLogiciel societe= (SocieteDevLogiciel) appContext.getBean("societeDevLogiciel");
				/*utilisation du bean avec injection de dépendance*/
		

		logger.info("Chef developpeur: "+ societe.getChefDeveloppeur().getNom());
		logger.info("Developpeur: "+ societe.getDeveloppeur().getNom());
		
	
	}

}
