package PassingCars;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PassingCarsTest {

	PassingCars passingCars;

	@Before
	public void before() {
		passingCars = new PassingCars();
	}

	@Test
	public void test() {
		int[] A = { 0, 1, 0, 1, 1 };
		int reponse = passingCars.solution(A);
		assertEquals(5, reponse);
	}

	@Test
	public void single1() {
		int[] A = { 1 };
		int reponse = passingCars.solution(A);
		assertEquals(0, reponse);
	}

	@Test
	public void single2() {
		int[] A = { 0 };
		int reponse = passingCars.solution(A);
		assertEquals(0, reponse);
	}

	@Test
	public void double1() {
		int[] A = { 0, 1 };
		int reponse = passingCars.solution(A);
		assertEquals(1, reponse);
	}

	@Test
	public void double2() {
		int[] A = { 1, 0 };
		int reponse = passingCars.solution(A);
		assertEquals(0, reponse);
	}

	@Test
	public void double3() {
		int[] A = { 1, 1 };
		int reponse = passingCars.solution(A);
		assertEquals(0, reponse);
	}

	@Test
	public void double4() {
		int[] A = { 0, 0 };
		int reponse = passingCars.solution(A);
		assertEquals(0, reponse);
	}

	@Test
	public void simple() {
		int[] A = { 0, 1, 0, 1, 1, 0, 1, 1, 0, 1 };
		int reponse = passingCars.solution(A);
		assertEquals(15, reponse);
		int[] B = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		reponse = passingCars.solution(B);
		assertEquals(0, reponse);
	}

	@Test
	public void small_random() {
		int[] A = new int[100];

		for (int i = 0; i < A.length; i++) { //on remplit le tableau de 111111...
			A[i] = 1;
		}
		for (int i = 0; i < 5; i++) {
			A[(int) (Math.random() * A.length)] = 0; // on met 5 zeros de manière aléatoire
		}
		int resultatVrai = solution(A); // est notre solution, notre formule (en dessous)
		int resultatAVerifier = passingCars.solution(A); // solution de la personne qui rentre la formaule
		assertEquals(resultatVrai, resultatAVerifier);
	}

		int solution(int A[]) {
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
