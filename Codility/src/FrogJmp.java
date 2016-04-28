

public class FrogJmp {

	public static void main(String[] args) {
		FrogJmp c = new FrogJmp();
		int n = c.solution(10, 85, 30);
		System.out.println(n);
	}

	int solution(int X, int Y, int D) {
		int distance = Y - X;
		int nbDeSaut = distance / D;

		if (distance % D > 0) {
			nbDeSaut++;

		}
		return nbDeSaut;
	}
}
