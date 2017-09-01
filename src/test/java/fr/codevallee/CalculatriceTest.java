package fr.codevallee;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class CalculatriceTest {
	Calculatrice calculatrice;

	@Before
	public void initialition() {
		calculatrice = new CalculatriceImpl();
	}

	@Test
	public void additionTest() throws Exception {
		double a = 1;
		double b = 3;
		double retour = calculatrice.addition(a, b);
		assertEquals( 4.0, retour, 0);
	}

	@Test
	public void multiplicationTest() throws Exception {
		double a = 1;
		double b = 3;
		double retour = calculatrice.multiplication(a, b);
		assertEquals(3.0, retour, 0);
	}

	@Test
	public void soustractionTest() throws Exception {
		// substract a to b // (b-a)
		double a = 1;
		double b = 3;
		double retour = calculatrice.soustraction(a, b);
		assertEquals(2.0, retour, 0);
	}

	
	@Test
	public void divisionTest() throws Exception {
		double a = 12;
		double b = 6;
		double retour = calculatrice.division(a, b);
		assertEquals(2.0, retour, 0);
	}
	
	@SuppressWarnings("unused")
	@Test(expected = ArithmeticException.class)
	public void divisionTest0() throws ArithmeticException {
		double a = 12;
		double b = 0;
		double retour = calculatrice.division(a, b);
	}

}
