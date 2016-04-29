package vdd.spring.beans.main;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vdd.spring.beans.instruments.GroupeMusique;
import vdd.spring.beans.instruments.Guitare;
import vdd.spring.beans.instruments.Saxophone;
import vdd.spring.beans.instruments.Violon;
import vdd.spring.beans.musiciens.Joueur;

public class MainSpring {

	private static final Logger logger = Logger.getLogger(MainSpring.class);

	public static void main(String[] args) {

		// 1. Chargement du conteneur
		ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "orchestre.xml" });

		// 2. Recupération d'un bean
		Saxophone saxophone=(Saxophone) appContext.getBean("saxophone");
		Violon violon = (Violon)appContext.getBean("violon");
		Guitare guitare = (Guitare)appContext.getBean("guitare");
		Joueur Olivier = (Joueur) appContext.getBean("Olivier");
		Joueur JeanMarc = (Joueur) appContext.getBean("Jean-Marc");
		Joueur Caroline = (Joueur) appContext.getBean("Caroline");
		Joueur Frank = (Joueur) appContext.getBean("Frank");
		GroupeMusique Julien = (GroupeMusique) appContext.getBean("Julien");
		GroupeMusique Alain = (GroupeMusique) appContext.getBean("Alain");
		Joueur Louis=(Joueur) appContext.getBean("Louis");
		
		// 3. Manipulation du bean
		saxophone.jouer();
		violon.jouer();
		guitare.jouer();
		Olivier.jouerMorceau();
		JeanMarc.jouerMorceau();
		Caroline.jouerMorceau();
		Frank.jouerMorceau();
		Julien.jouerMorceau();
		Alain.jouerMorceau();
		Louis.jouerMorceau();
		
		appContext.close();
	}
}
