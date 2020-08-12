package projeto.aula.modulo3;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
//	primeiro que entra, primeiro que sai

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

//		add
		fila.add("Pessoa 1");
		fila.add("Pessoa 2");
		fila.add("Pessoa 3");
		fila.add("Pessoa 4");
		fila.add("Pessoa 5");
		
		System.out.println(fila);
		
//		remove
		System.out.println("\nElemento removido: " + fila.remove());
		System.out.println(fila);
			
//		verifica primeiro elemento, NÃO remove
		System.out.println("\nElemento verificado: " + fila.peek());
		System.out.println(fila);
		
//		procura elemento
		System.out.println(fila.contains("Pessoa 3"));
		
//		tamanho da fila
		System.out.println("Tamanho: " + fila.size());
		
//		verifica se esta vazia
		System.out.println(fila.isEmpty());
		
//		limpa todos elementos
		fila.clear();
		
		System.out.println(fila);
		
		
	}

}
