package pw.metier;
public class ExerciceBoucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float longueur = 5f;
		for (float t = 1.50f; t < 6f; t = t + 0.5f) {
			if (longueur == t) {
				int etage = (int) t;
				System.out.println("Véhicule etage " + etage);
			} else if (longueur > 5) {
				System.out.println("limousine au rez de chausssée");
			} else if (longueur < 1.5) {
				System.out.println("c'est un vélo");
			}
		}
		
	}

}
