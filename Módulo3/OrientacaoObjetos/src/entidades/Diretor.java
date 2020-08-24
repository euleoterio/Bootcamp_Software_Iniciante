package entidades;

public class Diretor extends Pessoa {
	private String setor;
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	@Override
	public String informaTipo() {
		return "Meu tipo é diretor";
	}
}
