package jogo.velha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JogoVelha {
	
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<ArrayList<String>> matriz = new ArrayList<ArrayList<String>>();
	
	
	public void iniciar() {
		ArrayList<String> linhaMatriz1 = new ArrayList<String>(Arrays.asList("_|", "_|", "_"));
		ArrayList<String> linhaMatriz2 = new ArrayList<String>(Arrays.asList("_|", "_|", "_"));
		ArrayList<String> linhaMatriz3 = new ArrayList<String>(Arrays.asList("_|", "_|", "_"));
		
		matriz.add(linhaMatriz1);
		matriz.add(linhaMatriz2);
		matriz.add(linhaMatriz3);
		
		
		Boolean vezJogador1 = true;
		Boolean houveVencedor = false;
		
		for(int jogadas = 0; jogadas < 9; jogadas++) {
			
			mostrarMatriz();
			String jogada = jogar(); 
			
			Integer linha = Integer.valueOf(jogada.split("-")[0]);
			Integer coluna = Integer.valueOf(jogada.split("-")[1]);
			
			if(vezJogador1)
				matriz.get(linha).set(coluna, (coluna == 2? "X": "X|"));
				else
					matriz.get(linha).set(coluna, (coluna == 2? "O": "O|"));
		

			if (verificarVencedor()) {
				houveVencedor = true;
				mostrarMatriz();
				System.out.println("O vencedor é: " + (vezJogador1 == true? "X" : "O"));
				break;
			}
			
			vezJogador1 = !vezJogador1;
		
		}
		
		if(!houveVencedor) {
			mostrarMatriz();
			System.out.println("Não houve vencedor!");
		}
		
		
	}
	
	private void mostrarMatriz() {
		
		for(int i = 0; i < matriz.size(); i++ ) {
			for(int j = 0; j < matriz.get(i).size(); j++)
				System.out.print(matriz.get(i).get(j));
			
			System.out.println();
		}

	}
	
	private String jogar() {
		
		System.out.println("\n\nDigite a posição que deseja marcar (linha-coluna): ");
		return scanner.nextLine(); 
		
	}
	
	private Boolean verificarVencedor() {
		

		for(int i = 0; i < 3; i ++) {
			
//			horizontal
			String h1 = matriz.get(i).get(0);
			String h2 = matriz.get(i).get(1);
			String h3 = matriz.get(i).get(2);
			
			if (!h1.contains("_") && h1.contains(h2) && h1.contains(h3))
				return true;
			
			
//			vertical
			String l1 = matriz.get(0).get(i);
			String l2 = matriz.get(1).get(i);
			String l3 = matriz.get(2).get(i);
			
			if (!l1.contains("_") && l1.contains(l2) && l1.contains(l3))
				return true;
		}
		
//		diagonal 
		String d1 = matriz.get(0).get(0);
		String d2 = matriz.get(1).get(1);
		String d3 = matriz.get(2).get(2);
		
		if (!d1.contains("_") && d1.contains(d2) && d1.contains(d3))
			return true;
		
//		diagonal invertida
		String dI1 = matriz.get(0).get(2);
		String dI2 = matriz.get(1).get(1);
		String dI3 = matriz.get(2).get(0);
		
		if (!dI3.contains("_") && dI3.contains(dI2) && dI3.contains(dI1))
			return true;
		
		return false;
	}
	


}
