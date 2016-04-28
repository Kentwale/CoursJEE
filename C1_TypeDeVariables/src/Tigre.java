
public class Tigre extends Mammifere {
	
	private int nbPatte;
	
	public Tigre() {
		super("tigre sauvage",120f,1.5f);
		setNbPatte(4);
		
	}

	public Tigre(String nom, float poids, float taille) {
		super(nom, poids, taille);
		setNbPatte(4);
	}

	@Override
	public String seDeplacer() {
		
		return "bondissement";
	}
	


	}


	

	
		
	


