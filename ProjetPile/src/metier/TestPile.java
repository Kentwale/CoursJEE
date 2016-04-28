package metier;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestPile {

	Pile pile;

	@Before
	public void before() {
		pile = new Pile();
	}

	@Test
	public void tableauVide() {
		// int[]p={1,3,4,7,5,0,0,0,0,0};
		int monSp = -1;
		pile.setSp(monSp);
		assertTrue(pile.estVide());
		pile.setSp(0);
		// boolean reponse = pile.estVide();
		assertFalse(pile.estVide());
		pile.setSp(9);
		assertFalse(pile.estVide());
	}

	@Test
	public void testPile() {
		Pile p = new Pile();

		assertEquals(-1, p.getSp());
		assertNotNull(p.getP());
		assertEquals(10, p.getP().length);
	}

	@Test
	public void tableauPlein() {
		// int[]p={1,3,4,7,5,0,0,0,0,0};
		int monSp = -1;
		pile.setSp(monSp);
		assertFalse(pile.estPleine());
		pile.setSp(0);
		assertFalse(pile.estPleine());
		pile.setSp(9);
		assertTrue(pile.estPleine());
	}
	@Test
	public void testEmpiler() throws PilePleineException{
		int[]pe={0,1,2,3,4,5,6,7,8,9};
		pile.setP(pe);
		pile.setSp(-1); //-1, pas de valeur, passe à 0 quand il a une valeur (ici 50)
		pile.empiler(50);
		int[]peResultat={50,1,2,3,4,5,6,7,8,9};
		assertArrayEquals(peResultat, pile.getP());
		assertEquals(0, pile.getSp());
	}
	@Test
	public void testDepiler(){
		Assert.fail();
}
}
