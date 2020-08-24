import java.util.ArrayList;

import entidades.Aluno;
import entidades.Caminhao;
import entidades.Carro;
//import entidades.AlunoEnsinoMedio;
import entidades.Diretor;
import entidades.MeioLocomocao;
import entidades.Pessoa;
import entidades.Professor;

public class Controle {
	
	private ArrayList<Aluno> alunos = new ArrayList<>();
	private ArrayList<Diretor> diretores = new ArrayList<>();
	private ArrayList<Professor> professores = new ArrayList<>();
	private ArrayList<Pessoa> pessoas = new ArrayList<>();

	public void iniciar() {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Vinicius Euleoterio");
		aluno1.setCpf("13245678901");
		aluno1.setTelefone("(51)982895068");
		aluno1.setEndereco("Rua X");
		aluno1.setNumero("10");
		aluno1.setMatricula(12345);
		
		Aluno aluno2 = new Aluno("Joao Silva", "09876543210", "(31)890765431", "Rua Y", 354216);
		
		Aluno aluno3 = new Aluno("Maria Silva");
		aluno3.setCpf("12312312312");
		aluno3.setTelefone("(11)987654321");
		aluno3.setEndereco("Rua A");
		aluno3.setMatricula(123325);
		
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		
		Professor professor1 = new Professor();
		professor1.setNome("Professor 1");
		
		Diretor diretor1 = new Diretor();
		diretor1.setNome("Diretor 1");
		
		
		pessoas.add(aluno1);
		pessoas.add(professor1);
		pessoas.add(diretor1);
		
		System.out.println(aluno1.enderecoCompleto());
		System.out.println(aluno1.informaTipo());
		System.out.println(professor1.informaTipo());
		System.out.println(diretor1.informaTipo());
		
		aluno1.atualizarDadosPessoais("Nome de teste");
		aluno1.atualizarDadosPessoais("Nome de teste2","12312312312" );
		
		System.out.println(aluno1.getNome());
		
		
//		AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
		
		ArrayList<MeioLocomocao> lista = new ArrayList<>();
		Carro carro = new Carro();
		Caminhao caminhao = new Caminhao();
		
		carro.acelerar();
		caminhao.acelerar();
		
		lista.add(carro);
		lista.add(caminhao);
		
		for (MeioLocomocao m : lista) {
			m.acelerar();
			m.frear();
		}
	}
}
