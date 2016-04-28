package PassingCars;

public class PassingCars {
	
	public static void main(String[] args) {
		PassingCars a=new PassingCars();
		a.init();
		
	}
	private void init(){
	
	int[] b={0,1,0,1,1};
	System.out.println(solution(b));
	}

	public int solution(int A[]) {
		int condition1 = 0;
		int passage = 0;
		int j = 1000000000;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				condition1++;
			} else if (A[i] == 1) {
				passage += condition1;
			}
			if (passage > j) {
				return -1;

			}

		}
		return passage;
	}
}
