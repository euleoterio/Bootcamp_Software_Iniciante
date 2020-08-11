package pacote01;

import java.util.*;

public class Classes3 {

	public static void main(String[] args) {

		double salarioFixo = 1500.00, comissao = 0.05,  totalVendas = 0, salarioTotal = 0, auxilioCreche = 350.00;
		Scanner readInput = new Scanner(System.in);
		String nome;
		char possuiFilhos;
		
		
		System.out.print("Digite o nome do vendedor: ");
		nome = readInput.nextLine();
		
		System.out.print("O vendedor possui filhos (S - Sim; N - Não)? ");
		possuiFilhos = readInput.nextLine().charAt(0);
		
		System.out.print("Digite o total de venda do vendedor: ");
		totalVendas = readInput.nextDouble();
		
		if(totalVendas >= 20000.00) {
			if(possuiFilhos == 'S' || possuiFilhos == 's')
				salarioTotal = salarioFixo + (totalVendas * comissao) + auxilioCreche;
			else
				salarioTotal = salarioFixo + (totalVendas * comissao);
		}
		else {
			if(possuiFilhos == 'S' || possuiFilhos == 's')
				salarioTotal = salarioFixo + auxilioCreche;
			else
				salarioTotal = salarioFixo;
		}
		

		System.out.printf("O salário do(a) vendedor(a) %s é de: %.2f.", nome, salarioTotal);
	}

}
