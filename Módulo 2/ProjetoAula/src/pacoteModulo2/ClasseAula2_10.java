package pacoteModulo2;

public class ClasseAula2_10 {

	public static void main(String[] args) {
	
		boolean ult3EmprestimosQuitadosPrazo, possuiRendaComprovada, clienteDezEstrelas, restricaoCredito;
		
		ult3EmprestimosQuitadosPrazo = true;
		possuiRendaComprovada = false;
		clienteDezEstrelas = false;
		restricaoCredito = false;
		
		boolean concecerEmprestimos = (ult3EmprestimosQuitadosPrazo && possuiRendaComprovada || clienteDezEstrelas) && !restricaoCredito;
		
		System.out.printf("Empréstimo concedido? \n%b", concecerEmprestimos);
		
	}

}
