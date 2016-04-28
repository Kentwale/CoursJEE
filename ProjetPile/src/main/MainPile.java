package main;

import metier.Pile;
import metier.PilePleineException;
import metier.PileVideException;

public class MainPile {

	public static void main(String[] args) {
		MainPile main = new MainPile();
		main.init();
	}

	public void init() {

		// int[] p= new int[9];
		Pile pile = new Pile();
		boolean a = pile.estVide();
		System.out.println(a);
		try {
			pile.empiler(4);
		} catch (PilePleineException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		boolean b = pile.estVide();
		boolean e=pile.estPleine();
		System.out.println(b);
		System.out.println(e);
		try {
			pile.depiler();
		} catch (PileVideException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
			//e1.printStackTrace();
		}
		boolean c = pile.estVide();
		System.out.println(c);
		try {
			pile.empiler(4);
			pile.empiler(4);
			pile.empiler(4);
			pile.empiler(4);
			pile.empiler(4);
			pile.empiler(4);
			pile.empiler(4);
			pile.empiler(4);
			pile.empiler(4);
			pile.empiler(4);
			pile.empiler(4);
			pile.empiler(4);
			pile.empiler(4);
			pile.empiler(4);
			pile.empiler(4);
			pile.empiler(4);
			pile.empiler(4);
		} catch (PilePleineException e1) {
			// TODO Auto-generated catch block
			
			//e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		
boolean d= pile.estPleine();
System.out.println(d);
		// for (int i = 0; i < p.length; i++) {
		// System.out.println(pile.empiler(5));

	}

}
