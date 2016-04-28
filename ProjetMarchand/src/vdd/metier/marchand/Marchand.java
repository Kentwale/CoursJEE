package vdd.metier.marchand;

import java.io.Serializable;

import vdd.metier.stock.StockArrayList;

public class Marchand extends Commerçant implements Serializable {

	private StockArrayList monStockPrivee;
	private StockArrayList monStockFamille;
	private StockArrayList stock;

	public Marchand() {
		super();
		stock = new StockArrayList();
		monStockPrivee = new StockArrayList();
		monStockFamille = new StockArrayList();
		
	}

	
	public Marchand(float limite, float limiteFamille, float limitePrivee) {
		super();
		stock = new StockArrayList();
		monStockPrivee = new StockArrayList();
		monStockFamille = new StockArrayList();
		stock.setLimitePrix(limite);
		stock.setLimitePrix(limiteFamille);
		stock.setLimitePrix(limitePrivee);

		 stock.setLimitePrix(limite);
		 monStockFamille.setLimitePrix(limiteFamille);
		 monStockPrivee.setLimitePrix(limitePrivee);

	/*	if (limite == 0) {
			stock.setLimitePrix(Float.POSITIVE_INFINITY); // est la valeur la
															// plus haute de
															// float
		} else {
			stock.setLimitePrix(limite);
		}
		if (limitePrivee == 0) {
			monStockFamille.setLimitePrix(Float.POSITIVE_INFINITY);
		} else {
			monStockPrivee.setLimitePrix(limitePrivee);
		}
		if (limiteFamille == 0) {
			monStockPrivee.setLimitePrix(Float.POSITIVE_INFINITY);
		} else {
			monStockFamille.setLimitePrix(limiteFamille);
		}*/

	}

	public StockArrayList getMonStockPrivee() {
		return monStockPrivee;
	}

	public void setMonStockPrivee(StockArrayList monStockPrivee) {
		this.monStockPrivee = monStockPrivee;
	}

	public StockArrayList getMonStockFamille() {
		return monStockFamille;
	}

	public void setMonStockFamille(StockArrayList monStockFamille) {
		this.monStockFamille = monStockFamille;
	}

	public StockArrayList getStock() {
		return stock;
	}

	public void setStock(StockArrayList stock) {
		this.stock = stock;
	}

}
