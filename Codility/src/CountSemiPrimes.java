import java.util.ArrayList;
import java.util.Collections;

public class CountSemiPrimes {

	public static void main(String[] args) {
		CountSemiPrimes p = new CountSemiPrimes();
		p.init();

	}

	private void init() {
		int N = 26;
		int[] P = { 1, 4, 16 };
		int[] Q = { 26, 10, 20 };
		int[] tab = solution(N, P, Q);
	}

	public int[] solution(int N, int[] P, int[] Q) {
		int[] p = new int[P.length];

		ArrayList<Integer> premier = new ArrayList<Integer>();
		for (int i = 1; i <= N; i++) {
			boolean bool = false;
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					bool = true;
					// System.out.println("pas nombre premier"+i);
					break;
				}
			}
			if (bool == false) {
				premier.add(i);
				// System.out.println(i);
			}
		}
		System.out.println(premier);

		ArrayList<Integer> semiPremier = new ArrayList<Integer>();
		for (int i = 1; i < premier.size(); i++) {
			int valI = premier.get(i);
			for (int j = i; j < premier.size(); j++) {
				int valJ = premier.get(j);
				semiPremier.add(valI * valJ);

			}

		}
		Collections.sort(semiPremier); //pour les classer
		System.out.println(semiPremier);

		for (int i = 0; i < P.length; i++) {
			for (Integer sp : semiPremier) {
				if (P[i]<= sp && Q[i]>= sp) {
					p[i]++;
					
				}
				
			}
			
		}for (int j = 0; j < p.length; j++) {
			System.out.println(p[j]);
		}
		
		
		
		
		
		return p;

	}

}