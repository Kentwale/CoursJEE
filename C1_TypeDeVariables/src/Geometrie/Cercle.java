package Geometrie;

public class Cercle extends Form2D {

	public Cercle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cercle(float lng, float lar) {
		super(lng, lng);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float surface() {
		// TODO Auto-generated method stub
		return (float) (Math.pow(getLng(), 2) * (Math.PI));
	}

	@Override
	public float perimetre() {
		// TODO Auto-generated method stub
		return (float) (2 * getLng() * (Math.PI));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ". Je suis donc un cercle";
	}

	@Override
	public boolean equals(Object o) { // o est un objet donc bénéficie de toutes
										// les propriétés et méthodes de objet
		boolean b = false;
		if (o instanceof Cercle /* && this.getLng()==o.getLng() */) {
			Cercle c = (Cercle) o; // on a casté objet o en Cercle

			b = true;
		}

		System.out.println(this);// on est sur que this est un cercle
		return b;
	}

	public boolean equalsStrict(Object s) {
		boolean b = false;
		if (s instanceof Cercle) {
			Cercle c = (Cercle) s;
			float l = c.surface();
			if (l == this.surface()) {
				b = true;

			}
		}
		return b;
	}
}
