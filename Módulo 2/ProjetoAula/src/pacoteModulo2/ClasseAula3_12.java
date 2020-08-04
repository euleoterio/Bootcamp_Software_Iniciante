package pacoteModulo2;

import java.util.Scanner;

public class ClasseAula3_12 {

	public static void main(String[] args) {


		
		
		Scanner readInput = new Scanner(System.in);
		int num = 0, soma = 0;
		
		
		do {
			
			System.out.println("Digite nros positivos ou zero para sair ");
			num = readInput.nextInt();
			
			if(num == 18) break; //break para todo laço
			if(num == 20) continue; //continue avança para próxima interação, não executa o que tiver abaixo dentro do laço
			
			soma += num;
			
		}while(num > 0);
		
		System.out.printf("Somatário = %d", soma);

	}

}
