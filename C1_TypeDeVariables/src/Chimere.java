
public abstract class Chimere extends Vertebre{

	public Chimere() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chimere(String nom, float poids, float taille) {
		super(nom, poids, taille);
		// TODO Auto-generated constructor stub
	}

	public String pouvoirSpecial(){
		String nomDuPouvoirSpecial="";
		nomDuPouvoirSpecial=super.pouvoirSpecial()+" "+nomDuPouvoirSpecial;
		return nomDuPouvoirSpecial;
		
}
	public boolean allaite(){
		return true;
	}
}