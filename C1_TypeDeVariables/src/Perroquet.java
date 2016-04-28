
public class Perroquet extends Mammifere {

		private int nbPatte;

		public Perroquet() {
			super("Perroquet sauvage",1f,0.3f);
			nbPatte=2;
			
		}

		public Perroquet(String nom, float poids, float taille) {
			super(nom, poids, taille);
			nbPatte=2;
		}

		public int getNbPatte() {
			return nbPatte;
		}

		public void setNbPatte(int nbPatte) {
			this.nbPatte = nbPatte;
		}

		@Override
		public String seDeplacer() {
			return "voler";
		}
		
}
