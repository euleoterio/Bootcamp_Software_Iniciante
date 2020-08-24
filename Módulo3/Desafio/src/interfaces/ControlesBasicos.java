package interfaces;

public interface ControlesBasicos {
	public void consultar(String opcao);
	public void cadastrar(String opcao);
	
	public default void vender(String opcao) {
		
	}

}
