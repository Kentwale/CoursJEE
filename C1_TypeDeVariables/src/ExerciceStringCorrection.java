
public class ExerciceStringCorrection {
	public static void main(String[] arg) {
		ExerciceStringCorrection e = new ExerciceStringCorrection();
		e.init();

	}

	private void init() {
		// TODO Auto-generated method stub
		String chaine = "Bonjour tous le monde. Tous avez vous tous bien dormi ?";
		int lng = chaine.length();
		String charRecherche = "o";
		int ind = chaine.indexOf(charRecherche);
		int cpt = 0;
		System.out.println(ind);
		while (ind >= 0) {
			cpt++; 											//si trouve un o,, +1; si trouve 2 o, +1+1; ...
			ind = chaine.indexOf(charRecherche, ind + 1); // ind sera sup. ou
															// égale à 0 si
															// indexOf trouve le
															// charRecherche
		} // charRecherche, ind+1 = va recherche le charRecherche à partir de
			// indice+1																		//Integer.toString(cpt); on peut le remplacer par cpt tout seul
		System.out.println("nombre de " + charRecherche + " = " + Integer.toString(cpt)); //cpt est une valeur; on va le transformer en caractère
	//autre solution, moins propre, en dessous																		//integer to string convertit chaine de valeur en chaine de caractère
	cpt=0;
	char[] tabChar=chaine.toCharArray();
	for (int i=0; i<tabChar.length;i++){
		if (tabChar[i]=='o'){
			cpt++;
		}
	}
	System.out.println("nombre de " + charRecherche + " = " + Integer.toString(cpt));
	
	charRecherche="tous";
	ind = chaine.indexOf(charRecherche);
	cpt = 0;
	while (ind >= 0) {
		cpt++; 											
		ind = chaine.indexOf(charRecherche, ind + 1);
}
	System.out.println("nombre de " + charRecherche + " = " + Integer.toString(cpt));
	chaine=chaine.replace("tous", "autre");
	System.out.println(chaine);
	chaine=chaine.toLowerCase().replace("tous", "autre");
	System.out.println(chaine); //.trim() permet d'enlever les espaces dans les extremités String
	System.out.println("\""+chaine.trim()+"\"");
	System.out.println("\"\t\t\n"+chaine.trim()+"\""); //  \t est la tabulation et \n est le retour à la ligne
}
	}