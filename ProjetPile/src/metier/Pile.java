package metier;

public class Pile {

	public static int NB_MAX = 10;

	private int[] p;
	private int sp;

	public Pile(int taille) {
		NB_MAX=taille;
		this.p = new int[taille];
		this.sp = -1;
	}
	public Pile (){
		this(NB_MAX);
	}

	public boolean estVide() {
		boolean b = false;
		if (sp < 0) {
			b = true;
		}
		return b;
	}

	public boolean estPleine() {
		boolean b = false;
		if (sp == NB_MAX - 1) {
			b = true;
		}
		return b;
	}

	public void empiler(int val) throws PilePleineException {
		if (estPleine()) {
			throw new PilePleineException();

		}
		if (sp < NB_MAX - 1) {
			this.sp++;
			this.p[this.sp] = val;
		}

	}

	public int depiler() throws PileVideException {
		if (estVide()) {
			throw new PileVideException();

		}
		int valeurDeRetour = -1;
		valeurDeRetour = this.p[this.sp];
		this.sp--;
		return valeurDeRetour;
	}

	public int[] getP() {
		return p;
	}

	public void setP(int[] p) {
		this.p = p;
	}

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}

}
