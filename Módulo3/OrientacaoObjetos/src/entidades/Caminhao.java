package entidades;

public class Caminhao implements MeioLocomocao{
	private String chassi;
	private String modelo;
	private Integer eixos;
	private Integer velocidade;
	
	public Caminhao() {
		velocidade = 0;
	}
	
//	@Override
//	public void acelerar() {
//		velocidade += 2;
//	}

	@Override
	public void frear() {
		if(velocidade > 0) {
			velocidade -=2;
			System.out.println("Frear caminhão");
		}
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getEixos() {
		return eixos;
	}

	public void setEixos(Integer eixos) {
		this.eixos = eixos;
	}

	public Integer getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}
	

}
