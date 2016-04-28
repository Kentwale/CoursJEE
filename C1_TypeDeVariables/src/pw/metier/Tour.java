package pw.metier;

public class Tour {
	
	private String nom;
	private Lego1[] maTour;
	private Lego1 legoType;
	public Tour() {
	}
	
	public Tour(String nom, Lego1 legoType){
		this.nom=nom;
		this.legoType=legoType;
		this.maTour=new Lego1[1000];
		for(int i=0;i<maTour.length;i++){
			//Lego1 leLego=new Lego1(legoType.getHauteur(),legoType.getNbreDePicotLng(),legoType.getNbreDePicotLarg(), legoType.getCouleur()); 
		
			Lego1 leLego=new Lego1(legoType);
			
			maTour[i]=leLego;
		}
	
	}

	public Lego1[] getMaTour() {
		return maTour;
	}

	public void setMaTour(Lego1[] maTour) {
		this.maTour = maTour;
	}
	public String getNom() {
		return nom;
	
	}
	public void setNom(String nom) {
		this.nom = nom;
	}


	}

