package pacote.trabalho;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaContatos {

	Scanner scanner = new Scanner(System.in);
	ArrayList<String> listaContatos = new ArrayList<>();
	
	public void insertContact() {
		
		System.out.println("Digite o nome do cliente: ");
		listaContatos.add(scanner.nextLine());
		System.out.println("Contato adicionado!");
		
	}
	
	public void removeContact() {
		
		System.out.println("Digite o index a ser removido");
		listaContatos.remove(scanner.nextInt());
		System.out.println("Contato removido!");
		
	}
	
	public void consultContact() {
		
		System.out.println(listaContatos.isEmpty()? "Lista não tem contatos!" : listaContatos);
		
	}
}
