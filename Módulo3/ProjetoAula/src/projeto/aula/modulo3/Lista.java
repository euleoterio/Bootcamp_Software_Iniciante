package projeto.aula.modulo3;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<String> carros = new ArrayList<String>();
		
		//add - um elemento no fim
		carros.add("Uno");
		carros.add("Gol");
		carros.add("Palio");
		
		// add com indicie e valor do elemento
		carros.add(1, "Sandero");
		
		
		//contains, verifica a existencia do elemento no array
		if (carros.contains("Gol")) {
			System.out.println("Existe o elemento Gol no array");
		} else {
			System.out.println("Não existe");
		}
		
		carros.add("Gol");
		//indexOf, retorna indice da primeira ocorrencia
		int FirstPosition = carros.indexOf("Gol");
		System.out.println(FirstPosition);
		
		//lastIndexOf, retorna indice da ultima ocorrencia
		int LastPosition = carros.lastIndexOf("Gol");
		System.out.println(LastPosition);
		
		int positionNaoExiste = carros.indexOf("Corolla");
		// retorno -1 = não existe
		System.out.println(positionNaoExiste);
		
		for(int i=0; i<carros.size(); i++) {
			//get, retorna elemento do indice informado
			System.out.println(carros.get(i));
		}

		//remove elemento do indice informado
		carros.remove(0);
		carros.remove(1);
		System.out.println("\n\nRemoção");
		for(int i=0; i<carros.size(); i++) {
			System.out.println(carros.get(i));
		}
		
		//atualiza o elemento do indica informado pelo elemento informado
		System.out.println("\n\nSet:");
		carros.set(0, "New Uno");
		for(int i=0; i<carros.size(); i++) {
			System.out.println(carros.get(i));
		}
		
		
		// remove tudo				
		carros.clear();
		System.out.println(carros);
		
	}

}
