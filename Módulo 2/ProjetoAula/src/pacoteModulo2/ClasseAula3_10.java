package pacoteModulo2;

import java.util.Scanner;

public class ClasseAula3_10 {

	public static void main(String[] args) {
		
		
		char saida = ' ';
		Scanner readInput = new Scanner(System.in);
		int num = 0, somatorio = 0, cont = 0;
		
		do{
			
			System.out.print("Digite um número: ");
			num = readInput.nextInt();
			somatorio += num;
			
			readInput.nextLine();
			
			System.out.print("Deseja sair? (S - Sim, N - Não)? ");
			saida = readInput.nextLine().charAt(0);
			
			cont++;
			
		}while(saida != 'S') ;

		System.out.printf("Somatório de %d números é igual à %d", cont, somatorio);
	}



}
