package pacoteModulo2;

import java.util.Scanner;

public class PraticaIntegrada {

	public static void main(String[] args) {
		
		char operacao = ' ';
		Scanner readInput = new Scanner(System.in);
		int[] numeros = new int[50];
		int i = 0, somatorio = 0, contaPares = 0;
		double media = 0;
		
		
		do {
			
			System.out.printf("\nMenu de opções:\n\n"  
								+ " D - para digitar novos números.\n"
								+ " Z - para apresentar o somatório dos números.\n"
								+ " V - para visualizar todos os números digitados.\n"
								+ " P - para a quantidade de números digitados.\n"
								+ " M - para a média simples dos números digitados.\n"
								+ " Q - para a quantidade de pares.\n"
								+ " S - para sair do programa.\n\n");
		
			operacao = readInput.nextLine().charAt(0);
			
			switch (operacao) {
			case 'D':
					System.out.print("Digite o número desejado: ");
					numeros[i] = readInput.nextInt();
					readInput.nextLine(); //clean buffer
					i++;
				break;
				
			case 'Z':
					for(int j=0; j<i; j++)
						somatorio += numeros[j];
					System.out.printf("O somatório dos números é: %d: \n", somatorio);
				break;
				
			case 'V':
				for(int j=0; j<i; j++)
					System.out.printf("%d\n", numeros[j]);
				break;
				
			case 'P':
					System.out.printf("Foram digitados %d números.\n", i);
				break;
				
			case 'M':
					for(int j=0; j<i; j++)
						somatorio += numeros[j];
					media = somatorio / (i-1);
					System.out.printf("A média dos números e: %.2f\n", media);
				break;
				
			case 'Q':
					for(int j=0; j<i; j++) {
						if(numeros[j] % 2 == 0)
							contaPares++;
					}
					System.out.printf("Quantidade de números pares: %d.\n", contaPares);
				break;

			case 'S':
				break;
				
			default:
				System.out.println("Opção inválida.");
				break;
			}
					
		

			
		}while (operacao != 'S');

		
		System.out.println("Fim da execução");
	}

}
