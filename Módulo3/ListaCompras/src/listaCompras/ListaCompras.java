package listaCompras;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompras {

	private ArrayList<String> lista = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	
	
	public void iniciar() {

		String opcao;
		
		do {
			
			opcao = mostrarMenu();
			
			switch (opcao) {
			case "1":
				System.out.println(lista);
				break;
			case "2":
				System.out.println("Digite um item para adicionar na lista");
				String item = scanner.nextLine();
				lista.add(item);
				System.out.println(lista);
				System.out.println('\n');
				break;
			case "3":
				System.out.println("Digite a posição do item para remover da lista");
				int itemRemove = Integer.valueOf(scanner.nextLine()) - 1;
				lista.remove(itemRemove);
				System.out.println(lista);
				System.out.println('\n');
				break;
			case "4":
				lista.clear();
				System.out.println(lista);
				System.out.println('\n');
				break;
			case "5":
				break;

			default:
				System.out.println("\nOpção inválida!\n");
				break;
			}
			
		}while(!opcao.equals("5"));
		
		System.out.println("Thanks!55");
	}
	
	
	private String mostrarMenu() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Digite o comando desejado: \n\n");
		sb.append("1 - Ver a lista; \n");
		sb.append("2 - Adicionar item na lista; \n");
		sb.append("3 - Remover item da lista; \n");
		sb.append("4 - Limpar lista; \n");
		sb.append("5 - Sair.");
		
		System.out.println(sb);
		return scanner.nextLine();
	}
}
