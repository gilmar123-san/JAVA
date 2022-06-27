import java.util.Scanner;//importando objeto scanner;

public class Modulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner entrada = new Scanner(System.in);//declara��o da vari�vel do que l� os dados digitados no teclado
		
		int numero01;//vari�vel que armazena o primeiro numero.
		int numero02;//vari�vel que armazena o segundo numero.
		int modulo;//armazena o resultado da .
		
		System.out.println("modulo de dois n�meros..\n");//nome do programa.
		
		System.out.println("Informe o primeiro valor:");//solicitacao de dados.
		numero01 = entrada.nextInt();//recebe os dados atrav�s da vari�vel entraeda e armazena na vari�vel numero01.
		
		System.out.println("Informe o primeiro valor:");//solicitacao de dados.
		numero02 = entrada.nextInt();//recebe os dados atrav�s da vari�vel entraeda e armazena na vari�vel numero02.
		
		modulo = numero01%numero02;//armazenando a multiplica��o das duas variaveis na varivel divisao.
		
		System.out.printf("resultado: %d%n", modulo);//mostrando o valor armazenado na variavel que recebeu o calculo
		entrada.close();
	}

}
