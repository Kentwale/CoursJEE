package pw.metier;
public class Lego { // Lego est la classe
	private String nomDuLego;
	private int longueur; // est une des propri�t�s
	private int largeur;
	private int couleur;

	public Lego(){ //est un constructeur (par d�fault)
		this.nomDuLego="";
		this.longueur = 10;
		this.largeur = 5;
		this.couleur = 0;
		}
	
	public Lego(String nomDuLego, int longueur, int largeur, int couleur){ //un autre constructeur; sera chois � la compilation en fonction des param�tres choisis
		this.nomDuLego = nomDuLego;
		this.longueur = longueur;
		this.largeur = largeur;
		this.couleur = couleur;
	}
	//void initialiseMonLego() {// est une m�thode; void est le mot r�serv� pour 1 m�thode
	//	this.longueur = 8;
		//largeur = 2;
		//couleur = 0;
	
	public void initialiseMonLego (int longueur, int largeur, int couleur){
		this.longueur = longueur;
		this.largeur = largeur;
		this.couleur = couleur;
	}
	public void nommerMonLego(String nomDuLego){
		this.nomDuLego=nomDuLego; //on a rajout� la prop^ri�t� "nom" du lego
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
	

