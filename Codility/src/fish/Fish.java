package fish;

import java.util.ArrayList;

public class Fish {
	public static void main(String[] args) {
		Fish a = new Fish();
		a.init();

	}

	private void init() {
		int[] a = { 4, 3, 2, 1, 5 };
		int[] b = { 0, 1, 0, 0, 0 };
		System.out.println(solution(a, b));
	}

	public int solution(int A[], int B[]) {
		int[] tabDown = new int[A.length];
		int nbre = 0;
		int nbreVivantUp = 0;
		for (int i = 0; i < A.length; i++) {
			if (B[i] == 0 && nbre == 0)
				nbreVivantUp++;
			else if (B[i] == 0 && nbre != 0) {
				while (nbre != 0 && A[i] > tabDown[nbre - 1])
					nbre--;

				if (nbre == 0)
					nbreVivantUp++;
			} else {

				tabDown[nbre++] = A[i];
			}
		}

		return nbreVivantUp + nbre;
	}

	public int solution2(int A[], int B[]) {
		int r = 0;
		ArrayList<Integer> pile = new ArrayList<Integer>();
		for (int i = 0; i < B.length; i++) {
			if (B[i] == 0) {
				r++;
				for (int j = pile.size() - 1; j >= 0; j++) {
					if (A[pile.get(j).intValue()] > A[i]) {
						r--;
						break;
					} else if (A[pile.get(j).intValue()] < A[i]) {
						r--;
						pile.remove(pile.size() - 1);
					}
				}
			} else {
				r++;
				pile.add(i);
			}

		}
		return r;
	}
}
