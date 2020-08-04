package pacoteModulo2;

import java.io.*;
import java.util.*;

public class ClasseAula3_13 {

	public static void main(String[] args) {

		try {
			
			FileReader arquivo = new FileReader("/Users/euleoterio/Documents/Github/Bootcamp_Software_Iniciante/Módulo 2/ProjetoAula/src/pacoteModulo2/Leitura.txt"); //ler arquivo
			BufferedReader lerArquivo = new BufferedReader(arquivo); //ler linha
			
			String linha;
			linha = lerArquivo.readLine();
			
			while(linha != null) {
			
				String[] dadosCliente = new String[4];
				dadosCliente = linha.split(";");
				
				System.out.printf("Código: %s\n" + 
									"Nome do cliente: %s\n" + 
									"Idade do cliente: %s\n" +
									"Status civil: %s\n\n", dadosCliente[0], dadosCliente[1], dadosCliente[2], dadosCliente[3]);
				
//				System.out.printf("%s\n", linha);
				linha = lerArquivo.readLine();
				
			
			}
			
			lerArquivo.close();
			arquivo.close();
			
		} catch (IOException e) {
			
			System.out.println("Erro lendo dados: " + e.getMessage());
			
		}

	}

}
