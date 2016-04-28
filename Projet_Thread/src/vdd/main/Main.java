package vdd.main;

import vdd.ascenceur.Asc0;
import vdd.ascenceur.ListeAscenseur;
import vdd.personne.ListePersonne;
import vdd.personne.Personne;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.init();
	}

	public ListePersonne listePersonne;
	public ListeAscenseur listeAscenseur;
	public Affichage aff;

	public boolean sortie;

	public Main() {
		listePersonne = null;
		listeAscenseur = null;
		sortie = false;
	}

	public void init() {
		listePersonne = new ListePersonne();
		//for (int i = 0; i < 10; i++) {
			//listePersonne.add(new Personne());
		
		//}
		Thread thread = new Thread(listePersonne);
		
		listeAscenseur= new ListeAscenseur(this);
		thread.start();
		
		aff = new Affichage(this);
		aff.init();
		
		Asc0 asc= new Asc0(this);
		listeAscenseur.add(asc);
		asc.start();
		
		Asc0 asc1= new Asc0(this);
		listeAscenseur.add(asc1);
		asc1.start();
		
		Asc0 asc2= new Asc0(this);
		listeAscenseur.add(asc2);
		asc2.start();
		
	//	Personne p = new Personne();
		
		//asc.personneAscenseur=p;
		//p.depart=0;
	//	p.arrive=10;
		
		//Personne p1=new Personne();
	
		//asc1.personneAscenseur=p1;
		//p1.depart=14;
		//p1.arrive=10;
		
		
	}
}
