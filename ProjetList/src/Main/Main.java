package Main;

import metier.Parking;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.init();

	}

	public void init() {
		Parking p = new Parking(8, 200); // 8 étages
	}
}
