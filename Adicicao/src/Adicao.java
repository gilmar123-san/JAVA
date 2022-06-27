
import java.util.Scanner;

public class Adicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//criando um Scanner para receber a entrada a partir de comando;
		Scanner entrada = new Scanner(System.in);
		
		int numero01;//vari�vel que recebr� o primeiro numero
		int numero02;//vari�vel que recebr� o segundo numero
		int sum;//recebe a soma dos dois valores;
		
		System.out.println("Insira o primeiro n�mero: ");//entrada
		numero01 = entrada.nextInt();
		
		System.out.println("Insira o segundo n�mero: ");//entrada
		numero02 = entrada.nextInt();
		
		sum = numero01 + numero02;//somando os valores
		
		System.out.printf("Soma %d%n",sum);//mostrando os valores
		entrada.close();
	}
}
