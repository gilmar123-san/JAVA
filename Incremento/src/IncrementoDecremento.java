

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
		System.out.printf("Pré-Incrementando: %d%n", ++c);
		System.out.printf("Depois pré-incrementar: %d%n", c);
		System.out.printf("Validação: %s", c>5 ? "S":"N");
		
	}

}
