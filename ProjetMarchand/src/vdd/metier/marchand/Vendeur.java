package vdd.metier.marchand;

import vdd.metier.stock.Stock;

public class Vendeur {
	
	private Stock monStock;
	private Stock monStockPrivee;
	private Stock monStockFamille;
	
	public Vendeur(){
		this.monStock= new Stock();
		this.monStockPrivee= new Stock();
		this.monStockFamille= new Stock();
	}
	
	
	public Stock getStock(){
		return monStock;
	}
	
	public Stock getMonStockPrivee() {
		return monStockPrivee;
	}

	public void setMonStockPrivee(Stock monStockPrivee) {
		this.monStockPrivee = monStockPrivee;
	}

	public Stock getMonStockFamille() {
		return monStockFamille;
	}

	public void setMonStockFamille(Stock monStockFamille) {
		this.monStockFamille = monStockFamille;
	}

	public void setStock(Stock stock) {
		this.monStock = stock;
	}

}
