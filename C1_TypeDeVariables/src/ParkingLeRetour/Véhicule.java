package ParkingLeRetour;

public class V�hicule {

	//private String nom;
	private float lng = (float) (Math.random() * 10);
	private float lar = (float) (Math.random() * 10);

	public V�hicule() {
		
	}

	public V�hicule(/*String nom,*/ float lng, float lar) {
		//this.nom = nom;
		this.lng = lng;
		this.lar = lar;
	}

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
	
}