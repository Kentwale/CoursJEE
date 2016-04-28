import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Flux {

	public static void main(String[] args) {
		Flux flux = new Flux();
		flux.init();

	}

	public void init() {
		File rep = new File("C://DevFormation/workspace/Flux/donnees");
		System.out.println(rep.getAbsolutePath());
		File re = new File("./donnees");
		// ./ correspond au répertoire courant ; ../ pour le répertoir parent
		System.out.println(re.getAbsolutePath() + " " + re.exists());
		System.out.println("------------------");
		if (re.isDirectory()) {
			String[] ls = re.list();

			for (int i = 0; i < ls.length; i++) {
				/*
				 * if(ls[i].endsWith(".txt")){ System.out.println(ls[i]); }
				 */

				System.out.println(ls[i]);
			}

		}
		if (re.isDirectory()) {
			System.out.println("**************");
			aff2(re);
		}
		aff4(re);
		System.out.println("*-*-*-*-*-*-*-*");
	}

	public void aff4(File re) {
		String[] lr = re.list();
		for (int i = 0; i < lr.length; i++) {
			String nomDuFichier = re.getAbsolutePath() + "/" + lr[i];
			File file = new File(nomDuFichier);
			if (file.isFile()) {
				if (lr[i].endsWith(".txt")) {
					System.out.println("--------1");
					System.out.println("par ici : " + lr[i]);
					System.out.println("------------------");
				}
				System.out.println(lr[i]);
			} else {
				aff4(file);
			}
		}

	}

	public void aff3(File re) {
		String[] ls = re.list();
		for (int i = 0; i < ls.length; i++) {
			File file = new File(re.getAbsolutePath() + "/" + ls[i]);
			if (file.isFile()) {
				System.out.println(file.getAbsolutePath());
			} else {
				aff3(file);
			}
		}
	}

	public void aff2(File re) {
		File[] lf = re.listFiles();
		for (int i = 0; i < lf.length; i++) {
			if (lf[i].isFile()) {
				if (lf[i].getName().toLowerCase().endsWith(".txt")) {
					System.out.println(lf[i].getName());
					System.out.println("----11----11----11");
					FileReader fr = null; // habitude à prendre
					BufferedReader bIn = null;

					try {
						fr = new FileReader(lf[i]);
						bIn = new BufferedReader(fr);

						String chaine = bIn.readLine();
						while (chaine != null) {

							System.out.println(chaine + " /////par là");
							chaine = bIn.readLine();
						}
						System.out.println("///////////////////////");
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							fr.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

				}

			} else {
				aff2(lf[i]);

			}
		}

	}
	// toujours utiliser adressage relatif pour compatibilité entre les
	// différents disques durs et sys exploitation

	public void aff1(File re) {
		// File re = new File("./donnees");
		File[] lf = re.listFiles();
		for (int i = 0; i < lf.length; i++) {
			if (lf[i].isFile()) {
				System.out.println(lf[i].getName());
			} else {
				System.out.println(".......................");
				File[] lf2 = re.listFiles();
				for (int j = 0; j < lf2.length; j++) {
					if (!lf2[j].isDirectory()) {
						System.out.println(lf2[j].getName());

					}
				}
			}

		}
	}
}
