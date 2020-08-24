package entidaddes;

public class Moto extends Veiculo{
	
	public Moto(String modelo, String marca, Integer ano, Double valor, Vendedor vendedorResponsavel) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.valor = valor;
		this.vendedorResponsavel = vendedorResponsavel;
	}
	
	public String toString() {
		return "Moto: " + modelo + ", ano: " + ano 
						+ "\nMarca: " + marca 
						+ "\nValor: R$" + valor
						+ "\nVenedor: " + vendedorResponsavel.toString()
						+ "\nComprador: " + (cliente == null? "não vendido" : cliente.toString());
	}

}
