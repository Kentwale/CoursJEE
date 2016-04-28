package vdd.binarygap;

public class BinaryGap {

	public static void main(String[] args) {
		BinaryGap b = new BinaryGap();
		b.init();

	}

	private void init() {
		System.out.println(solutionString(137));
		System.out.println(solutionAlgo(137));
		System.out.println(solution3(137));
		System.out.println(solution4(137));
		System.out.println(solution5(137));
		System.out.println(solution6(137));// N est égale à 17
	}

	public int solutionString(int N) {
		int n = 0;
		String s = Integer.toBinaryString(N);
		s = s.replace("0", " "); // on transforme les 0 en blanc
		s = s.trim();
		String[] ls = s.split("1"); // transforme chaine de carractère en
									// tableau séparé par une valeur
		for (int i = 0; i < ls.length; i++) {
			n = Math.max(ls[i].length(), n);
		}
		System.out.println(s);
		// for (int n = 1; n<N; n++){
		// System.out.println(Integer.toBinaryString(N));
		// }
		return n;
	}

	public int solutionAlgo(int N) {
		int n = 0;
		int cpt = 0; // compteur, ne démarre qu'à 1
		boolean demare = false;
		while (N > 0) {
			int reste = N % 2;
			if (reste == 1) {
				if (!demare) { // if non demare
					n = 0;
					demare = true; // et remet compteur à 0 (cpt=0 plus bas)
				} else {
					n = Math.max(n, cpt);
				}
				cpt = 0;
			} else {
				cpt++;
			}
			N = N / 2;
		}
		return n;
	}

	public int solution3(int N) {
		int n = 0;
		String s = Integer.toBinaryString(N);
		int i = 0;
		for (i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("1")) {
				break;
			}
		}
		int cpt = 0;
		for (int j = i + 1; j < s.length(); j++) {
			if (s.substring(j, j + 1).equals("0")) {
				cpt++;
			} else {
				if (cpt > n) {
					n = cpt;
				}
				cpt = 0;
			}
		}
		return cpt;
	}

	public int solution4(int N) {
		int n = 0;
		String s = Integer.toBinaryString(N);
		String comp = "0";
		for (int i = 0; i < 29; i++) {
			if (s.contains(comp)) {
				n++;
			} else {
				break;
			}
			comp += "0";

		}
		return n;
	}

	public int solution5(int N) {
		int n = 0;
		String s = Integer.toBinaryString(N);
		int deb = s.indexOf("1");
		int suivant = deb;
		boolean sortir = false;
		while (!sortir) {
			suivant = s.indexOf("1", deb + 1);
			if (suivant < 0) {
				sortir = true;
			} else {
				int val = (suivant - deb - 1);
				if (n < val) {
					n = val;
				}
			}
			deb = suivant;
		}
		return n;
	}

	public int solution6(int N) {
		int n = 0;
		String s = Integer.toBinaryString(N);
		s = s.replace("0", " ");
		s = s.trim();
		int lng = s.length();
		while (lng > 1) {
			s = s.substring(1, s.length());
			s = s.trim();
			n = Math.max(n, lng - s.length() - 1);
			lng = s.length();
		}
		return n;
	}
}
