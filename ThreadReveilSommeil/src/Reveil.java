import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reveil extends Sommeil {
	public boolean sortie;

	public void run() {
		InputStreamReader entreeStandard = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(entreeStandard);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while (!sortie) {
			System.out.println("Appuyer sur Entrer");
			
			try {
				buf.readLine();
				System.out.println("Debout !");
				synchronized (this) {
					notify();
				}
			} catch (IOException e) {
				break;
			}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
			
			}
		System.out.println("Fin de reveil");
		}
//	public boolean isSortir(){
	//	return sortir;
	}

	


