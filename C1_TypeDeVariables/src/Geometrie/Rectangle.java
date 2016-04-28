package Geometrie;

public class Rectangle extends Form2D {

	public Rectangle() {
		
	}

	public Rectangle(float lng, float lar) {
		super(lng, lar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float surface() {
		// TODO Auto-generated method stub
		return getLng() * getLar();
	}

	@Override
	public float perimetre() {
		// TODO Auto-generated method stub
		return (getLng()+getLar())*2;
	}
	@Override
	public boolean equals(Object objo) {
		boolean b=false;
		
		return b;
	}
}
