package Geometrie;

public abstract class Triange extends Form2D {

	


	public Triange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triange(float lng, float lar) {
		super(lng, lar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float surface() {
		// TODO Auto-generated method stub
		return (getLng() * getLar())/2;
	}

	}


