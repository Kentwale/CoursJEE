package vdd.metier.produit;

import java.io.Serializable;

public abstract class Produit implements Serializable, Comparable<Produit> { // pour
																				// éviter
																				// de

	// l'instancié,
	// de faire "new
	// Produit"
	public static int CPT = 0; // du statique, visible partout

	private int id;
	private String nom;
	private float prixUnitaire;

	public Produit() {
		id = CPT;
		CPT++;
	}

	public Produit(String nom, float prixUnitaire) {
		id = CPT;
		this.nom = nom;
		this.prixUnitaire = prixUnitaire;
		CPT++;
	}

	public Produit(String nomDuProduit, String prixSaisi) {
		id = CPT;
		CPT++;
		prixUnitaire = Float.valueOf(prixSaisi).floatValue();
		this.nom=nomDuProduit;
		
	}

	public static int getCPT() {
		return CPT;
	}

	public static void setCPT(int cPT) {
		CPT = cPT;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public abstract float getPrix(); // abstract autorise à utiliser la méthode
										// getPrix de Conso ou Alim.

	@Override
	public String toString() {
		return getNom() + " : " + getPrix();
	}
	// public abstract float getPoids();

	public abstract boolean rajoute(Produit e);

	@Override
	public boolean equals(Object obj) {
		System.out.println(obj.toString());
		return super.equals(obj);
	}

	/*
	 * **@Override public int compareTo(Produit o) { int retour=0; if (o
	 * instanceof Consommable ) { if (this instanceof Alimentaire) { retour=1;
	 * }else if (this instanceof Consommable){ } retour =
	 * this.getNom().compareTo(o.getNom());
	 * 
	 * }else if (o instanceof Alimentaire) { if (this instanceof Alimentaire){
	 * retour=this.getNom().compareTo(o.getNom()); }else if (this instanceof
	 * Consommable){ } retour=-1; }
	 * 
	 * return retour;
	 * 
	 * }**
	 */
	public abstract void setPoids(float poids);

	public abstract void setQte(int Qte);
}

// public abstract void setPoids(float poids);
