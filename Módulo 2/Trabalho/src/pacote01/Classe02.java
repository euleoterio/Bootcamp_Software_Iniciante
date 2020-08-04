package pacote01;

import java.util.*;

public class Classe02 {

	public static void main(String[] args) {
		
		int n1 = 0, n2 = 0, aux = 0;
		Scanner readInput = new Scanner(System.in);
		
		System.out.print("Digite o valor de n1: ");
		n1 = readInput.nextInt();
		n2 = 30;
		
		if(n1 == 20)
			aux = n1 * 5;
		else if (n1 > 20)
			aux = n1 * (10 - 4);
		else 
			aux = n2;
		
		System.out.printf("O valor da variável aux é: %d", aux);
		
	}
}
