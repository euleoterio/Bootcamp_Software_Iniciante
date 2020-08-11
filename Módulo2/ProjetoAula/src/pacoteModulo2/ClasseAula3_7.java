package pacoteModulo2;

import java.util.Scanner;

public class ClasseAula3_7 {

	public static void main(String[] args) {

		char operacao = ' ';
		Scanner readInput = new Scanner(System.in);
		double n1 = 0, n2 = 0, total = 0;
		
		System.out.print("Digite o valor do primeiro número: ");
		n1 = readInput.nextInt();
		System.out.print("Digite o valor do segundo número: ");
		n2 = readInput.nextInt();
		
		readInput.nextLine(); //limpar buffer após nextInt()
		
		
		System.out.print("Digite a operação desejada (+,-,/,*,%): ");
		operacao = readInput.nextLine().charAt(0); 
		
		
		switch (operacao) {
			case '+':
				total = n1 + n2;
				break;
			case '-':
				total = n1 - n2;
				break;
			case '/':
				total = n1 / n2;
				break;
			case '*':
				total = n1 * n2;
				break;
			case '%':
				total = n1 % n2;
				break;

		default:
			operacao = 'f';
			System.out.println("Operação desconheida.");
			break;
		}

		if(operacao != 'f')
			System.out.printf("%.2f %c %.2f = %.2f", n1, operacao, n2, total);
	}

}
