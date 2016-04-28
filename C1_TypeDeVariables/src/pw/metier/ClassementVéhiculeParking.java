package pw.metier;
public class ClassementVéhiculeParking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valeurAleatoire = Math.random();
		int nbreVehicule = 1000;
		int[][] parking = new int[9][200];

		float pas = 0.5f;
		float valeurMini = 1.5f;
		float valeurMaxi = 5f;
		float lng = 3.1f;
		int etage = 1;
		float[] vh = { 1.6f, 2.1f, 1.8f, 1.9f };
		int cpt1 = 0;// cpt1 nbre de voiture dans etage 1
		int cpt2 = 0;// cpt nbre de voiture dans etage 2
		int[] cpt = new int[9]; // tableau des compteur
		

		for (int k = 0; k < vh.length; k++) {
			lng = vh[k];
			int etageSelectionne = -1;
			if (lng < valeurMini) {
				etageSelectionne = -1;
			} else if (lng > valeurMaxi) {
				etageSelectionne = 0;
			} else {
				for (float i = valeurMini; i < valeurMaxi + pas; i += pas) {
					etage = (int) (i / pas - 2);
					if (lng >= i && lng < i + pas) {
						etageSelectionne = etage;
						break;
					}
					
				}

			}
			System.out.println("lng = " + lng + " = " + etageSelectionne);
			if (etageSelectionne == 1) {// ou ceci
				cpt1++;
				cpt[1]++;// compteur de 1 (dans indice)
			}
			if( etageSelectionne == 2){
				cpt2++;
				cpt[2]++;
			}
			for (int i = 0; i < cpt.length; i++) { // ou cela ;alternative à if cpt1 puis if cpt2 ...)
				if (etageSelectionne == i){
					cpt[i]++;
				}
			}
		}
		System.out.println(cpt[1]);
		System.out.println(cpt[2]);
	}

}
