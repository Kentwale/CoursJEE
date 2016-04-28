package vdd.metier.marchand;

import java.io.Serializable;

import vdd.metier.stock.StockArrayList;

public class Commer�ant implements Serializable {



/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
private String nomDuMarchand;
private StockArrayList stock; //ici, Stock est une ArrayList nomm� monStock


 public Commer�ant(){
	 stock = new StockArrayList();
 }
 public Commer�ant(String nomDuMarchand){
	 setNomDuMarchand(nomDuMarchand);
	 stock = new StockArrayList();
 }
 public Commer�ant(String nomDuMarchand, float limite){
	 setNomDuMarchand(nomDuMarchand);
	 stock = new StockArrayList(limite);
 
 }
 public Commer�ant( float limite){
	 stock = new StockArrayList(limite);
 
}
public String getNomDuMarchand() {
	return nomDuMarchand;
}


public void setNomDuMarchand(String nomDuMarchand) {
	this.nomDuMarchand = nomDuMarchand;
}


public StockArrayList getMonStock() {
	return stock;
}


public void setMonStock(StockArrayList monStock) {
	this.stock = monStock;
}
@Override
public String toString() {
	return nomDuMarchand();
}


private String nomDuMarchand() {
	// TODO Auto-generated method stub
	return null;
}



}

