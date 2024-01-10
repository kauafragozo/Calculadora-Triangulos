import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x,y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite as Medidas do Triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as Medidas do Triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.CalcularArea();
		
		double areaY = y.CalcularArea();
		
		System.out.printf("A área do Triangulo X é: %.4f%n", areaX);
		System.out.printf("A área do Triangulo Y é: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("O Triangulo X é maior");
		}else {
			System.out.println("O Triangulo Y é maior");
		}
		
		sc.close();
	}
}
