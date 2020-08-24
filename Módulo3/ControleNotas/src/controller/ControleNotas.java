package controller;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Aluno;
import entidades.Materia;
import entidades.Nota;
import entidades.Professor;
import interfaces.ControlesBasicos;

public class ControleNotas implements ControlesBasicos {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Materia> materias = new ArrayList<>();
	private ArrayList<Aluno> alunos = new ArrayList<>();
	
	
	
	public void iniciar() {
		inicializarProfessorMateria();
		
		String opcao = mostrarMenu();
		
		while(!opcao.equals("0")) {
			switch (opcao) {
			case "1": 
				System.out.println(alunos);
				opcao = mostrarMenu();
				break;
				
			case "2": 
				System.out.println(materias);
				opcao = mostrarMenu();
				break;
			case "3":
				
				System.out.println("\nDigite o nome do aluno: ");
				String nome = scanner.nextLine();
				System.out.println("Digite a matrícula do aluno: ");
				Integer matricula = Integer.parseInt(scanner.nextLine());
				
				Aluno aluno = new Aluno(nome, matricula);
				alunos.add(aluno);
				
				System.out.println(alunos);
				opcao = mostrarMenu();
				break;
				
			case "4":
				inserir();
				opcao = mostrarMenu();
				break;
			
			case "5":
				excluir();
				opcao = mostrarMenu();
				break;
			
			case "6":
				consultar();
				opcao = mostrarMenu();
				break;

			default:
				System.out.println("\nOpção inválida");
				break;
			}
			
		}
		
		System.out.println("\nObrigado!");
	}
	
	public String mostrarMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("Digite o comando desejado: \n\n");
		sb.append("1 - Ver alunos\n");
		sb.append("2 - Ver materias\n");
		sb.append("3 - Adicionar aluno\n");
		sb.append("4 - Inserir nota\n");
		sb.append("5 - Excluir nota\n");
		sb.append("6 - Consultar nota\n");
		sb.append("0 - Sair");
		
		System.out.println(sb.toString());
		return scanner.nextLine();
	}
	
	private void inicializarProfessorMateria() {
		Professor professor1 = new Professor();
		professor1.setNome("Joao Silva");
		Materia materia1 = new Materia();
		materia1.setNome("Português");
		materia1.setProfessor(professor1);
		materias.add(materia1);
		
		Professor professor2 = new Professor();
		professor2.setNome("Maria Santos");
		Materia materia2 = new Materia();
		materia2.setNome("Matemática");
		materia2.setProfessor(professor2);
		materias.add(materia2);
		
		
		Professor professor3 = new Professor();
		professor3.setNome("Jose Filho");
		Materia materia3 = new Materia();
		materia3.setNome("Geografia");
		materia3.setProfessor(professor3);
		materias.add(materia3);
		
		Professor professor4 = new Professor();
		professor4.setNome("Moises Silvio");
		Materia materia4 = new Materia();
		materia4.setNome("História");
		materia4.setProfessor(professor4);
		materias.add(materia4);
	}

	@Override
	public void inserir() {
		System.out.println("Digite o índice do aluno: ");
		Integer indiceAluno = Integer.parseInt(scanner.nextLine());
		System.out.println("Digite o índice da matéria: ");
		Integer indiceMateria = Integer.parseInt(scanner.nextLine());
		System.out.println("Digite a nota: ");
		Double valorNota = Double.parseDouble(scanner.nextLine());
		
		Nota nota = new Nota();
		nota.setNota(valorNota);
		nota.setMateria(materias.get(indiceMateria));
		
		alunos.get(indiceAluno).getNotas().add(nota);
		System.out.println(alunos.get(indiceAluno).getNotas());
		
	}

	@Override
	public void excluir() {
		System.out.println("Digite o índice do aluno: ");
		Integer indiceAluno = Integer.parseInt(scanner.nextLine());
		System.out.println("Digite o índice da nota que deseja excluir: ");
		int indiceNota = Integer.parseInt(scanner.nextLine());
		
		alunos.get(indiceAluno).getNotas().remove(indiceNota);
		
	}

	@Override
	public void consultar() {
		System.out.println("Digite o índice do aluno: ");
		Integer indiceAluno = Integer.parseInt(scanner.nextLine());
		System.out.println(alunos.get(indiceAluno).getNotas());
		
	}
}
