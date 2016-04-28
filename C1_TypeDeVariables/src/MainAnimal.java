import javax.swing.plaf.synth.SynthSpinnerUI;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainAnimal heritage = new MainAnimal();
		heritage.init();
	}

	private void init() {
		Tigre tigre1=new Tigre ("animal inconnu",35f,0.7f);//Animal animal = new AnimalTigre tigre=new Tigre;
		Tigre tigre=new Tigre();
		tigre.setNom("Tigrou");
		System.out.println(tigre.getNbPatte());
		System.out.println("mon mode de déplacement est "+tigre.seDeplacer());
		System.out.println(tigre.getTaille());
		
		//Chimere animal2= new Chimere("dragon inconnu",850f,9.1f);
		Dragon dragon=new Dragon();
		System.out.println(dragon.getNbAile()+" "+dragon.getNbAile()+" "+dragon.getNbPatte()+" "+dragon.getNom());
		Animal tigre2=new Tigre();
		System.out.println(tigre2.seDeplacer());
	}
}

