package pacote.trabalho;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaPedidos {
	
	Scanner scanner = new Scanner(System.in);
	Queue<String> filaPedidos = new LinkedList<>();
	
	
	public void insertOrder() {
		
		System.out.println("Digite o nome do contato: ");
		filaPedidos.add(scanner.nextLine());
		System.out.println("Pedido adicionado!");
		
	}
	
	public void removeOrder() {
		
		System.out.printf("Pedido do cliente %s foi enviado!", filaPedidos.remove());
		
	}
	

}
