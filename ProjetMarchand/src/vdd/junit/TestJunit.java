package vdd.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import vdd.main.Main;

public class TestJunit {
	
	Main main;

	@Before
	public void avant(){
		main=new Main();
		String s=main.extraitAtt("qsdfsdf nom='bonjour'   qsdfsdf nom='bonjour'", "nom='");
		assertEquals("bonjour",s);
		String s2=main.extraitAtt("qsdfsdf nom='b'   qsdfsdf nom='b'", "nom='");
		assertEquals("b",s2);
		String s3=main.extraitAtt("qsdfsdf nom=''   qsdfsdf nom=''", "nom='");
		assertEquals("",s3);
		String s4=main.extraitAtt("qsdfsdf nom=\"bonjour\"   qsdfsdf nom=\"bonjour\"", "nom='");
		assertEquals("bonjour",s4);
		String s5=main.extraitAtt("qsdfsdf nom=\"b\"   qsdfsdf nom=\"b\"", "nom'");
		assertEquals("b",s5);
		String s6=main.extraitAtt("qsdfsdf nom=\"\"   qsdfsdf nom=''", "nom='");
		assertEquals("",s6);
	}
	@Test
	public void test() {
		
	}
	@Test
	public void testExtraitAtt() {
		
	}
}
