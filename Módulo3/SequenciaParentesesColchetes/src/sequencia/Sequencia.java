package sequencia;

import java.util.Scanner;
import java.util.Stack;

public class Sequencia {
	
	private Scanner scanner = new Scanner(System.in);
	
	public void iniciar() {
		String sequencia;
		Boolean isSequencia = true;
		
		do {
			sequencia = mostrarMenu();
			isSequencia = true;
			
			
			if(!isSequencia) {
				System.out.println("Sequência inválida");
				break;
			}
			
			Stack<String> stack = new Stack<>();
			for(int i = 0; i < sequencia.length(); i++) {
				
				char c = sequencia.charAt(i);
				
				switch (c) {
				case ')':
					if(stack.isEmpty()) 
						isSequencia = false;
					else {
						String elemento = stack.pop();
						if (!elemento.equals("(")) 
							isSequencia = false;
					}
					break;
				case ']':
					if(stack.isEmpty()) 
						isSequencia = false;
					else {
						String elemento = stack.pop();
						if (!elemento.equals("[")) 
							isSequencia = false;
					}
					
					break;

					
				default:
					stack.push(String.valueOf(c));
					break;
				}

			}
			
			if (!sequencia.toUpperCase().contains("SAIR")) {
				if(stack.isEmpty() && isSequencia)
					System.out.println("A sequência está correta.");
				else
					System.out.println("Sequência inválida");
			}
			
		} while (!sequencia.toUpperCase().contains("SAIR"));
		
		System.out.println("\nThanks!");
		
	}

	private String mostrarMenu() {
		System.out.println("Digite a sequencia para verificação ou digite #Sair para encerrar:");
		
		return scanner.nextLine();
	}
	
}
