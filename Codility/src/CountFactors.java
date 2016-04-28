
public class CountFactors {

	public static void main(String[] args) {
		CountFactors f = new CountFactors();
		f.init();

	}

	public void init() {
		CountFactors f = new CountFactors();
		int N = 24;
		// System.out.println(f.solution(N));

	}

	class Solution {
		public int solution(int N) {
			int cpt = 0;
			//int[]tabCpt = new int[N];
			
			for (int i = 0; i <= N; i++) {
			
				for (int j = N; j >1; j--) {
				if (N / j == i) {
					cpt++;
				//	tabCpt[1]++;
					
					
				}
				}
		}
			return cpt;

		}
	}
	class Solution2 {
		public int solution(int N) {
			int cpt = 0;
			
			
			for (int i = 1; i <= N; i++) {
				//int j = N--;
				if (N %i == 0) {
					cpt++;
				
					
					
				}
				}

			return cpt;

		}
	}
}
