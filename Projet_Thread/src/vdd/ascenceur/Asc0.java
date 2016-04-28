package vdd.ascenceur;

import vdd.main.Main;
import vdd.personne.ListePersonne;
import vdd.personne.Personne;

public class Asc0 extends Asc {

	public Asc0(Main main) {
		super(main);
	}

	@Override
	public void run() {
		while (!finDeTraitement) {
			rechercherPersonneEnAttente();
			

			if (personneEstEnEtatDeDepart()) {
				deplacerAscenceurJusquaDepart();
				personneAscenseur.etat = Personne.ETAT_MOVE;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (personneADeplacerJusquaArrivee()) {
				deplacerAscenceurJusquaArrivee(); 
				personneAscenseur.etat = Personne.ETAT_ARRIVE;
				main.listePersonne.remove(personneAscenseur);
				//System.out.println(main.listePersonne);
				this.personneAscenseur = null;// efface le pointeur, perte
				// association
				// ascenseur-personne
					

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		// System.out.println(Thread.currentThread().getName() + " " +
		// Thread.currentThread().isAlive());
		// System.out.println("Fin de mon Run");

	}

	private void deplacerAscenceurJusquaArrivee() {
		// etage = personneAscenseur.depart;

		while (etage != personneAscenseur.arrive) {
			main.aff.repaint();
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (personneAscenseur.depart < personneAscenseur.arrive) {
				progression++;
				if (progression == HAUTEUR_ETAGE) {
					etage++;
					progression = 0;
				}
			} else {
				progression--;
				if (progression == -HAUTEUR_ETAGE) {
					etage--;
					progression = 0;
				}

			}
			main.aff.repaint();
		} 
		
		// personneAscenseur.etat=Personne.ETAT_ARRIVE;

	}

	private boolean personneADeplacerJusquaArrivee() {
		boolean b = false;
		if (this.personneAscenseur !=null && this.personneAscenseur.etat == Personne.ETAT_MOVE) {
			b = true;
		}
		return b;

	}

	private void deplacerAscenceurJusquaDepart() {
		while (etage != personneAscenseur.depart) {
			main.aff.repaint();
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (etage < personneAscenseur.depart) {
				progression++;
				if (progression == HAUTEUR_ETAGE) { // if(progression %
					// HAUTEUR_ETAGE ==0)
					progression = 0;
					etage++;
				}
			} else if (etage > personneAscenseur.depart) {
				progression--;
				if (progression == -HAUTEUR_ETAGE) {
					progression = 0;
					etage--;
				}

			}
			main.aff.repaint();
		} 
		
		// personneAscenseur.etat=Personne.ETAT_MOVE;

	}

	private boolean personneEstEnEtatDeDepart() {
		boolean b = false;
		if (this.personneAscenseur !=null && this.personneAscenseur.etat == Personne.ETAT_DEPART) {
			b = true;
		}
		return b;
	}

	private void rechercherPersonneEnAttente() {
		synchronized (main.listePersonne) {

			for (Personne personne : main.listePersonne) {
				if (personne.etat == Personne.ETAT_ATTENTE) {
					this.personneAscenseur = personne;
					personne.etat = Personne.ETAT_DEPART;
					break;
				}

			}
		}
	}

}
