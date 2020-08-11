package pacoteModulo2;

import java.util.Scanner;

public class ClasseAula3_9 {

	public static void main(String[] args) {
	
		char saida = 'N';
		Scanner readInput = new Scanner(System.in);
		int num = 0, somatorio = 0, cont = 0;
		
		while(saida != 'S') {
			
			System.out.print("Digite um número: ");
			num = readInput.nextInt();
			somatorio += num;
			
			readInput.nextLine();
			
			System.out.print("Deseja sair? (S - Sim, N - Não)? ");
			saida = readInput.nextLine().charAt(0);
			
			cont++;
			
		}

		System.out.printf("Somatório de %d números é igual à %d", cont, somatorio);
	}

}
