
public class ExerciceTestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExerciceTestString exerciceTestString = new ExerciceTestString();
		exerciceTestString.init();
	}
	public void init(){
	
String s1="Ceci est Mon Atout";
String s2="Atout à l'heure";
int lng=s1.length();
System.out.println(lng);
int lng2=s2.length();
System.out.println(lng2);

s1=s1.replace("Atout", "Pile");
System.out.println(s1);
String s4 = s1.replace("Pile", "Atout");
//System.out.println(s4);
s2=s2.replace("Atout", "Pile");
String s5 = s1.replace("Pile", "Atout");
//System.out.println(s5);
System.out.println(s2);
String s3 = s1.toUpperCase().substring(0,17);
System.out.println(s3);

char[]tab=s1.toCharArray(); //on met la phrase dans un tableau, caractère par caractère
int compteur=0;
for(int i=0;i<tab.length; i++){
	if  (s1.substring(i,i+1).equals("o")){//i,i+1 pour faire caract. par caract.
		compteur++;
		System.out.println(compteur);
	}
}
int compteurMot=0;
for(int i=0;i<tab.length-2;i++){ // -2 pour pas que le mot ne dépasse (est fait 3 lettres)
	if (s1.substring(i,i+3).equals("est")){
		compteurMot++;
		System.out.println(compteurMot);
	}
}

	}
}
