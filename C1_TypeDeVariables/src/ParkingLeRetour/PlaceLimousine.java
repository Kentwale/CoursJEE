package ParkingLeRetour;

public class PlaceLimousine extends TypeDePlace {

	private float longueur;
	private float largeur;


	public PlaceLimousine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlaceLimousine(String nom, float longueur, float largeur) {
		this.nom = "Place limousine";
		this.longueur = 5f;
		this.largeur = 2f;

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

	

