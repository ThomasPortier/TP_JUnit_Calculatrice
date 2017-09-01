package fr.codevallee;

public class CalculatriceImpl implements Calculatrice {

	public double addition(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public double multiplication(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	public double soustraction(double a, double b) {
		// TODO Auto-generated method stub
		return b - a;
	}

	public double division(double a, double b) {
		// TODO Auto-generated method stub
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}

}
