package Geometrie;

public class TriangleIsocele extends Triange {

	public TriangleIsocele() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TriangleIsocele(float lng, float lar) {
		super(lng, lar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float perimetre() {
		// TODO Auto-generated method stub
		return (float)(Math.hypot(getLng()/2, getLar()*2)+ getLng());
	}
	@Override
	public boolean equals(Object objo) {
		boolean b=false;
		
		return b;
	}

}
