package pacoteModulo2;

import java.util.*;

public class ClasseAula3_1 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, frequencia, totalNotas;
		char statusAluno;
		Scanner readInput = new Scanner(System.in);
		
		
		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = readInput.nextLine();
	
		System.out.print("Digite a situação do aluno (O para ok; P para PendÊncia):");
		statusAluno = readInput.nextLine().charAt(0);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = readInput.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = readInput.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = readInput.nextDouble();
		System.out.print("Digite a quarta nota: ");
		nota4 = readInput.nextDouble();
		
		System.out.print("Digite a frequência do aluno: ");
		frequencia = readInput.nextDouble();
		
		totalNotas = nota1 + nota2 + nota3 + nota4;
		boolean aprovado = totalNotas >= 70 && frequencia >= 0.75;
		
		System.out.printf("\nO aluno %s obteve nota final %.2f e frequência %.2f%%. \nA situação do(a) aluno(a) é %c.\n"
				+ "Aluno aprovado? %b", nomeAluno, totalNotas, frequencia*100, statusAluno, aprovado);

		

	}

}
