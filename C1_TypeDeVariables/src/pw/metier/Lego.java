package pw.metier;
public class Lego { // Lego est la classe
	private String nomDuLego;
	private int longueur; // est une des propriétés
	private int largeur;
	private int couleur;

	public Lego(){ //est un constructeur (par défault)
		this.nomDuLego="";
		this.longueur = 10;
		this.largeur = 5;
		this.couleur = 0;
		}
	
	public Lego(String nomDuLego, int longueur, int largeur, int couleur){ //un autre constructeur; sera chois à la compilation en fonction des paramètres choisis
		this.nomDuLego = nomDuLego;
		this.longueur = longueur;
		this.largeur = largeur;
		this.couleur = couleur;
	}
	//void initialiseMonLego() {// est une méthode; void est le mot réservé pour 1 méthode
	//	this.longueur = 8;
		//largeur = 2;
		//couleur = 0;
	
	public void initialiseMonLego (int longueur, int largeur, int couleur){
		this.longueur = longueur;
		this.largeur = largeur;
		this.couleur = couleur;
	}
	public void nommerMonLego(String nomDuLego){
		this.nomDuLego=nomDuLego; //on a rajouté la prop^riété "nom" du lego
	}
	

	public void peindreMonLego(int coul1) {
		couleur=coul1;
		
	}
	public int getCouleur(){
		return this.couleur;
	}
	public int getLongueur(){
		return this.longueur;	
	}
	public int getLargeur(){
		return this.largeur;
	}
	public String getNomDuLego() {
		return nomDuLego;
	}

	public void setNomDuLego(String nomDuLego) {
		this.nomDuLego = nomDuLego;
	}

	public void setCouleur (int couleur){ //c'est la meme chose que peindreMonLego
		this.couleur = couleur;
		
	}
	public void setLongueur (int longueur){ 
		this.longueur = longueur;}

	public void setLargeur (int largeur){ 
	this.largeur = largeur;
	}
}
	

