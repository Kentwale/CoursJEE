package vdd.metier.stock;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import vdd.metier.produit.Produit;

public class Stock extends TreeMap<String, Produit> {

	public Stock() {

	}

	@Override
	public String toString() {
		String chaine = "";
		Set<Entry<String, Produit>> set = this.entrySet();
		for (Entry<String, Produit> entry : set) {
			//System.out.println(entry.getValue().getNom() + ", "); 
			chaine += entry.getValue().getNom() + ", ";
		}
		
		return chaine;
	}
}