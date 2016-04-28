import java.util.ArrayList;

public class FibFrog {

	public static void main(String[] args) {
		FibFrog fib = new FibFrog();
		fib.init();

	}

	private void init() {
		int[] A = { 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0 };
	}

	public int solution(int[] A) {

		int cpt = 0;
		int[] fibonnacci = new int[A.length + 1];
		fibonnacci[0] = 1;
		fibonnacci[1] = 1;

		for (int i = 2; i < fibonnacci.length; i++) {
			fibonnacci[i] = fibonnacci[i - 1] + fibonnacci[i - 2];

			int pos = -1;
			while (pos % (A.length + 1) != (A.length + 1)) {
				if (A[i] == 1) {
					if (fibonnacci[i - 1] == i && fibonnacci[i - 1] > 0) {
						cpt++;
						A[i] = pos;
					} else if (fibonnacci[i - 1] != i) {
						return pos;
					}
				}
				return pos;

			}

		}

		return cpt;

	}

	public int solution2(int[] A) {
		int res = 0;
		ArrayList<Integer> f = creFib(A.length);
		ArrayList<Integer> pos0 = new ArrayList<>();
		pos0.add(-1);
		ArrayList<Integer> posTrouvee = null;
		while (pos0.size() > 0) {
			res ++;
			posTrouvee = rechercherPosPossible(f, A, pos0);
			if (posTrouvee.get(posTrouvee.size() - 1) == A.length) {
				// Arrivée
				System.out.println("je suis arrivé");
				res++;
				break;
			} else {
				// charger
				pos0.clear();
				pos0.addAll(posTrouvee);
				posTrouvee.clear();

			}
		}
		return res;

	}

	public ArrayList<Integer> rechercherPosPossible(ArrayList<Integer> f, int[] A, ArrayList<Integer> pos0) {
		ArrayList<Integer> pos = new ArrayList<Integer>();
		// partir de toutes les possitons actuelles
		sortie: for (Integer posDebut : pos0) {
			// rechercher suivant la suite de fibonacci les sauts possibles
			for (Integer nbFibonacci : f) {
				int saut = posDebut + nbFibonacci;
				if (A[saut] == 1) {
					pos.add(saut);

				} else {
					if (saut == A.length) {
						pos.add(saut);
						break sortie;
					} else {
						break;
					}
				}

			}

		}
		return pos;

	}

	// méthode
	public ArrayList<Integer> creFib(int len) {
		ArrayList<Integer> f = new ArrayList<Integer>();
		int v1 = 1; // v1 = N-2
		int v2 = 2; // v2= N-1
		f.add(v1);
		f.add(v2);
		int v3 = v1 + v2; // v3 = N
		while (v3 <= len) {
			f.add(v3);
			v1 = v2;
			v2 = v3;
			v3 = v1 + v2;
		}
		return f;
	}
}
