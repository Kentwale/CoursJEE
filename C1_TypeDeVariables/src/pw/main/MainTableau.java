package pw.main;
public class MainTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tableau1 = new int[12];
		int[] tableau2;
		tableau2 = new int[12];
		boolean[] tBoolean = new boolean[5];
		System.out.println(tBoolean[2]);
		int[] tableau3 = { 1, 2, 3, 4, 5, 6 };
		System.out.println(tableau3[2]);
		System.out.println(tableau3.length);
		System.out.print("tableau1 = {");
		for (int i = 0; i < tableau1.length; i++) {
			System.out.print(tableau1[i]);
			if (i < tableau1.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println((");"));

		for (int i = 0; i < tBoolean.length; i++) {
			tBoolean[i] = true;
		}
		for (int i = 0; i < tBoolean.length; i++) {
			System.out.print(tBoolean[i] + " ");

		}
		int[][] image = new int[4][5];
		System.out.println("");
		System.out.println("lg image " + image.length);
		System.out.println("lg image 2eme dimension " + image[0].length);
		System.out.println(image[1][2]);

		int[][] autre = { { 1, 2, 7 }, { 3, 4, 8 } };
		System.out.println(autre.length + " " + autre[0].length);
		System.out.println(autre[1][0]);

		for (int i = 0; i < autre.length; i++) {
			for (int j = 0; j < autre[0].length; j++) {
				System.out.print(autre[i][j] + ", ");
			}
			System.out.println(" ");
		}
		int[][] autres = { { 1, 2, 7 }, { 3, 4, 8 }, { 33, 44, 85 }, { 311, 24, 38 } };
		System.out.println(autres.length + " " + autres[0].length);
		System.out.println(autres[1][0]);
		System.out.println("--------------------");

		for (int i = 0; i < autres.length; i++) {
			int[] tab = autres[i];
			System.out.print(tab[0] + ", ");
			System.out.print(tab[1] + ", ");
			System.out.println(tab[2]);
			for (int j = 0; j < tab.length; j++) {
				System.out.print(tab[j]);
				if (j < tab.length - 1) {
					System.out.print("; ");
				}
			}
			System.out.println("");
		}
		double valeurAleatoire=Math.random();
		System.out.println(valeurAleatoire);
		valeurAleatoire=Math.random();
		System.out.println(valeurAleatoire);
		valeurAleatoire=Math.random();
		System.out.println(valeurAleatoire);
		valeurAleatoire=Math.random();
		System.out.println(valeurAleatoire);
		valeurAleatoire=Math.random();
		System.out.println(valeurAleatoire);
		valeurAleatoire=Math.random();
		System.out.println(valeurAleatoire);
		valeurAleatoire=Math.random();
		System.out.println(valeurAleatoire);
		
	}
}
