

public class IncrementoDecremento {

	public static void main(String[] args) {
		
		int c = 5;
		
		
		System.out.printf("Antes de incrementar: %d%n", c);
		System.out.printf("Incrementando: %d%n", c++);
		System.out.printf("Depois incrementar: %d", c);
		
		System.out.println();
		System.out.println();
		
		c = 5;
		System.out.printf("Antes de incrementar: %d%n", c);
		System.out.printf("Pr�-Incrementando: %d%n", ++c);
		System.out.printf("Depois pr�-incrementar: %d%n", c);
		System.out.printf("Valida��o: %s", c>5 ? "S":"N");
		
	}

}
