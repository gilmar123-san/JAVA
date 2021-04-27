
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int total = 0;
		int contador = 1;
		
		while(contador<=10) {
			
			System.out.println("Informe a nota do aluno:");
			int nota = entrada.nextInt();
			total = total+nota;
			
			contador = contador+1;
			
		}
		
		int media = total / 10;
		
		System.out.printf("total de notas inseridas: %d%nMédia da classe: %d",total, media);

	}

}
