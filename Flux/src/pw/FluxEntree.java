package pw;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class FluxEntree {

	public static void main(String[] args) {
		FluxEntree f = new FluxEntree();
		f.init();
	}

	public void init() {
		InputStreamReader entreeStandard = new InputStreamReader(System.in); // system
																				// in
																				// est
																				// le
																				// périphérique
																				// //
																				// d'entrée
		LineNumberReader resLecture = new LineNumberReader(entreeStandard);
		String chemin =null;
		PrintWriter out=null;
		try {
			chemin = resLecture.readLine();

			File file = new File(chemin);
			String nomFichierDestinataire = "resultat";
			File resultat = new File("./" + nomFichierDestinataire);
			System.out.println(resultat.getAbsolutePath());
			out = new PrintWriter(resultat);

			if (file.exists()) {
				if (file.isDirectory()) {
					System.out.println(file.getAbsolutePath());
					System.out.println("c'est un repertoire; existe; je peux commencer recherche");
					String nomDuSuffixe = resLecture.readLine();
					System.out.println(nomDuSuffixe);
					rechercherLesFichiers(chemin, nomDuSuffixe, out);
				} else {
					System.out.println("c'est un fichier; ne peut commencer mon programme (erreur)");
				}
			} else {
				System.out.println("n'existe pas; ne peux commencer");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.flush();
		out.close();
	}

	private void rechercherLesFichiers(String chemin, String nomDuSuffixe, PrintWriter out) {
		File file = new File(chemin);
		File[] tabFichier = file.listFiles();
		for (File f : tabFichier) {
			if (f.isDirectory()) {
				System.out.println("c'est un repertoire" + f.getAbsolutePath());
				rechercherLesFichiers(f.getAbsolutePath(), nomDuSuffixe, out);// recursivité
			} else {
				if (f.getName().toLowerCase().endsWith(nomDuSuffixe.toLowerCase())) {
					System.out.println("j'ai trouvé ce fichier : " + f.getName());
					FileReader reader = null;
					BufferedReader buf = null;
					try {
						reader = new FileReader(f);
						// LineNumberReader line = new LineNumberReader(reader);
						buf = new BufferedReader(reader);
						String chaine = buf.readLine();

						while (chaine != null) {
							mettreLigneDansLeFichierDestinataire(chaine, out);
							chaine = buf.readLine();

						}

					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							reader.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					out.flush();
				}
			}

		}
	}

	private void mettreLigneDansLeFichierDestinataire(String readLine, PrintWriter out) {
		out.println(readLine);

	}
}

/*
 * System.out.println(s); } String nomDuRepertoireRacine = "./"+chemin; File
 * repertoireRacine=new File (nomDuRepertoireRacine); }
 * 
 * 
 * 
 * File f = new File("./Test.txt"); PrintWriter out = new PrintWriter(f);
 * out.println("TOTO"); out.close(); }
 * 
 * } }
 */
