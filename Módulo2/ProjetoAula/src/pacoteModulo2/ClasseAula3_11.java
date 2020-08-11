package pacoteModulo2;

import java.util.Scanner;

public class ClasseAula3_11 {

	public static void main(String[] args) {
		
		//tipo[] nome = new tipo[tamanho]

		int[] numeros = new int[5];
		Scanner readInput = new Scanner(System.in);
		int total = 0;
		
		for(int i=0; i<numeros.length;i++) {
			System.out.printf("Digite o %d número: ", i+1);
			numeros[i] = readInput.nextInt();
			
			total += numeros[i];
			System.out.printf("Total parcial é %d", total);
		}
			
		System.out.printf("Total é %d", total);
	}

}
