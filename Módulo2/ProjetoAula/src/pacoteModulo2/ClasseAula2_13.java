package pacoteModulo2;

public class ClasseAula2_13 {

	public static void main(String[] args) {

		double nota1, nota2, nota3, nota4, frequencia, totalNotas;
		String nomeAluno;
		char statusAluno;
		boolean aprovado;
		
		
		nomeAluno = "Vinicius Euleoterio";
		statusAluno = 'M';
		
		nota1 = 20;
		nota2 = 20;
		nota3 = 30;
		nota4 = 5;
			
		frequencia = 0.6;
		totalNotas = nota1 + nota2 + nota3 + nota4;
		aprovado = totalNotas >= 70 && frequencia >= 0.75;
		
		System.out.printf("O aluno %s obteve nota final %.2f e frequência %.2f%%. \nA situação do(a) aluno(a) é %c.\n"
				+ "Aluno aprovado? %b", nomeAluno, totalNotas, frequencia*100, statusAluno, aprovado);

	}

}
