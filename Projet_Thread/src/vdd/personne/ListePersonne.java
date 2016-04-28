package vdd.personne;

import java.util.ArrayList;

import vdd.main.Main;

public class ListePersonne extends ArrayList<Personne> implements Runnable {

	public boolean sortie;

	public ListePersonne() {
		sortie = false;
	}

	@Override
	public void run() {

		while (!sortie) {
			try {
				Thread.sleep((long) (Math.random()*10));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Personne personneAAjouter = new Personne();
			synchronized (this) {
				this.add(personneAAjouter);	
			}
			
			
			
				
			}

		}

	}


