package pacoteModulo2;

import java.math.*;

public class ClasseAula2_9 {

	public static void main(String[] args) {
		
		// 2x^2 -16x -18 = 0
		
		double a,b,c;
		a = 2;
		b = -16;
		c = -18;
		
		double delta = 0;
		
		delta = Math.pow(b, 2) - (4 * a * c);
		System.out.printf("O valor do delta é: %.0f\n", delta);
		
		double xLinha = 0;
		xLinha = (-b + Math.sqrt(delta)) / (2*a);
		System.out.printf("O valor de x' é: %.0f \n", xLinha);
		
		double xDuasLinhas = 0;
		xDuasLinhas = (-b - Math.sqrt(delta)) / (2*a);
		System.out.printf("O valor de x'' é: %.0f", xDuasLinhas);
		
	}

}
