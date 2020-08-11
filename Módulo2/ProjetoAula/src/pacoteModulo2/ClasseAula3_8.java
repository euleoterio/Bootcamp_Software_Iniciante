package pacoteModulo2;

public class ClasseAula3_8 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Valor de i: %d\n", i);
			for(int j = 0; j< 3; j++) {
				System.out.printf("	Valor de j: %d\n", j);
			}
			for(int z = 0; z< 2; z++) {
				System.out.printf("		Valor de z: %d\n", z);
			}
		}
		
		
		System.out.println("Start");
		
			for(int i=0; i<10; i++) {
				System.out.printf("\n\nTabuáda do %d\n", i);
				
				for(int j=0; j<10; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i*j);
				}
			}

		System.out.println("End");	
	}
	
}
