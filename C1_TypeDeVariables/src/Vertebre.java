
public abstract class Vertebre extends Animal{

	public Vertebre(){
		super();
		// TODO Auto-generated constructor stub
	}

	public Vertebre(String nom, float poids, float taille) {
		super(nom, poids, taille);
		// TODO Auto-generated constructor stub
	}
	//redefinition methode seDeplacer
	;//{
		//String nomDuTypeDeDeplacement="";
		//nomDuTypeDeDeplacement=super.seDeplacer()+" "+nomDuTypeDeDeplacement;
		//return nomDuTypeDeDeplacement;
	

	public String pouvoirSpecial(){ //seDeplacer dépond donc du nom
		return null;
	}
	public int nbOs(){
		return 100;
	}
	//public abstract seDeplacer(){ //seDeplacer dépond donc du nom
		//return null;
}
