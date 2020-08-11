package projeto.aula.modulo3;

import java.util.Stack;

public class Pilha {
//	Pilha, último a entrar primeiro a sair

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
//		add elemento na pilha
		stack.add("Livro 1");
		stack.add("Livro 2");
		stack.add("Livro 3");
		stack.add("Livro 4");
		stack.add("Livro 5");
		
		System.out.println(stack);
		
		
//		removendo último elemento
		System.out.println("\nRemovido: " + stack.pop());
		System.out.println(stack);
		
//		verifica o último elemento, NÃO remove
		System.out.println("\nVerificado: " + stack.peek());

//		procura elemento na pilha
		System.out.println("\nPosição: " + stack.search("Livro 4"));
		
//		retorna se a pilha esta vazia ou não
		System.out.println("\nEstá vazia? " + stack.isEmpty());
		
	}

}
