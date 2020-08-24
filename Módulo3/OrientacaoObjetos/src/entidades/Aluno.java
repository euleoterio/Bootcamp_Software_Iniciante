package entidades;


//final PROIBE que exista um extends da classe Aluno
public final class Aluno extends Pessoa{	
	private Integer matricula;

//	Construtor 
	public Aluno(String nome, String cpf, String telefone, String endereco, Integer matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.matricula = matricula;
	}
	
//	sobreescrita
	public String enderecoCompleto() {
		return "sobreescrevendo o método";
	}
	
	public Aluno(String nome) {
//		setNome porque extends Pessoa
		setNome(nome);
	}
	
//	Construtor Default
	public Aluno() {
		
	}
	
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Override
	public String informaTipo() {
		return "Meu tipo é aluno";
	}

}
