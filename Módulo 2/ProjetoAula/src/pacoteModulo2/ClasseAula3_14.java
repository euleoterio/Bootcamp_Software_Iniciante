package pacoteModulo2;

import java.io.*;

public class ClasseAula3_14 {

	public static void main(String[] args) {

		try {
			
			FileWriter arquivo = new FileWriter("/Users/euleoterio/Documents/Github/Bootcamp_Software_Iniciante/Módulo 2/ProjetoAula/src/pacoteModulo2/SaidaDados.txt"); 
			PrintWriter gravarArquivo = new PrintWriter(arquivo);
			
			for(int i=0;i<10;i++) {
				gravarArquivo.printf("Valor de i: %d\n", i);
			}
			
			gravarArquivo.close();
			arquivo.close();
			
		} catch (Exception e) {
			System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
		}

		System.out.println("Fim da execução");
	}

}
