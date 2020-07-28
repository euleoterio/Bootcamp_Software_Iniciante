package pacoteModulo2;

public class ClasseAula2_7 {
	
	public static void main(String[] args) {
		
		
		int idade = 24; 
		double altura = 1.83;
		String nome = "Vinicius Euleoterio";
		boolean estudante = true;
		char sexo = 'M';
		
		
		// Coringas
		// %s String
		// %d Int
		// %.2f flout ou double com 2 casas decimais
		// %b boolean
		// %c char
		
		System.out.printf("A idade é %d e a altura é %.2f.\nO nome é %s e o sexo é %c.\nÉ estudante? %b", idade,altura,nome,sexo,estudante); //usa coringas e não quebra a linha - só usando o \n
		
		System.out.println("\nIdade: " + idade); //quebra linha
		System.out.print("Altura: " + altura); //não quebra linha
	}

}
