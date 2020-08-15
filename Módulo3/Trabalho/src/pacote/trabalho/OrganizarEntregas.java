package pacote.trabalho;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class OrganizarEntregas {
	
	Stack<Integer> ordemEntregas = new Stack<>();
	ArrayList<Integer> listaDistancia = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	
	
	public void orderOrders() {
//		receber lista, devolver uma pilha com o mais próximo sendo último a empilhar
		
		int option = 0;
		
		do {
			System.out.println("Digite o um número ou 0 se não tiver mais: ");
			option = scanner.nextInt();
			if(option != 0)
				listaDistancia.add(option);
			
			
		}while(option !=0);
		
		ArrayList<Integer> aux = new ArrayList<>();
		
		for(int i=0; i<listaDistancia.size(); i++) {
			
			if(aux.size() == 0)
				aux.add(listaDistancia.get(i));
			else {
				for(int j=aux.size(); j>=0; j--) {
					
//					System.out.println(aux.get(j-1));
//					System.out.println(listaDistancia.get(i));
					
					
					if(aux.get(j-1) >= listaDistancia.get(i)) {
						aux.add(j, listaDistancia.get(i));	
						break;
					} 
				}
//				aux.add( listaDistancia.get(i));
			}
		}
		
		for(int i=0; i<aux.size(); i++) {
			ordemEntregas.add(aux.get(i));
		}
		
		
		System.out.println(ordemEntregas);
			
	}
	
	public void removedOrders() {
		
		if(ordemEntregas.isEmpty()) {
			System.out.println("\nTodos pedidos foram entregues!\n");
		} else {
			System.out.println("\nPedido encaminhado:  " + ordemEntregas.pop());
		}
		
	}
	
	
}
