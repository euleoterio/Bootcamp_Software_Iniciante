package pacote.trabalho;

import java.util.Scanner;

public class Menu {
	
	public void start() {
		ListaContatos listaContatos = new ListaContatos();
		FilaPedidos filaPedidos = new FilaPedidos();
		OrganizarEntregas organizarEntregas = new OrganizarEntregas();
		
		String option = "";
		
		do {
			
			option = showMenu();
			
			switch (option) {
			case "1":
				listaContatos.consultContact();
				break;
			case "2":
				listaContatos.insertContact();
				break;
			case "3":
				listaContatos.removeContact();
				break;
			case "4":
				filaPedidos.insertOrder();
				break;
			case "5":
				filaPedidos.removeOrder();
				break;
			case "6":
				organizarEntregas.orderOrders();
				break;
			case "7":
				organizarEntregas.removedOrders();
				break;
				
			default:
				System.out.println("Opção inválida!");
				break;
			}
	
			
			
		} while (!option.equals("8"));
		
		System.out.println("Obrigado!");
		
	}

	public String showMenu() {
		
		Scanner scanner = new Scanner(System.in); 
			StringBuilder sb = new StringBuilder();	

			sb.append("\nEscolha uma opção: \n\n");
			sb.append("1 - Consultar lista de contatos\n");
			sb.append("2 - Inserir contato na lista de contatos\n");
			sb.append("3 - Remover contato da lista de contatos\n");
			sb.append("4 - Inserir pedido na fila\n");
			sb.append("5 - Remover pedido da fila\n");
			sb.append("6 - Organizar as entregas\n");
			sb.append("7 - Desempilhar pedido\n");
			sb.append("8 - Sair");

			System.out.println(sb);
			return scanner.nextLine();
		
	
}


}
