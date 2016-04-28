package pw.metier;

public class Lego1 { // sont les propriété de l'objet Lego1
	private String couleur;
	private float longueur; // longeur et largeur ne sont plus utiles du coup; on diminue la quantité de données et on optimise
	private float largeur;
	private float hauteur;
	private int nbreDePicotLng;
	private int nbreDePicotLarg;

	public Lego1() {
		this.couleur = "blanc";
		this.longueur = 3f;
		this.largeur = 1.5f;
		this.hauteur = 0.8f;
		this.nbreDePicotLarg = 2;
		this.nbreDePicotLng = 4;
	}
	public Lego1(Lego1 autreLego){
		this.hauteur= autreLego.getHauteur();
		this.nbreDePicotLng=autreLego.getNbreDePicotLng();
		this.nbreDePicotLarg=autreLego.getNbreDePicotLarg();
		this.couleur=autreLego.getCouleur();
	}

	public Lego1(String couleur, float longueur, float largeur, float hauteur, int nbreDePicotLng, int nbreDePicotLarg) {
		this.couleur = couleur;
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.nbreDePicotLarg = nbreDePicotLarg;
		this.nbreDePicotLng = nbreDePicotLng;
	}

	public Lego1(float hauteur, int nbreDePicotLng, int nbreDePicotLarg, String couleur) {
		this.hauteur = hauteur;
		this.nbreDePicotLng = nbreDePicotLng;
		this.nbreDePicotLarg = nbreDePicotLarg;
		this.couleur = couleur;
		largeur = calculDim(nbreDePicotLarg); // this.largeur=(float)
												// (nbreDePicotLarg*0.75f);
		longueur = calculDim(nbreDePicotLng); // this.longueur=(float)(nbreDePicotLng*0.75f);

	}
	public Lego1(float longueur, float largeur, float hauteur, String couleur){
			this.longueur=longueur;
			this.largeur=largeur;
			this.hauteur=hauteur;
			this.couleur=couleur;
			nbreDePicotLng = calculNbreDePicot(longueur);
			nbreDePicotLarg =calculNbreDePicot(largeur);
			
	}
	

	public float calculDim(int nbreDePicot) { // est la méthode utilisée par l'objet
										// Lego1
		return 0.75f * nbreDePicot; // ici, on utilise le nbre de picots pour
									// lui retourner une valeur

	}

	//public int calculNbreDePicot(float dim) {
	//	int valeurDeRetour = -1; // return (int)(dim/0.75f);
	//	float n = dim / 0.75f;
	//	int nb = (int) (dim / 0.75);
	//	if (nb == n) {
		//	valeurDeRetour = (nb);
		//}else{
		//	valeurDeRetour = nb+1;
		
	
	//return valeurDeRetour;

	public int calculNbreDePicot(float dim) {
		int valeurDeRetour = -1; // return (int)(dim/0.75f);
		if (dim >0){
			float n=dim/0.75f;
			int nb=(int) n;
			if(n-nb<0.5f){
				valeurDeRetour=(nb);
			}else{
				valeurDeRetour = nb+1;
			}
		}
		return valeurDeRetour;
	}
			
		


	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public float getLongueur() {
		return calculDim(nbreDePicotLng); // return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
		nbreDePicotLng=calculNbreDePicot(longueur);
	}

	public float getLargeur() {
		return calculDim(nbreDePicotLarg); // return largeur;
	}

	public void setLargeur(float largeur) {
		this.largeur = largeur;
		nbreDePicotLarg=calculNbreDePicot(largeur);
	}

	public float getHauteur() {
		return hauteur;
	}

	public void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}

	public int getNbreDePicotLng() {
		return nbreDePicotLng;
	}

	public void setNbreDePicotLng(int nbreDePicotLng) {
		this.nbreDePicotLng = nbreDePicotLng;
		longueur=calculDim(nbreDePicotLng);
	}

	public int getNbreDePicotLarg() {
		return nbreDePicotLarg;
	}

	public void setNbreDePicotLarg(int nbreDePicotLarg) {
		this.nbreDePicotLarg = nbreDePicotLarg;
		largeur=calculDim(nbreDePicotLarg);
	}

}
