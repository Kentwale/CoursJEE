package pw.main;


public class MainType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 0x7F;
		byte b = 1;
		int c = a + b;
		System.out.println(c);
		int d = 5;
		int e = c + d;
		System.out.println(c + " + " + d + " = " + e);
		int f = 0x7FFFFFFF;
		System.out.println(f);
		f++;
		System.out.println(f);
		int g = 100;
		int h = 7;
		float i = 2.4f;
		float j = g / h * i;
		System.out.println(j);
		int l = g / h;
		System.out.println(l);
		float m = l * i;
		System.out.println(m);
		float k = i * g / h;
		System.out.println(k);

		if (k > j) {
			System.err.println("C'est pas top mais c'est normal");
		} else {
			System.out.println("C'est bon");
		}
		float n = g;
		n = n / h * i;
		System.out.println(n);

		int o = 15;
		int entiere = o / 7;
		int reste = o - entiere * 7;
		System.out.println("partie entiere = " + entiere + " reste = " + reste);
		int rest = o % 7;
		System.out.println("rest = " + rest);
		double p = (100l + 12) / 3d;
		System.out.println(p);
		boolean vrai = true;
		boolean faux = false;
		boolean resultat = vrai & faux;
		System.out.println(resultat);
		boolean resultat2 = vrai | faux;
		System.out.println(resultat2);
		int q = 0xF0;
		int r = 0x0F;
		int s = q | r;
		System.out.println(s);
		char t = 'é';
		int u = t + 1;
		System.out.println(t + " " + u);
		char v = '\u0061';
		System.out.println(v);
		if (!(51 < 4d) && 7 < 12f) {
			System.out.println("OK");
		}
		double w = 100d / 3d;
		float x = 100f / 3f;
		if (w == x) {
			System.out.println("C'est ok");
		} else {
			System.out.println("Ce n'est pas ok");
		}
		boolean y = w == x;

		System.out.println(y);

		float z = ((float) g) / h * i;
		System.out.println(z);

		int titi = 12;
		if (titi == 12) {
			int toto = 5;
			System.out.println(toto + " " + titi);
		}
		System.out.println(titi);

		int longueur = 3; // unité en mètre
		switch (longueur) {
		case 2:
			System.out.println("ranger le véhicule dans l'étage 0");
			break;
		case 3:
			System.out.println("ranger le véhicule dans l'étage 1");
			break;
		case 4:
			System.out.println("ranger le véhicule à l'étage 2");
			break;
		default:
			System.out.println("je ne peux pas prendre le véhicule");
			break;
		}
		if (longueur == 2){
			System.out.println("ranger le véhicule dans l'étage 0");
		} else if (longueur == 3){
System.out.println("ranger le véhicule dans l'étage 1");
System.out.println("ranger le véhicule dans l'étage 2");
	} else if (longueur == 4) {
	System.out.println("ranger le véhicule dans l'étage 2 et 3");
	} else { // Default
		System.out.println("je ne peux pas prendre le véhicule");
	
		}
	}
}
