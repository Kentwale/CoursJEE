package Geometrie;

public class TestForm2D {

	public static void main(String[] args) {
		TestForm2D testForm2D = new TestForm2D();
		testForm2D.init();
	}

	public void init() {
		//exemples exercice qui ne marche pas
		Cercle c = new Cercle(45,0);
		Rectangle r = new Rectangle (12, 33);
		Carré a = new Carré(45,45);
		Cercle c2= new Cercle(45,0);
		Form2D f=new Cercle(48,0);
		Object x =new Rectangle(45,45);//le compilateur c'est que c'est un objet mais ne sait pas que c'est un rectangle(pas encore)
		
		boolean resultatFaux = c2.equals(r);
		boolean resultatVrai = c2.equals(c2);
		boolean resultatVraiAussi= c2.equals(c);
		
		
		
		System.out.println("Cercle != Rectangle "+ resultatFaux+" Cercle == Cercle "+resultatVrai+" c == c2 "+resultatVraiAussi);
		
		
		essais();
		Form2D[] tableauForme = creerMonTableau();
		tableauForme = tri(tableauForme); // méthode ; modifie le tableauForme
											// avec tri
		// tableauForme=afficherMonTableau(tableauForme);
		afficherMonTableau(tableauForme); // pas de return dans la formule d'en
		Form2D[] tab = ajoutAuBout(tableauForme, new Cercle(12, 0));
		afficherMonTableau(tab); // bas
		boolean[] tableau2 = contain(new Cercle(12, 0), tableauForme);
		afficherMonTableauBB (tableau2);

		float surfaceGlobale = calculerLaSurfaceGlobale(tableauForme);

		// float surfaceGlobale=calculerLaSurfaceGlobale();

		System.out.println(surfaceGlobale);
		// Form2D[] tableauForme= tableauTri
		Form2D[] tab2 = ajoutAuMilieu(tableauForme, new Rectangle(15, 1), 0);
		afficherMonTableau(tab2);
		
		TableauSécurité t=new TableauSécurité(30);
		//Form2D[] toto= t.getTab();
		//toto [4] = new Cercle (14.0);
		t.getTab()[4]= new Cercle(14,0);
	}

	private Form2D[] creerMonTableau() {
		Form2D[] tableauForme = new Form2D[29];
		for (int i = 0; i < tableauForme.length; i++) {
			creerUnElementDuTableau(tableauForme, i);

		}

		// TODO Auto-generated method stub
		return tableauForme;
	}

	private float calculerLaSurfaceGlobale(Form2D[] tableauForme) {
		float surfaceGlobale = 0;

		for (int i = 0; i < tableauForme.length; i++) {
			surfaceGlobale = calculerUnElementDuTableau(tableauForme, surfaceGlobale, i);
		}
		return surfaceGlobale;

	}

	private void creerUnElementDuTableau(Form2D[] tableauForme, int i) {
		int numeroForme = (int) (Math.random() * 5);
		Form2D form = null;
		switch (numeroForme) {
		case 0:
			form = new Cercle();
			break;
		case 1:
			form = new Rectangle();
			break;
		case 2:
			form = new Carré();
			break;
		case 3:
			form = new TriangleRectangle();
			break;
		case 4:
			form = new TriangleIsocele();
			break;
		case 5:
			form = new TriangeEquilaterale();
			break;
		}
		tableauForme[i] = form;
		// System.out.println(tableauForme[i]);
	}

	private float calculerUnElementDuTableau(Form2D[] tableauForme, float surfaceGlobale, int i) {
		Form2D form = tableauForme[i];
		return surfaceGlobale += form.surface();

	}

	private void essais() {
		Rectangle rectangle = new Rectangle(4f, 7f);
		System.out.println(rectangle.perimetre());
		System.out.println(rectangle.surface());

		Cercle cercle = new Cercle(3f, 0f);
		System.out.println(cercle.perimetre());
		// TODO Auto-generated method stub

	}

	public Form2D[] tri(Form2D[] t) { // afficher le tableau de depart
		for (int i = 0; i < t.length; i++) {
			System.out.println((float) t[i].surface() + " ");
		}
		System.out.println("");
		// int nb=0; // tant qu'on a effectué ne serait-ce qu'1 seule
		// permtation, on continue
		boolean b = true; // si b egale à true, on continue
		while (b) {
			b = false;
			// j'explore mon tableau
			for (int i = 0; i < t.length - 1; i++) {
				if (t[i].compareTo(t[i + 1]) > 0) {
					Form2D a = t[i];
					t[i] = t[i + 1];
					t[i + 1] = a;
					b = true;
					// nb +=3; pour effectuer des tests d'efficacité
				}
				// nb+=2;
			}
			for (int i = 0; i < t.length; i++) {
				System.out.print((float) t[i].surface() + ", ");
			}
			System.out.println("");
		}
		// System.out.println(nb);
		return t;
	}

	public void afficherMonTableau(
			Object[] lambda) { /* void au lieu de Form2D[] */
		for (int i = 0; i < lambda.length; i++) {
			System.out.println(lambda[i].toString());
		}}
		public void afficherMonTableauBB(
				boolean[] lambda) { 
			for (int i = 0; i < lambda.length; i++) {
				System.out.println(lambda[i]);}
	}

	public Form2D[] ajoutAuBout(Form2D[] tableauForme, Form2D maForme) {
		Form2D[] tableauRetour = new Form2D[tableauForme.length + 1];
		for (int i = 0; i < tableauForme.length; i++) {
			tableauRetour[i] = tableauForme[i];
		}
		tableauRetour[tableauForme.length] = maForme;
		return tableauRetour;
	}

	public Form2D[] ajoutAuMilieu(Form2D[] tableauForme, Form2D maForme, int position) {
		Form2D[] tableauRetour = new Form2D[tableauForme.length + 1];
		int j = position;
		for (int i = 0; i < tableauRetour.length; i++) {
			if (i < j) {
				tableauRetour[i] = tableauForme[i];
			} else if (i == j) {
				tableauRetour[i] = maForme;
			} else if (i > j) {
				tableauRetour[i] = tableauForme[i - 1];
			}
			
		}
		return tableauRetour;
	}

	public Form2D suppAuBout(Form2D[] tab) {
		Form2D[] tableauSupp = new Form2D[tab.length - 1];
		for (int i = 0; i < tableauSupp.length; i++) {
			tableauSupp[i] = tab[i];
		}
	return tab[tab.length - 1];
}
	private Form2D suppAuMilieu(Form2D[] tab, int position) {
        // TODO Auto-generated method stub
        int j = position;
        Form2D[] tableauSuppMilieu = new Form2D[tab.length - 1];
        for (int i = 0; i < tableauSuppMilieu.length; i++) {
            if (i < j) {
                tableauSuppMilieu[i] = tab[i];
            } else {
                tableauSuppMilieu[i] = tab[i + 1];
            }

        }
        return tab[j];
	//}
	//public boolean contain(Form2D form, Form2D[]tab){ // ce n'est pas Form2D[]tab qu'on va comparer
		//boolean z=false;
		//if (form.equals(tab)){
			//System.out.println("True");
			//z=true;
		//}else{
			//System.out.println("false");// pas utile car si faux, z est quand meme false
		//z= false;
	//	}
	
	//return z;
}
	private boolean [] contain(Form2D form, Form2D[]tab){
		boolean []tabb = new boolean[tab.length];
		boolean b = false;
		for (int i = 0; i < tab.length; i++) {
			if (form.equals(tab[i])) {
				b= true;
				tabb [i]= b;
			} // ou break si on fait sans les tableaux
		}
		return tabb;
		
	}
}

