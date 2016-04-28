package vdd.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberInputStream;
import java.io.LineNumberReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import vdd.metier.marchand.Marchand;
import vdd.metier.produit.Alimentaire;
import vdd.metier.produit.Consommable;
import vdd.metier.produit.Produit;
import vdd.metier.stock.Stock;
import vdd.metier.stock.StockArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		// m.init();
		// m.save();
		// m.save2();
		// m.save3();
		// m.recup();
	//	m.saveMarchand();
		m.chargeXml();

	}

	private void chargeXml() {
		StockArrayList stock=null;
		File file=new File("donnees/stock.xml");
		BufferedReader buf= null;
		try {
			buf = new BufferedReader(new FileReader(file));
					String line = buf.readLine();
					while(line !=null){
						if (line.contains("<StockArrayList")){
							String nomStockCharge=extraitAtt(line,"nomStock='");
							stock = new StockArrayList();
							stock.setNomDuStock(nomStockCharge);
						}else if(line.contains("<Alimentaire")){
							String nomCharge=extraitAtt(line,"nom='");
							String poidsCharge=extraitAtt(line,"poids='");
							String prixUnitaireCharge=extraitAtt(line,"prixUnitaire='");
							float poidsC=Float.valueOf(poidsCharge).floatValue();
							float prixUnitaireC=Float.valueOf(prixUnitaireCharge).floatValue();
							Alimentaire a=new Alimentaire(nomCharge,poidsC,prixUnitaireC);
							stock.add(a);
							
						}else if(line.contains("<Consommable")){
							String nomCharge=extraitAtt(line,"nom='");
							String qteCharge=extraitAtt(line,"qte='");
							String prixUnitaireCharge=extraitAtt(line,"prixUnitaire='");
							int qteC=Integer.valueOf(qteCharge).intValue();
							float prixUnitaireC= Float.valueOf(prixUnitaireCharge).floatValue();
							Consommable c=new Consommable(nomCharge,qteC,prixUnitaireC);
							stock.add(c);
							
						}else if(line.contains("</StockArrayList>")){
							for (Produit produit : stock) {
								System.out.println(produit.toString());
							}
							
						}
						line = buf.readLine();
						
					}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				buf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public String extraitAtt(String line, String ch) { //ch correspond à nomStock='
		String res="";
		String newLine=line.replace("\"","'"); //tabulation, c'est \t
		int deb=newLine.indexOf(ch);
		int fin=newLine.indexOf("'",deb+ch.length());
		res=newLine.substring(deb+ch.length(),fin);
		return res;
	}

	private void saveMarchand() {
		Marchand marchand = new Marchand(0, 0, 200);
		marchand.setNomDuMarchand("Robert");
		for (int i = 0; i < 10; i++) {
			marchand.getStock().add(new Alimentaire("Aliment" + i, 2, i));
			marchand.getMonStockFamille().add(new Consommable("Aliment" + i, 2, i));
			marchand.getMonStockPrivee().add(new Alimentaire("Aliment" + i, 2, i));
		}
		File fMarchand = new File("marchand.ser");
		ObjectOutputStream o = null;
		try {
			o = new ObjectOutputStream(new FileOutputStream(fMarchand));
			o.writeObject(marchand);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				o.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void recup() {
		File file = new File("../../alimentaire.ser");
		if (file.exists()) {
			ObjectInputStream objIn = null;
			try {
				objIn = new ObjectInputStream(new FileInputStream(file));
				Alimentaire alimentaire = (Alimentaire) objIn.readObject();

				System.out.println(alimentaire.toString());
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	public void save2() {
		Alimentaire a = new Alimentaire("banane", 3.5f, 0.99f);
		File fileAlimentaire = new File("alimentaire.ser");
		ObjectOutputStream obj = null;
		try {
			obj = new ObjectOutputStream(new FileOutputStream(fileAlimentaire));
			obj.writeObject(a);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				obj.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void save() { // lit 1 nom, 2 type, 3 poid ou qte, 4 prix unitaire
		// si le nom = "" sortir du programme
		// afficher le stock

		InputStreamReader entreeStock = new InputStreamReader(System.in);
		LineNumberReader lectureStock = new LineNumberReader(entreeStock);
		StockArrayList monStock = new StockArrayList();
		try {
			System.out.println("Saisissez le nom");
			String nomDuProduit = lectureStock.readLine();
			while (!nomDuProduit.equals("")) {
				// System.out.println("Saisissez le prix");
				// String prixSaisi = lectureStock.readLine();
				System.out.println("Saisissez le type du produit (A: Aliment ou C: Consommable)");
				String typeDeProduitSaisi = lectureStock.readLine();
				boolean bool = controleSaisi(typeDeProduitSaisi);
				if (bool) {
					Produit nouveauProduit = null;
					if (typeDeProduitSaisi.equals("A")) {
						nouveauProduit = new Alimentaire();
						nouveauProduit.setNom(nomDuProduit);
						System.out.println("Saisissez le prix");

						String prixSaisi = lectureStock.readLine();
						System.out.println("Saisissez le poids");
						String poidsSaisi = lectureStock.readLine();
						nouveauProduit.setPoids(Float.valueOf(poidsSaisi).floatValue());
						nouveauProduit.setPrixUnitaire(Float.valueOf(prixSaisi).floatValue());
						monStock.add(nouveauProduit);
					} else if (typeDeProduitSaisi.equals("C")) {
						nouveauProduit = new Consommable();
						nouveauProduit.setNom(nomDuProduit);

						System.out.println("Saisissez le prix");
						String prixSaisi = lectureStock.readLine();
						System.out.println("Saisissez la quantité");
						String qteSaisi = lectureStock.readLine();
						nouveauProduit.setQte(Integer.valueOf(qteSaisi).intValue());
						nouveauProduit.setPrixUnitaire(Float.valueOf(prixSaisi).floatValue());
						monStock.add(nouveauProduit);
					}
				} else {
					System.out.println("erreur. Veuillez resaisire le nom");
					nomDuProduit = lectureStock.readLine();

				}
				/*
				 * for (int i = 0; i < monStock.size(); i++) { Produit p =
				 * monStock.get(i); System.out.println(p.toString());
				 * 
				 * }
				 */
			}
			for (Produit nouveauProduit : monStock) {
				if (nouveauProduit instanceof Alimentaire) {
					Alimentaire nouvelAliment = (Alimentaire) nouveauProduit;
					System.out.println(nouvelAliment.getNom() + " /Prix unitaire : " + nouvelAliment.getPrixUnitaire()
							+ " /Poids : " + nouvelAliment.getPoids() + " /PrixTotal : " + nouvelAliment.getPrix());
				} else if (nouveauProduit instanceof Consommable) {
					Consommable nouveauConsommable = (Consommable) nouveauProduit;
					System.out.println(nouveauConsommable.getNom() + " /Prix unitaire : "
							+ nouveauConsommable.getPrixUnitaire() + " /Qté : " + nouveauConsommable.getQte()
							+ " /PrixTotal : " + nouveauConsommable.getPrix());
				}

			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private boolean controleSaisi(String typeDeProduitSaisi) {
		boolean bool = false;
		if (typeDeProduitSaisi.equals("A") || typeDeProduitSaisi.equals("C")) {
			bool = true;

		}
		return bool;
	}

	public void init() {

		// System.out.println(Produit.CPT);
		Alimentaire banane = new Alimentaire("banane", 3.5f, 0.99f);
		// System.out.println(Produit.CPT);
		Consommable enveloppe = new Consommable("enveloppe", 50, 0.1f);
		// System.out.println(Produit.CPT);
		Produit fraise = new Alimentaire("fraise", 0.5f, 2.99f);

		// Produit[] stock= new Produit[100];
		// stock[0]= banane;
		// stock[1]=enveloppe;
		// stock[2]=fraise;

		// for (int i = 0; i < stock.length; i++) { // on peut faire tableau,
		// mais pour collectionner élément variable, mieux vaut utiliser liste
		// if(stock[i] != null){
		// if (stock[i] instanceof Alimentaire){
		// System.out.println(stock[i]);
		// }

		// }
		Alimentaire banane2 = new Alimentaire("banane", 12.3f, 1.03f);
		// Stock monStock= new Stock();
		Marchand unMarchand = new Marchand(0, 200f, 9f); // creation du marchand
		// unMarchand.getMonStockFamille().setLimitePrix(9f); // on force la
		// limite de prix à 9

		// Map
		TreeMap<String, Produit> stock = new TreeMap<String, Produit>();

		stock.put(banane.getNom(), banane);// treeMap.put("banane",banane);
		stock.put(enveloppe.getNom(), enveloppe);
		stock.put(fraise.getNom(), fraise);

		if (stock.containsKey(banane2.getNom())) {
			rajouteDansTreeMap(stock, banane2);
		}
		Set<Entry<String, Produit>> set = stock.entrySet(); // est
															// l'intercalaire,
															// est un entry
		for (Entry<String, Produit> entry : set) {
			System.out.println(entry.getValue());
		}
		Stock stock4 = new Stock();
		String maChaine = stock4.toString();
		System.out.println(stock.toString());

		System.exit(0);
		// }

		// treeMap.put(banane2.getNom(), banane2);

		// on utilise un héritage de ArrayList
		// ArrayList<Produit> stock = monStock.getMonStockFamille();/*new
		// ArrayList<Produit>();*/
		unMarchand.getMonStockFamille().add(banane);// on a une array list stock
													// qu'on a remplacé par
													// monStockFamille
		unMarchand.getMonStockFamille().add(enveloppe);// ArrayList devient
														// monStockFamille
		unMarchand.getMonStockFamille().add(fraise);// stock est contenu dans
													// monStock

		System.out.println(unMarchand.getMonStockFamille().getMtTotalStock());
		// unMarchand.getMonStockFamille().remove(banane);

		// System.out.println(unMarchand.getMonStockFamille().getMtTotalStock());

		// unMarchand.getMonStockFamille().clear();
		// System.out.println(unMarchand.getMonStockFamille().getMtTotalStock());

		System.out.println(banane.equals(banane2));
		System.out.println(banane.hashCode() == banane2.hashCode());
		System.out.println("banane = banane2 ? " + banane.equals(banane2));

		unMarchand.getMonStockFamille().add(banane2);

		System.out.println("------------------------------------");
		Collections.sort(unMarchand.getMonStockFamille());
		for (Produit produit : unMarchand.getMonStockFamille()) {
			System.out.println(produit);
		}

		// System.out.println(banane2.getPrixUnitaire());
		System.out.println(unMarchand.getMonStockFamille().getMtTotalStock());

		unMarchand.getMonStockFamille().setLimitePrix(0);

		System.out.println(unMarchand.getMonStockFamille().calculSomme());

		System.out.println(unMarchand.getMonStockFamille().calculSomme());
		unMarchand.getMonStockFamille().calculSomme();
		unMarchand.getMonStockPrivee().calculSomme();

		float somme = 0;
		float sommeAlimentaire = 0;
		float sommeConsommable = 0;
		for (int i = 0; i < unMarchand.getMonStockFamille().size(); i++) {
			System.out.println(unMarchand.getMonStockFamille().get(i)); // va
																		// aller
																		// chercher
																		// le
																		// ToString
																		// ;
			// .get est une méthod de Array
			// list
			// }
			for (Produit produit : unMarchand.getMonStockFamille()) { // pour
																		// tout
																		// les
																		// produits
																		// de la
																		// liste
																		// getMonStockFamille

				// somme += produit.get(i).getPrix();

				if (produit instanceof Alimentaire) {
					sommeAlimentaire += produit.getPrix();
				} else if (produit instanceof Consommable) {
					sommeConsommable += produit.getPrix();
				}
				somme = sommeConsommable + sommeAlimentaire;
			}
			System.out.println("Somme Total : " + somme + " Somme Alimentaire : " + sommeAlimentaire
					+ " Somme Consommable : " + sommeConsommable);
			// somme= sommeConsommable+sommeAlimentaire;

		}

	}

	private void rajouteDansTreeMap(TreeMap<String, Produit> treeMap, Alimentaire banane2) {
		Produit produit = treeMap.get(banane2.getNom());
		produit.rajoute(banane2);
	}
}
