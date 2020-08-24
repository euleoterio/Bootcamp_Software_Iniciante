package controllers;

import java.util.ArrayList;
import java.util.Scanner;

import entidaddes.Carro;
import entidaddes.Cliente;
import entidaddes.Moto;
import entidaddes.Vendedor;
import interfaces.ControlesBasicos;

public class ControleConcessionaria implements ControlesBasicos{
	Scanner scanner = new Scanner(System.in);
	ArrayList<Carro> carros = new ArrayList<>();
	ArrayList<Moto> motos = new ArrayList<>();
	ArrayList<Cliente> clientes = new ArrayList<>();
	ArrayList<Vendedor> vendedores = new ArrayList<>();
	
	public void iniciar() {
		
		String opcao = menu();
		
		while (!opcao.equals("0")) {
			if(Integer.parseInt(opcao) <=4) {
				consultar(opcao);
				opcao = menu();
			} else if(Integer.parseInt(opcao) <= 8) {
				cadastrar(opcao);
				opcao = menu();
			} else if (Integer.parseInt(opcao) <= 10) {
				vender(opcao);
				opcao = menu();
			} else {
				System.out.println("Opção Inválida.");
			}
			
		}
		System.out.println("Obrigado!");
		
	}
	
	public String menu() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nEscolha uma opção:\n\n");
		sb.append("1- Consultar carros\n");
		sb.append("2- Consultar motos\n");
		sb.append("3- Consultar clientes\n");
		sb.append("4- Consultar vendedores\n");
		sb.append("5- Cadastrar carros\n");
		sb.append("6- Cadastrar motos\n");
		sb.append("7- Cadastrar clientes\n");
		sb.append("8- Cadastrar vendedores\n");
		sb.append("9- Vender carro\n");
		sb.append("10- Vender moto\n");
		sb.append("0 - Sair\n");
		
		System.out.println(sb.toString());
		return scanner.nextLine();
	}

	@Override
	public void consultar(String opcao) {
		switch (opcao) {
		case "1":
			System.out.println(carros.toString());
			break;
		case "2":
			System.out.println(motos.toString());
			break;
		case "3":
			System.out.println(clientes.toString());
			break;
		case "4":
			System.out.println(vendedores.toString());
			break;	
			
		default:
			System.out.println("Opção Inválida.");
			break;
		}
		
	}

	@Override
	public void cadastrar(String opcao) {
		switch (opcao) {
		case "5":
			System.out.println("\nVamos cadastrar um carro, para isso me diga o modelo: ");
			String modelo = scanner.nextLine();
			System.out.println("Digite a marca: ");
			String marca = scanner.nextLine();
			System.out.println("Digite o ano");
			Integer ano = Integer.parseInt(scanner.nextLine());
			System.out.println("Digite o valor ");
			Double valor = Double.parseDouble(scanner.nextLine());
			System.out.println("Digite o indice vendedor responsável");
			Vendedor vendedorResponsavel = vendedores.get(Integer.parseInt(scanner.nextLine()));
			
			Carro carro = new Carro(modelo, marca, ano, valor, vendedorResponsavel);
			carros.add(carro);
			break;
		case "6":
			System.out.println("\nVamos cadastrar uma moto, para isso me diga o modelo: ");
			String modeloMoto = scanner.nextLine();
			System.out.println("Digite a marca: ");
			String marcaMoto = scanner.nextLine();
			System.out.println("Digite o ano");
			Integer anoMoto = Integer.parseInt(scanner.nextLine());
			System.out.println("Digite o valor ");
			Double valorMoto = Double.parseDouble(scanner.nextLine());
			System.out.println("Digite o indice vendedor responsável");
			Vendedor vendedorResponsavelMoto = vendedores.get(Integer.parseInt(scanner.nextLine()));
			
			Moto moto = new Moto(modeloMoto, marcaMoto, anoMoto, valorMoto, vendedorResponsavelMoto);
			motos.add(moto);
			break;
		case "7":
			System.out.println("\nVamos cadastrar um cliente, me diga o nome: ");
			String nomeCliente = scanner.nextLine();
			System.out.println("Digite o CPF: ");
			String cpfCliente = scanner.nextLine();
			System.out.println("Digite o endereço: ");
			String endereco = scanner.nextLine();
			
			Cliente cliente = new Cliente(nomeCliente, cpfCliente, endereco);
			clientes.add(cliente);
			break;
		case "8":
			System.out.println("\nVamos cadastrar um vendedor, me diga o nome: ");
			String nomeVendedor = scanner.nextLine();
			System.out.println("Digite o CPF: ");
			String cpfVendedor = scanner.nextLine();
			System.out.println("Digite a matrícula");
			Integer matricula = Integer.parseInt(scanner.nextLine());
			
			Vendedor vedendor = new Vendedor(nomeVendedor, cpfVendedor, matricula);
			vendedores.add(vedendor);
			break;

		default:
			System.out.println("Opção Inválida.");
			break;
		}
		
	}
	
	@Override
	public void vender(String opcao) {
		switch (opcao) {
		case "9":
			System.out.println("\nVenda de carro\n");
			System.out.println("Qual o indice do carro vendido?");
			Integer indiceCarro = Integer.parseInt(scanner.nextLine());
			System.out.println("Qual o indice do cliente?");
			Integer indiceCliente = Integer.parseInt(scanner.nextLine());
			
			carros.get(indiceCarro).setCliente(clientes.get(indiceCliente));
			break;
		case "10":
			System.out.println("\nVenda de moto\n");
			System.out.println("Qual o indice da moto vendida?");
			Integer indiceMoto = Integer.parseInt(scanner.nextLine());
			System.out.println("Qual o indice do cliente?");
			Integer indiceClienteMoto = Integer.parseInt(scanner.nextLine());
			
			motos.get(indiceMoto).setCliente(clientes.get(indiceClienteMoto));
			break;

		default:
			System.out.println("Opção Inválida.");
			break;
		}
		
	}

}
