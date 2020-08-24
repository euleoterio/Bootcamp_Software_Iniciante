package entidades;

public interface MeioLocomocao {
	public default void acelerar() {
		System.out.println("Implementação default, se não for implementado na classe usa essa aqui");
	}; 
	
	public void frear();
}
