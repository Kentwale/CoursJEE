package ParkingLeRetour;

import Geometrie.Cercle;
import Geometrie.Form2D;

public class MainParking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainParking mainParking = new MainParking();
		mainParking.init();
	}

	public void init() {
		PlaceNormale[] etage1=new PlaceNormale[200];
		for (int i = 0; i < etage1.length; i++) { 			
        PlaceNormale placeNormale = new PlaceNormale();
        etage1[i] = placeNormale;
        System.out.println(etage1[i]);
		}
		TypeDePlace[] etage1Finale = ajoutAuBout(etage1, new PlaceHandicapee());
		System.out.println(etage1Finale.getClass().getName());
		
		PlaceLimousine[]etage0= new PlaceLimousine[100];
		PlaceMoto[]etage3= new PlaceMoto[250];
		
		//MainParking[] etage = creerMonEtage();
		//afficherMonTableau(etage);
	//}

	//private MainParking[] creerMonEtage() {
	//	MainParking[] etage = new MainParking[200];
	//	for (int i = 0; i < etage.length; i++) {
			
	//	}
	//	return etage;
	//}

	

	
	//public void afficherMonTableau(
		//	MainParking[] lambda) { 
	//	for (int i = 0; i < lambda.length; i++) {
		//	System.out.println(lambda[i].toString());
//}
}
	public TypeDePlace[] ajoutAuBout(TypeDePlace[] etage1, PlaceHandicapee placeHandicapee) {
		//PlaceHandicapee placeHandicapee = new PlaceHandicapee();
		TypeDePlace[] etage1Finale =  new TypeDePlace[etage1.length + 5];
		for (int i = 0; i < etage1.length; i++) {
			etage1Finale[i] = etage1[i];
	}
		etage1Finale[etage1.length]=(PlaceHandicapee) placeHandicapee;
		return etage1Finale;
	}}
