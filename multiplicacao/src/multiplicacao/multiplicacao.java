package multiplicacao;

import java.util.Scanner;//importando objeto scanner;

public class multiplicacao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);//declaração da variável do que lê os dados digitados no teclado
		
		int numero01;//variável que armazena o primeiro numero.
		int numero02;//variável que armazena o segundo numero.
		int multiplicacao;//armazena o resultado da .
		
		System.out.println("Multiplicação de dois números..\n");//nome do programa.
		
		System.out.println("Informe o primeiro valor:");//solicitacao de dados.
		numero01 = entrada.nextInt();//recebe os dados através da variável entraeda e armazena na variável numero01.
		
		System.out.println("Informe o primeiro valor:");//solicitacao de dados.
		numero01 = entrada.nextInt();//recebe os dados através da variável entraeda e armazena na variável numero02.
		
		multiplicacao = numero01*numero01;//armazenando a multiplicação das duas variaveis na varivel multiplicacao.
		
		System.out.printf("resultado: %d%n", multiplicacao);//mostrando o valor armazenado na variavel que recebeu o calculo		
	}
}
