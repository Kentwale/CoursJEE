package vdd.metier.stock;

import java.util.ArrayList;

import vdd.metier.produit.Alimentaire;
import vdd.metier.produit.Consommable;
import vdd.metier.produit.Produit;

public class StockArrayList extends ArrayList<Produit> { // ArrayList est classe faite
												// par Java ; Stock est une
												// ArrayList aussi
	public static int NUM_STOCK = 0;

	private String nomDuStock;
	private float limitePrix;
	private float mtTotalStock; // montant total actuel du stock

	public StockArrayList() { // par défaut
		nomDuStock = "stock" + Integer.toString(NUM_STOCK);// pour incrémenter
															// un numéro de
															// stock
		limitePrix = 1000000000f;
		mtTotalStock = 0;
		NUM_STOCK++;
	}

	public StockArrayList(String nomDuStock) {
		this.nomDuStock = nomDuStock;
		limitePrix = 100f;
		mtTotalStock = 0;
		NUM_STOCK++;
	}

	public StockArrayList(String nomDuStock, float limitePrix) {
		this.nomDuStock = nomDuStock;
		// this.setLimitePrix(limitePrix);
		this.limitePrix = limitePrix;
		mtTotalStock = 0;
		NUM_STOCK++;
	}

	public StockArrayList(float limitePrix) {
		limitePrix = 100f;
		mtTotalStock = 0;
		NUM_STOCK++;
	}

	public static int getNUM_STOCK() {
		return NUM_STOCK;
	}

	public static void setNUM_STOCK(int nUM_STOCK) {
		NUM_STOCK = nUM_STOCK;
	}

	public String getNomDuStock() {
		return nomDuStock;
	}

	public void setNomDuStock(String nomDuStock) {
		this.nomDuStock = nomDuStock;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nomDuStock;
	}

	public float getLimitePrix() {
		return limitePrix;
	}

	public void setLimitePrix(float limitePrix) {
		this.limitePrix = limitePrix;
		if (limitePrix == 0) {
			this.limitePrix = Float.POSITIVE_INFINITY;
		}
	}

	public float calculSomme() {
		float somme = 0;
		for (int i = 0; i < this.size(); i++) { // this est équivalent à Stock
												// extends ArrayList<Produit>
			somme += this.get(i).getPrix(); // this.get(i)donne le produit
											// correspondant (banane etc)
		}
		return somme;
	}

	@Override
	public void add(int index, Produit e) {
		float somme = mtTotalStock + e.getPrix();
		if (somme <= limitePrix || limitePrix == 0) {
			super.add(index, e);
			mtTotalStock = somme;
		}
	}

	@Override
	public boolean add(Produit e) {
		boolean depassePas = false;
		float somme = /* calculSomme() */mtTotalStock + e.getPrix(); // somme
																		// e
		if (somme <= limitePrix || limitePrix == 0) {
			if (contains(e)) {
				Produit p = get(indexOf(e));
				p.rajoute(e);
			} else {
				depassePas = super.add(e); 
				if(depassePas)
				mtTotalStock = somme;
			}
			
		}
		return depassePas; 

	}

		
	

	public boolean addOld(Produit e) {
		boolean depassePas = false;
		float somme = /* calculSomme() */mtTotalStock + e.getPrix(); // somme
																		// e
		if (somme <= limitePrix || limitePrix == 0) {
			Produit produitExiste = rechercheProduit(e);
			if (produitExiste != null) {
				depassePas = produitExiste.rajoute(e);
			} else {
				depassePas = super.add(e); // ajoute e à la ArrayList(le super)
				// if(depassePas)
				mtTotalStock = somme;
			}
			/*
			 * Produit produitRecherchee = null; for (int i = 0; i <
			 * this.size(); i++) { if (this.get(i).getNom().equals(e.getNom()))
			 * { produitRecherchee = this.get(i); break;
			 */

			/*
			 * if(this.contains(e)){ if(e.instanceof(Alimentaire)){ int indexE=
			 * this.indexOf(e);
			 * this.get(indexE).setPrixUnitaire((this.get(indexE).
			 * getPrixUnitaire()+e.getPrixUnitaire())/2);
			 * this.get(indexE).setPoids((this.get(indexE).getPoids()+e.getPoids
			 * ())/2); }else if{
			 * 
			 * int indexE= this.indexOf(e);
			 * this.get(indexE).setPrixUnitaire((this.get(indexE).
			 * getPrixUnitaire()+e.getPrixUnitaire())/2);
			 * 
			 * this.get(indexE).setQte((this.get(indexE).getPoids()+e.getQte())/
			 * 2);
			 */
		}
		return depassePas; // retour à boolean que s'il arrive à ajouter e à
		// super

	}

	private Produit rechercheProduit(Produit e) {
		Produit produitTrouve = null;
		for (Produit produit : this) {
			if (produit.getNom().equals(e.getNom())) {
				if (produit instanceof Alimentaire && e instanceof Alimentaire
						|| produit instanceof Consommable && e instanceof Consommable) {
					produitTrouve = produit;
					break;
				}
			}

		}
		return produitTrouve;
	}

	public float getMtTotalStock() {
		return mtTotalStock;
	}

	public void setMtTotalStock(float mtTotalStock) {
		this.mtTotalStock = mtTotalStock;
	}

	@Override
	public Produit remove(int index) {
		Produit e = super.get(index);
		float nouveauMtTotalStock = getMtTotalStock() - e.getPrix();
		this.setMtTotalStock(nouveauMtTotalStock);
		return super.remove(index);
	}

	@Override
	public boolean remove(Object o) {
		Produit e = (Produit) o; // on caste
		this.setMtTotalStock(this.getMtTotalStock() - e.getPrix()); // this.mtTotalStock
																	// -=
																	// e.getPrix();
		return super.remove(o);

	}

	@Override
	public void clear() {
		setMtTotalStock(0);// mtTotalStock =0;
		super.clear();
	}
}

	/*@Override
	public boolean contains(Object o) {
		boolean e = false;
		/*
		 * xxxif (o instanceof Produit){ if(indexOf (( Produit)o)>=0){ e=true;
		 */
	/*	if (rechercheProduit((Produit) o) != null) {
			e = true;
		}
		return e;
	}

	@Override*/
	/*public int indexOf(Object o) {
		/*
		 * xxxint index=-1 if(o instanceof Produit){
		 * index=this.indexOf((Produit)o); } return index;
		 */
	/*	int index = 0;
		for (int i = 0; i < this.size(); i++) {
			if (this.contains(o)) {
				index = i;
			}

		}
		/*
		 * xxxpublic int indexOf(Produit o) { int indiceTrouve=-1; for (int=0;
		 * i<siez();i++) { Produit produit = get(i); if(produit.getNom().equals(
		 * o).getNom())){ if(produit instanceof Alimentaire && o instanceof
		 * Alimentaire || produit instanceof Consommable && o instanceof
		 * Consommable){ indiceTrouve=i; break; } }
		 * 
		 * }
		 * 
		 * return (int) indiceTrouve;
		 */
		// return this.indexOf((Produit) o);
	/*	return index;
	}

}*/
