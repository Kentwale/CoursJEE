
public class MaxProfit {

	public static void main(String[] args) {
		MaxProfit e = new MaxProfit();

		e.init();

	}

	public void init() {
		MaxProfit e = new MaxProfit();
		int[] A = { 23171, 21011, 21123, 21366, 21013, 21367 };
		// System.out.println(e.solution(A));

	}

	class Solution {
		public int solution(int[] A) {
			if(A.length == 1 || A.length == 0){
		        return 0;
		    }
		    
		    int maxSoFar = 0;
		    int maxEndingHere = 0;
		    int minPrix = A[0];
		    
		    for(int i = 1; i < A.length; i++){
		        maxEndingHere = Math.max(0, A[i] - minPrix);
		        minPrix = Math.min(minPrix, A[i]);
		        maxSoFar = Math.max(maxEndingHere, maxSoFar);
		    }
		    
		    return maxSoFar;
		}

		}
	}

