package vdd.metier.stock;

import java.util.ArrayList;


import vdd.metier.produit.Produit;

public class PasUnStock {

	private ArrayList<Produit> monStock;
	private ArrayList<Produit> monStockPrivee;
	private ArrayList<Produit> monStockFamille;

	public PasUnStock() {
		monStock = new ArrayList<Produit>();
		monStockFamille = new ArrayList<Produit>();
		monStockPrivee = new ArrayList<Produit>();
	}

	public ArrayList<Produit> getMonStockPrivee() {
		return monStockPrivee;
	}

	public void setMonStockPrivee(ArrayList<Produit> monStockPrivee) {
		this.monStockPrivee = monStockPrivee;
	}

	public ArrayList<Produit> getMonStockFamille() {
		return monStockFamille;
	}

	public void setMonStockFamille(ArrayList<Produit> monStockFamille) {
		this.monStockFamille = monStockFamille;
	}

	public ArrayList<Produit> getMonStock() {
		return monStock;

	}

	public void setMonStock(ArrayList<Produit> monStock) {
		this.monStock = monStock;
	}

	
	}


