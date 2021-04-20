package condicoes;

import java.util.Scanner;

public class Condicoes {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculando notas\n");
		
		int valor01;
		int valor02;
		
		System.out.println("Insira o primeiro valor: ");
		valor01 = entrada.nextInt();
		
		System.out.println("Insira o segundo valor: ");
		valor02 = entrada.nextInt();
		
		valor01 = (valor01 * valor02) + 9 - (77/7); 
		
		if(valor01 == valor02) {
			System.out.printf("%d é igual %d%n",valor01,valor02);
		}else if(valor01 != valor02) {
			System.out.printf("%d é diferente %d%n",valor01,valor02);
		}
		
	}	

}
