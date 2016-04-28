
public abstract class Animal {

	// propriétés de l'animal
	private String nom;
	private float taille;
	private float poids;
	private int nbPatte;

	// constructeur

	
	public Animal(){
		this.nom = nom;
		this.poids = poids;
		this.taille = taille;
	}
	public Animal(String nom, float poids, float taille){
		this.nom = nom;
		this.poids = poids;
		this.taille = taille;	
		//méthodes
	}
	
	
	
	public int getNbPatte() {
		return nbPatte;
	}
	public void setNbPatte(int nbPatte) {
		this.nbPatte = nbPatte;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getTaille() {
		return taille;
	}
	public void setTaille(float taille) {
		this.taille = taille;
	}
	public float getPoids() {
		return poids;
	}
	public void setPoids(float poids) {
		this.poids = poids;
	}
	public abstract String seDeplacer(); //	public String seDeplacer(){ //seDeplacer dépond donc du nom
	
}
