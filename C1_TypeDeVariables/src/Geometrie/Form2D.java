package Geometrie;

public abstract class Form2D implements Comparable<Form2D> {
	private float lng = (float)(Math.random()*10); //longueur
	private float lar = (float)(Math.random()*10); //largeur
	//private double rayon;
	
	
	
	public Form2D(){
		
	//}
	//@Override
	//public String toString() {
		//return "Ma forme 2D est: "+this.getClass().getName();
	}
	public Form2D(float lng, float lar ){
		this.lng=lng;
		this.lar=lar;
	
	}
	//public Form2D(double rayon){
		//this.rayon=rayon;
		
	//}
	public abstract float surface(); //ne passe pas à coté de ça; pas de return
	
	public abstract float perimetre();

	public float getLng() {
		return lng;
	}
	public void setLng(float lng) {
		this.lng = lng;
	}
	public float getLar() {
		return lar;
	}
	public void setLar(float lar) {
		this.lar = lar;
	}
	public int compareTo(Form2D autreForme) {
		float surfaceThis=surface(); //surfaceThise est notre surface à nous
		float surfaceAutre=autreForme.surface();
		//float surfaceThis=perimetre(); //si on veut changer par exemple
		//float surfaceAutre=autreForme.perimetre();
		int resultat=0;
		if(surfaceThis<surfaceAutre){
			resultat=-1;
		}else if (surfaceThis>surfaceAutre){
			resultat=1;
		}
		return resultat ;
		
//	public double getRayon() {
	//	return rayon;
	//}
	//public void setRayon(double rayon) {
		//this.rayon = rayon;
	//}
	
	
	
	//public float surfaceRCa(float lng,float lar) { 
		//return lng * lar;
//}
	//public float perimetreRCa(float lng,float lar) { 
		//return (lng+lar)*2;
//}
	//public double surfaceCe(float rayon) { 
		//return (Math.PI)*rayon;
//}
	//public double perimetreCe(float rayon) { 
		//return 2*(Math.PI)*rayon;
//}
}
	//@Override
	//public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
	//}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MA forme 2D est : "+this.getClass().getName()+" : "+surface()+" cm ";
	}
	}
