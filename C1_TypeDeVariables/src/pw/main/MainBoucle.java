package pw.main;
public class MainBoucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lng = 5;
		if (lng == 2) {
			System.out.println("Je range mon v�hicule dans l'�tage 1");
		} else if (lng == 3) {
			System.out.println("Je range mon v�hicule dans l'�tage 2");
		} else if (lng == 4) {
			System.out.println("Je range mon v�hicule dans l'�tage 3");
		} else if (lng == 5) {
			System.out.println("Je range mon v�hicule dans l'�tage 4");
		} else if (lng == 6) {
			System.out.println("Je range mon v�hicule dans l'�tage 5");
		} else if (lng == 7) {
			System.out.println("Je range mon v�hicule dans l'�tage 6");
		} else if (lng == 8) {
			System.out.println("Je range mon v�hicule dans l'�tage 7");
		}
		for (int indice = 2; indice < 7; indice++) {
			if (lng == indice) {
				int etage = indice - 1;
				System.out.println("Je range mon v�hicule � l'�tage " + etage);
			}

		}

	}
}
