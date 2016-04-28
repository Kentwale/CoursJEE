package Geometrie;

public class TriangleRectangle extends Triange {

	public TriangleRectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TriangleRectangle(float lng, float lar) {
		super(lng, lar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float perimetre() {
		// TODO Auto-generated method stub
		return (float) Math.hypot(getLng(), getLar()+getLar()+getLng());
	}
	@Override
	public boolean equals(Object objo) {
		boolean b=false;
		
		return b;
	}

}
