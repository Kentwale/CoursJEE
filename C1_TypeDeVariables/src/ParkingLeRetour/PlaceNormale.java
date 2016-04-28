package ParkingLeRetour;

public class PlaceNormale extends TypeDePlace {

	private float longueur;
	private float largeur;

	public PlaceNormale() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public PlaceNormale(String nom, float longueur, float largeur) {
		this.nom= "Place normale";
		this.longueur=5f;
		this.largeur=1.5f;
		
		// TODO Auto-generated constructor stub
	}
	




	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return super.getNom();
	}

	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		super.setNom(nom);
	}

	@Override
	public float getLongueur() {
		// TODO Auto-generated method stub
		return super.getLongueur();
	}

	@Override
	public void setLongueur(float longueur) {
		// TODO Auto-generated method stub
		super.setLongueur(longueur);
	}

	@Override
	public float getLargeur() {
		// TODO Auto-generated method stub
		return super.getLargeur();
	}

	@Override
	public void setLargeur(float largeur) {
		// TODO Auto-generated method stub
		super.setLargeur(largeur);
	}

}

