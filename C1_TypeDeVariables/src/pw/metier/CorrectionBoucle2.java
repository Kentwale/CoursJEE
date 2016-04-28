package pw.metier;
public class CorrectionBoucle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float lng = 3f;
		int etage = 1;
		if (lng < 1.5f){
		System.out.println("peux pas ranger");
		}else if (lng > 5){
			System.out.println("rdc");
	} else {
		for (float i = 1.5f; i < 5f; i += 0.5f) {
			etage = (int) (i / 0.5f - 2);
			if (lng >= i && lng > i + 0.5f) {
				System.out.println(" véhicule à étage " + etage);
				break;
			}
		}
		}
	}

}
