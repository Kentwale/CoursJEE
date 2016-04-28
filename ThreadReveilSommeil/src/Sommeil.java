import java.text.DecimalFormat;

public class Sommeil extends Thread {

	@Override
	public void run() {
		Reveil reveil = new Reveil();
		reveil.start();

		long t = System.nanoTime();
		for (int i = 0; i < 10; i++) {
			synchronized (reveil) {
				try {
					reveil.wait();
				} catch (InterruptedException e) {
				}
				System.out.println("J'ai dormis" + difToString(t, System.nanoTime()));
				t = System.nanoTime();

			}
		}
		reveil.sortie = true;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Arret du processus");
	}

	private String difToString(long avant, long apres) {
		double dif = ((double) apres - avant) / 1000000;
		DecimalFormat df = new DecimalFormat("#####.00");
		return df.format(dif) + "ms";

	}
}
