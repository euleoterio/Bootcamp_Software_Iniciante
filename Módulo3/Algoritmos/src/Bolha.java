import java.util.ArrayList;

public class Bolha {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		
		lista.add(6);
		lista.add(5);
		lista.add(9);
		lista.add(1);
		lista.add(3);
		
		System.out.println(lista);
		
		
		for( int i = 0; i < lista.size(); i++)
			for (int j = 0; j < lista.size() - 1; j++) {
				if(lista.get(j) > lista.get(j+1)) {
					Integer aux = lista.get(j);
					lista.set(j, lista.get(j+1));
					lista.set(j+1, aux);
				}
			}

		System.out.println(lista);
	}

}
