package vdd.metier.produit;

import java.io.Serializable;

public class Alimentaire extends Produit implements Serializable, Comparable<Produit> {

	private static final long serialVersionUID = 1L;

	private float poids;

	public Alimentaire() { // constructeur par défaut
		super(); // pas forcément nécessaire
	}

	public Alimentaire(String nom, float poids, float prixUnitaire) {
		super(nom, prixUnitaire);
		this.poids = poids;
		// TODO Auto-generated constructor stub
	}

	public Alimentaire(String nomDuProduit, String prixSaisi, String poidsSaisi) {
		super (nomDuProduit, poidsSaisi );
		this.poids = Integer.valueOf(poidsSaisi).intValue();
	}

	@Override
	public float getPrix() {
		// TODO Auto-generated method stub
		return getPrixUnitaire() * getPoids();
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		if (poids > 0) {
			this.poids = poids;
		} else {
			this.poids = poids;
		}
		// return poids;

	}

	@Override
	public boolean rajoute(Produit e) {
		boolean ok = false;
		if (e instanceof Alimentaire && e.getNom().equals(this.getNom())) {
			Alimentaire a = (Alimentaire) e;
			this.setPrixUnitaire((this.getPrix() + e.getPrix()) / (this.getPoids() + a.getPoids()));
			ok = true;
		}
		return ok;
	}

	@Override
	public boolean equals(Object obj) {
		boolean retour = false;
		if (obj instanceof Alimentaire) {
			Alimentaire e = (Alimentaire) obj;
			retour = (this.getNom().equals(e.getNom()));
			/*
			 * if (this.getNom().equals(e.getNom())) { retour=true};
			 */
		}

		return retour;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return getNom().hashCode();
	}

	@Override
	public int compareTo(Produit o) {
		int retour = 0;
		if (o instanceof Consommable) {
			retour = 1;
		} else if (o instanceof Alimentaire) {
			retour = this.getNom().compareTo(o.getNom());
		}
		return retour;
	}

	@Override
	public void setQte(int Qte) {
		// TODO Auto-generated method stub

	}
}
