package entidades;

public class Triangulo {
	public double a;
	public double b;
	public double c;
	
	public double CalcularArea() {
		double p = (a + b  + c) / 2.0;
		double resultado = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return  resultado;
	}
}

