package subtracao;

import java.util.Scanner;//importando objeto scanner;

public class subtracao {

	public static void main(String[] args) {

				Scanner entrada = new Scanner(System.in);//declaração da variável do que lê os dados digitados no teclado
				
				int numero01;//variável que armazena o primeiro numero.
				int numero02;//variável que armazena o segundo numero.
				int subtracao;//armazena o resultado da .
				
				System.out.println("divisão de dois números..\n");//nome do programa.
				
				System.out.println("Informe o primeiro valor:");//solicitacao de dados.
				numero01 = entrada.nextInt();//recebe os dados através da variável entraeda e armazena na variável numero01.
				
				System.out.println("Informe o primeiro valor:");//solicitacao de dados.
				numero02 = entrada.nextInt();//recebe os dados através da variável entraeda e armazena na variável numero02.
				
				subtracao = numero01-numero02;//armazenando a multiplicação das duas variaveis na varivel divisao.
				
				System.out.printf("resultado: %d%n", subtracao);//mostrando o valor armazenado na variavel que recebeu o calculo	
		
	}

}
