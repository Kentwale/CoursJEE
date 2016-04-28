package vdd.exosimple;

public class ThreadPatrick implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("ça va trop vite");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().isAlive());
		System.out.println("Fin de mon Run");
	}

}
