package beans;

public class SocieteDev implements Deve {

	public Develop chefDevelop(String nom, int anneesExperience){
		return new Develop(nom, anneesExperience);
		
	}
	public Develop develop (String nom, int anneesExperience){
		return new Develop(nom, anneesExperience);
}
}
