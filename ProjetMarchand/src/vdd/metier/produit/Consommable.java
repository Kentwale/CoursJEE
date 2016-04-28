package vdd.metier.produit;

import java.io.Serializable;

public class Consommable extends Produit implements Serializable,Comparable<Produit> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int qte;

	public Consommable() {
		super();
	}

	public Consommable(String nom, int qte, float prixUnitaire) {
		super(nom, prixUnitaire);
		this.qte = qte;
		// TODO Auto-generated constructor stub
	}
	public Consommable(String nomDuProduit, String prixSaisi, String qteSaisi) {
		super (nomDuProduit, prixSaisi);
		this.qte = Integer.valueOf(qteSaisi).intValue();
	}

	@Override
	public float getPrix() {
		// TODO Auto-generated method stub
		return getPrixUnitaire() * getQte();
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		if (qte > 0) {
			this.qte = qte;
		} else {
			this.qte = qte;
		}

	}

	public boolean rajoute(Produit e) {
		boolean ok = false;
		if (e instanceof Consommable && e.getNom().equals(this.getNom())) {
			Consommable a = (Consommable) e;
			this.setPrixUnitaire((this.getPrix() + e.getPrix()) / (this.getQte() + a.getQte()));
			ok = true;
		}
		return ok;
	}

	@Override
	public boolean equals(Object obj) {
		boolean retour = false;
		if (obj instanceof Consommable) {
			Consommable e = (Consommable) obj;
			retour = (this.getNom().equals(e.getNom()));
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
			retour = this.getNom().compareTo(o.getNom());
		} else if (o instanceof Alimentaire) {
			retour = -1;
		}

		return retour;

	}

	@Override
	public void setPoids(float poids) {
		// TODO Auto-generated method stub
		
	}

}