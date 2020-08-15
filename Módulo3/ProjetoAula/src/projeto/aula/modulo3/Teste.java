package projeto.aula.modulo3;

import java.util.ArrayList;
import java.util.Arrays;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		ArrayList<String> aux = new ArrayList<String>();
		 
		
		array.add("Como solicitar cartão");
		array.add("Informações sobre dificuldade de utilizar o cartão");
		array.add("Como cancelar cartão");
		
		System.out.println(array);
		System.out.println('\n');

//		anda no array
		for(int i=0; i<array.size(); i++) {
		
//			salva string da posicao i do array
			String arrayI = array.get(i);
			
//			verifica se aux ainda não tem nada
			if(aux.size() == 0)
				aux.add(0, arrayI);
			
			else {
				
//				anda no aux
				for(int j=0; j<aux.size(); j++) {
					
//					salva string da posicao j no array
					String auxJ = aux.get(j);
					
//					compara o tamanho
					if(auxJ.length() > arrayI.length()) {
//						adiciona string do array
						aux.add(j,arrayI);
					}else {
						aux.add((j+1),arrayI);
					}
					break;
				}
			}
			
		}
			
		
		System.out.println('\n');
		System.out.println(aux);
				
	}

}
