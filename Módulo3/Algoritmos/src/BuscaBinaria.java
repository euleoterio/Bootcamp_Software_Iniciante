import java.util.ArrayList;

public class BuscaBinaria {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList();
		for(int i = 1; i <= 10; i++) {
			lista.add(i);
		}
		
		int elementoBuscado = 5;
		
		int inicio = 0;
		int fim = lista.size() - 1;
		
		Boolean elementoEncontrado = false;
		
		while(inicio <= fim) {
			int meio = (inicio + fim) / 2;
			
			if(lista.get(meio) < elementoBuscado) {
				fim = meio + 1;
			} else if (lista.get(meio) > elementoBuscado) {
				fim = meio - 1;
			} else {
				System.out.println("Elemento encontrado no índice: " + meio);
				elementoEncontrado = true;
				break;
			}
		}
		
		if(!elementoEncontrado) {
			System.out.println("Elemento não encontrado");
		}

	}

}
