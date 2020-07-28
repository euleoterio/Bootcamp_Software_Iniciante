package pacoteModulo2;

import java.util.*;

public class ClasseAula3_3 {

	public static void main(String[] args) {

		double nota1, nota2, nota3, total, media, frequencia;
		Scanner entrada = new Scanner(System.in);
		String situacao;
	
		System.out.print("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = entrada.nextDouble();
		
		total = nota1 + nota2 + nota3;
		media = total / 3;
		
		System.out.print("Digite a frequência do aluno: ");
		frequencia = entrada.nextDouble();
		
		
		if(total >= 70 && frequencia >= 0.75)
			situacao = "Aprovado";
		else if(total >= 40 && frequencia >= 0.75)
			situacao = "Recuperação";
		else
			situacao = "Reprovado";
		
		System.out.printf("O aluno obteve nota total de %.2f e média por avaliação de %.2f. A frequência foi %.2f%%. Com isso o aluno está %s"
							, total, media, frequencia * 100, situacao );
		

	}

}
