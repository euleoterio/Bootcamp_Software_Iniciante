package pacoteModulo2;

public class ClasseAula2_4 {

	public static void main(String[] args) {

		int nota = 20;
		char tipoAluno = 'B';
		double horasCursadas = 2.5;
		boolean aprovado = true;
		
		System.out.println("Nota: " + nota);
		System.out.println("Tipo aluno: " + tipoAluno);
		System.out.println("Horas cursadas: " + horasCursadas);
		System.out.println("Aprovado: " + aprovado);

		nota = 30;
		tipoAluno = 'G';
		horasCursadas = 4.0;
		aprovado = false;
		
		System.out.println("Nota: " + nota);
		System.out.println("Tipo aluno: " + tipoAluno);
		System.out.println("Horas cursadas: " + horasCursadas);
		System.out.println("Aprovado: " + aprovado);
		
		
		String nome, nome2;
		nome = "Vinicius Henrique Euleoterio";
		nome2 = "Jéssica Oliveira";
		
		System.out.println(nome);
		System.out.println(nome2);
		
		int tamanhoNome = nome.length(), tamanhoNome2 = nome2.length();
		
		System.out.println("A variável nome tem " + tamanhoNome + " caracteres");
		System.out.println("A variável nome2 tem " + tamanhoNome2 + " caracteres");
		
		int totalCaracteres = tamanhoNome + tamanhoNome2;
		
		System.out.println("O total de caracteres das duas variáveis é: " + totalCaracteres);
		
		
		String nomesConcatenados = nome.concat(nome2);
		System.out.println(nomesConcatenados);
		
		String nomeSemA = nome.replace('i', '9');
		System.out.println(nomeSemA);
	
		String somenteNome = nome2.substring(0,7);
		System.out.println(somenteNome);
		
		String nomeMaisusculo = nome.toUpperCase();
		System.out.println(nomeMaisusculo);
		
		String nomeMinusculo = nome.toLowerCase();
		System.out.println(nomeMinusculo);
	}

}
