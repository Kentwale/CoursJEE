
public class Dragon extends Chimere {

	private int nbPatte;
	private int nbAile;
	private float tailleGriffe;

	public Dragon() {
	super("Malefoy",900f,9.4f);
		nbPatte = 4;
		nbAile=2;
		tailleGriffe=0.9f;
	}

	public Dragon(String nom, float poids, float taille) {
	super(nom, poids, taille);
		nbPatte = 4;
		nbAile=2;
		tailleGriffe=0.9f;
	}

	public int getNbAile() {
		return nbAile;
	}

	public void setNbAile(int nbAile) {
		this.nbAile = nbAile;
	}

	public float getTailleGriffe() {
		return tailleGriffe;
	}

	public void setTailleGriffe(float tailleGriffe) {
		this.tailleGriffe = tailleGriffe;
	}

	public int getNbPatte() {
		return nbPatte;
	}

	public void setNbPatte(int nbPatte) {
		this.nbPatte = nbPatte;
	}
	
	
	@Override
	public String seDeplacer() {
		// TODO Auto-generated method stub
		return "voler";
	}

	public String pouvoirSpecial(){
		return "cracher du feu";
}
}