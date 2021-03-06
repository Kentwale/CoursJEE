package vdd.spring.beans.main;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		Joueur musicien1 = (Joueur) appContext.getBean("Olivier");
		Joueur musicien2 = (Joueur) appContext.getBean("Jean Marc");
		Joueur musicien3 = (Joueur) appContext.getBean("Caroline");
		Joueur musicien4 = (Joueur) appContext.getBean("Frank");

		// 3. Manipulation du bean
		saxophone.jouer();
		violon.jouer();
		guitare.jouer();
		musicien1.jouerMorceau();
		musicien2.jouerMorceau();
		musicien3.jouerMorceau();
		musicien4.jouerMorceau();

		appContext.close();
	}
}
