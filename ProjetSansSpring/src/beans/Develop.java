package beans;

public class Develop {
	private String nom;
	private int anneesExperience;
	
	public Develop(String nom, int anneesEperience){
		this.nom=nom;
		this.anneesExperience=anneesEperience;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAnneesExperience() {
		return anneesExperience;
	}

	public void setAnneesExperience(int anneesExperience) {
		this.anneesExperience = anneesExperience;
	}
	

}
