

public class cyclicRotation {
	public static void main(String[] args) {
		cyclicRotation b = new cyclicRotation();
		b.init();
	}

	private void init() {
		int[] a={3, 8, 9, 7, 6};
		affTab(solution(a, 3));
	}

	public int[] solution(int[] A, int K) {
		int []resultat= new int[A.length];
		//int z=0;
		
		//while(z!=K){
		
		for (int i = 0; i < resultat.length; i++) {
			resultat[(i+K)%A.length]=A[i];
		}
		return resultat;
	}
	
	
	public void affTab(int[] t){
		System.out.print("[");
		for (int i = 0; i < t.length; i++) {
			System.out.print(t[i]);
			if (i < t.length-1) {
				System.out.print(" ,");
			}
		}
		System.out.println("]");
	}
}



