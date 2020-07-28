package pacote01;

import java.util.*;

public class Classe01 {

	public static void main(String[] args) {

		int n1 = 0;
		boolean resultado;
		Scanner readInput = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		n1 = readInput.nextInt();
		
		resultado = (n1 % 2 == 0);
		

		System.out.printf("O número digitado foi: %d. O resultado da operação booleana foi: %b.", n1, resultado);

	}

}
