package ParkingLeRetour;

public class TypeDePlace {
	String nom;
	private float longueur;
	private float largeur;

	public TypeDePlace() {
	}

	public TypeDePlace(String nom, float longueur, float largeur) {
		this.nom = nom;
		this.longueur = longueur;
		this.largeur = largeur;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

	public float getLargeur() {
		return largeur;
	}

	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Ma place est de type : "+this.getClass().getName();
}
}
