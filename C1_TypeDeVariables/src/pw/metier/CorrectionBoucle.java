package pw.metier;

public class CorrectionBoucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pas = 0.5f;
		float valeurMini = 1.5f;
		float valeurMaxi = 5f;
		float lng = 4f;
		int etage = 1;
		if (lng < valeurMini) {
			System.out.println("peux pas ranger");
		} else if (lng > valeurMaxi) {
			System.out.println("rdc");
		} else {
			for (float i = valeurMini; i < valeurMaxi + pas; i += pas) {
				etage = (int) (i / pas - 2);
				if (lng >= i && lng > i + pas) {
					System.out.println(" véhicule à étage " + etage);
					break;
				}
			}
		}
	}

}
