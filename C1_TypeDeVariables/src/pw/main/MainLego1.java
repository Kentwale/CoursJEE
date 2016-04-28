package pw.main;

import pw.metier.Lego1;

public class MainLego1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainLego1 mainLego = new MainLego1();
		mainLego.init();
	}

	private void init() {
		// TODO Auto-generated method stub
		Lego1 monLego1 = new Lego1();
		Lego1 monLego2 = new Lego1("rouge", 6f, 1.5f, 0.2f, 8, 2);
		Lego1 monLego3 = new Lego1("blanc", 6f, 1.5f, 0.2f, 8, 2);

		float valeur = monLego2.calculDim(monLego2.getNbreDePicotLarg()); // valeur
																			// est
																			// la
																			// valeur
																			// récupéré

		System.out.println(valeur);

		// monLego2.calculDim (monLego2.nbreDePicotLarg);
		// monLego2.calculDim(monLego2.nbreDePicotLng);

		// System.out.println(monLego2.calculDim (monLego2.nbreDePicotLng));
		// monLego1.calculDim(12);
		// float la=monLego1.getLargeur();

		Lego1[] tour = new Lego1[100];
		for (int i = 0; i < tour.length; i++) { // tour.length est une
												// propriété; équivalent à 100
			Lego1 monLego = new Lego1();
			tour[i] = monLego; // on aurait pu écrire seulement boucle (for..)
								// puis tour [i] = new Lego1();
		}
		Lego1[] tour3 = tour;
		tour3[1].setNbreDePicotLng(8);
		// Lego1[] tour2={new Lego1(), new Lego1().. 100 fois}
		System.out.println(tour3.length);
		System.out.println(tour[2]);

		String tabCouleur[] = { "rouge", "bleu", "vert", "jaune", "noir", "blanc" };
		int[] tableauCpt = new int[tabCouleur.length]; // tabCouleur. length est
														// = à 6

		for (int j = 0; j < tour.length; j++) {
			Lego1 lego = tour[j];
			int indiceCouleur = (int) (Math.random() * tabCouleur.length); // tabCouleur.length
																			// est
																			// égale
																			// à
																			// 5
																			// ;
																			// cet
																			// indice
																			// couleur
																			// est
																			// aléatoire
			String couleurAleatoire = tabCouleur[indiceCouleur];
			lego.setCouleur(couleurAleatoire); // équivalent à
												// tour[j].setCouleur(couleurAleatoire)

			int compteur = tableauCpt[indiceCouleur];
			compteur++; // on incrémente
			tableauCpt[indiceCouleur] = compteur; // on met les valeurs du
													// tableau dans le compteur

		}
		int cptMax = 0;
		for (int k = 0; k < tableauCpt.length; k++) {
			System.out.print(tableauCpt[k] + " ");
			int compteur = tableauCpt[k];
			if (compteur > cptMax) {
				cptMax = compteur;
				System.out.print(tableauCpt[k]);
				System.out.print(tableauCpt[k] + "legos" + tabCouleur[k]);
			}
		}
		Lego1[][] tourCouleur = new Lego1[tabCouleur.length][cptMax]; // deux
																		// dimensions
																		// :
																		// nbre
																		// de
																		// tours(par
																		// couleur)
																		// et
																		// nombre
																		// de
																		// legos
		for (int j = 0; j < tour.length; j++) {
			Lego1 lego = tour[j];
			String couleur = lego.getCouleur();
			int indiceCouleur = -1;
			for (int k = 0; k < tabCouleur.length; k++) {
				String couleurDuTableau = tabCouleur[k];
				if (couleur.equals(couleurDuTableau)) {
					indiceCouleur = k;

					break;
				}

				// tourCouleur[indiceCouleur][]

			}
			for (int l = 0; l < tourCouleur[0].length; l++) {
				Lego1 legoLass = tourCouleur[indiceCouleur][l];
				if (legoLass == null) { // == et non .equals car null n'est pas
										// un objet
					tourCouleur[indiceCouleur][l] = lego;
					break;
				}
			}

		}
		for (int m = 0; m < tourCouleur.length; m++) {
			for (int m2 = 0; m2 < tourCouleur[0].length; m2++) {
				Lego1 legoLass = tourCouleur[m][m2];
				if (legoLass != null) {
					System.out.print(legoLass.getCouleur().substring(0, 1));
				} else {
					break; // le break ne sort pas du else, car else n'est
							// pas une boucle comme un if ou un switch ;
							// pour en sortir, on fait "label for ......
							// break label;"
				}
			}
			System.out.println(""); // on répète la première lettre de la
									// couleur
		}

		// float xxx=monLego1.toto();
		// float yyy=monLego2.toto();

		// float valeur2=monLego2.calculNbreDePicot(monLego2.largeur);
		// float valeur3=monLego2.calculNbreDePicot(monLego2.longueur);
		// System.out.println("sur la largeur "+valeur2);
		// System.out.println("sur la longueur "+valeur3);
		// System.out.println(monLego2.calculNbreDePicot(1f));
	}

}
