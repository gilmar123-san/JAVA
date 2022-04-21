import java.util.Scanner;
import java.security.SecureRandom;

public class ChamadaExercicioCap5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/*
		 * 5.1 Desenhe 12 círculos concêntricos no centro de um JPanel (Figura 5.29). O
		 * círculo mais interno deve ter um raio de 10 pixels e cada círculo sucessivo
		 * deve ter um raio de 10 pixels maior que o anterior. Comece localizando o
		 * centro do JPanel. Para obter o canto superior esquerdo de um círculo, mova-se
		 * um raio para cima e um raio para a esquerda a partir do centro. A largura e a
		 * altura do retângulo delimitador têm o mesmo diâmetro do círculo (isto é, duas
		 * vezes o raio).
		 * 
		 * 5.2 Modifique a Questão 5.16 no final dos exercícios do capítulo para ler a
		 * entrada utilizando diálogos e exibir o gráfico de barras usando retângulos de
		 * comprimentos variados.
		 * 
		 * String escolha = JOptionPane.
		 * showInputDialog("Informe 1 para desenhar retangulos\nInforme 2 para desenhar ovais\nInforme 3 para desenhar tudo junto."
		 * ); int decisao = Integer.parseInt(escolha);
		 * 
		 * int [] retornoCliente = new int [5]; int contador=0; do { String escolha =
		 * JOptionPane.showInputDialog("Informe 5 números entre 1 e 30:"); int decisao =
		 * Integer.parseInt(escolha); retornoCliente[contador] = decisao;
		 * }while(++contador < 5);
		 * 
		 * Exercicio5_1 painel = new Exercicio5_1(retornoCliente);
		 * 
		 * JFrame tela = new JFrame();
		 * 
		 * tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE); tela.add(painel);
		 * tela.setSize(300, 300); tela.setVisible(true);
		 * 
		 * 5.3 Escreva uma instrução Java ou um conjunto de instruções Java para
		 * realizar cada uma das seguintes tarefas: a) Some os inteiros ímpares entre 1
		 * e 99 utilizando uma instrução for. Assuma que as variáveis de inteiro sum e
		 * count foram declaradas. int sum = 0; for(int count = 1 ; count < 100 ;
		 * count++) { if((count%2) != 0) { sum += count;
		 * System.out.println("Número impar: "+count); System.out.println("Soma: "+sum);
		 * } }
		 * 
		 * b) Calcule o valor de 2.5 elevado à potência de 3, utilizando o método pow.
		 * 
		 * double resultado = Math.pow(2.5,3);
		 * System.out.println("Resultado: "+resultado);
		 * 
		 * c) Imprima os inteiros de 1 a 20, utilizando um loop while e a variável
		 * contadora i. Assuma que a variável i foi declarada, mas não foi inicializada.
		 * Imprima apenas cinco inteiros por linha. [Dica: utilize o cálculo i % 5.
		 * Quando o valor dessa expressão for 0, imprima um caractere de nova linha;
		 * caso contrário, imprima um caractere de tabulação. Assuma que esse código é
		 * um aplicativo. Utilize o método System.out.println () para imprimir o
		 * caractere de nova linha, e utilize o método System.out.print ('\t') para
		 * imprimir o caractere de tabulação.]
		 * 
		 * int i = 1; while(i <= 20) { if(i % 5 == 1 && i != 1) { System.out.println();
		 * } System.out.print(i+","); i++; }
		 * 
		 * d) Repita a parte (c) utilizando uma instrução for.
		 * 
		 * for(int i = 1; i <=* 20;i++) { if(i % 5 == 1 && i != 1) {
		 * System.out.println(); } System.out.print(i+","); }
		 * 
		 * 
		 * 5.11 (Localize o menor valor) Escreva um aplicativo que localiza o menor de
		 * vários números inteiros. Suponha que o primeiro valor lido especifica o
		 * número de valores a serem inseridos pelo usuário.
		 * 
		 * System.out.println("informe quantos números serão inseridos:"); int contador
		 * = input.nextInt(); int[] vetor = new int[contador]; int aux = 0; contador =
		 * 0; System.out.println("Gerando números aleatoriamente..."+"\n"); SecureRandom
		 * random = new SecureRandom(); while (contador < vetor.length) {
		 * vetor[contador] = random.nextInt(); if (contador == 0) { aux =
		 * vetor[contador]; } else if (vetor[contador] < aux) { aux = vetor[contador]; }
		 * contador++; } System.out.println("O menor número é: "+aux);
		 * 
		 * 5.12 (Calculando o produto de números inteiros ímpares) Escreva um aplicativo
		 * que calcula o produto dos números inteiros ímpares de 1 a 15.
		 * 
		 * 
		 * int i = 0; int res = 0; for (i = 1; i <= 15; i++) { if (i % 2 != 0) {
		 * if(i==1) { res = i; } System.out.printf("Multiplicando %d por %d...%n",i,
		 * res); res *=i; System.out.printf("Resultado: %d%n", res); } }
		 * 
		 * 5.13 (Fatoriais) Fatoriais costumam ser utilizados em problemas de
		 * probabilidade. O fatorial de um inteiro positivo n (escrito como n! e
		 * pronunciado como “fatorial de n”) é igual ao produto dos números inteiros
		 * positivos de 1 a n. Escreva um aplicativo que calcula os fatoriais de 1 a 20.
		 * Utilize o tipo long. Exiba os resultados em formato tabular. Que dificuldade
		 * poderia impedir você de calcular o fatorial de 100?
		 * 
		 * double valor7 = 0.0; float valor6 = 0.0f; long valor5 = 0l; int valor4 = 0;
		 * short valor3 = 0; char valor2 = 0; boolean valor1 = true;
		 * 
		 * System.out.println("Informe um valor:"); long valor = input.nextLong(); long
		 * resultado = 0l; System.out.println("Calculando:"); for(long i = valor; i>=1l;
		 * i--) { if(i>0) { if(i==valor) { resultado = i; } System.out.printf("%d x %d",
		 * resultado, i); resultado *= i;
		 * System.out.printf("%nResultado: %d%n",resultado); } }
		 * 
		 * 5.14 (Programa de juros compostos modificado) Modifique o aplicativo de juros
		 * compostos da Figura 5.6 para repetir os passos para taxas de juros de 5%, 6%,
		 * 7%, 8%, 9% e 10%. Utilize um loop for para variar a taxa de juros.
		 * 
		 * 
		 * double amount; // quantia em depósito ao fim de cada ano double principal =
		 * 0; // quantidade inicial antes dos juros double rate = 0; // taxa de juros
		 * 
		 * System.out.println("Informe o valor a ser calculado:"); principal =
		 * input.nextInt();
		 * 
		 * // exibe cabeçalhos System.out.printf("%s%20s %n", "Year",
		 * "Amount on deposit");
		 * 
		 * for (int i = 5; i < 10; i++) { rate = (double)i / 100; // calcula quantidade
		 * de depósito para cada um dos dez anos for (int year = 1; year <= 10; ++year)
		 * { // calcula nova quantidade durante ano especificado amount = principal *
		 * Math.pow(1.0 + rate, year);
		 * 
		 * // exibe o ano e a quantidade ÿ System.out.printf("%4d%,20.2f%n", year,
		 * amount); } System.out.println(); }
		 * 
		 * 5.15 (Programa para impressão de triângulos) Escreva um aplicativo que exibe
		 * os seguintes padrões separadamente, um embaixo do outro. Utilize loops for
		 * para gerar os padrões. Todos os asteriscos (*) devem ser impressos por uma
		 * única instrução na forma System.out. print('*'); o que faz com que os
		 * asteriscos sejam impressos lado a lado. Uma instrução na forma
		 * System.out.println(); pode ser utilizada para mover-se para a próxima linha.
		 * Uma instrução na forma System.out.print(' '); pode ser utilizada para exibir
		 * um espaço para os últimos dois padrões. Não deve haver outras instruções de
		 * saída no programa. [Dica: os dois últimos padrões requerem que cada linha
		 * inicie com um número adequado de espaços em branco.] (a) (b) (c) (d)
		 * ********** ********** * ********* ********* ** ******** ******** *** *******
		 * ******* **** ****** ****** ***** ***** ***** ****** **** **** ******* *** ***
		 * ******** ** ** ********* * * **********
		 * 
		 * 
		 * for (int i = 1; i <= 10; i++) { for (int j = 1; j <= i; j++) {
		 * System.out.print("*"); } System.out.println(); } System.out.println(); for
		 * (int i = 10; i >= 1; i--) { for (int j = i; j >= 1; j--) {
		 * System.out.print("*"); } System.out.println(); } System.out.println(); for
		 * (int i = 10; i >= 1; i--) { if (i < 10) { System.out.printf("%" + (i - 10) +
		 * "s", " "); } for (int j = i; j >= 1; j--) { System.out.print("*"); }
		 * System.out.println(); } System.out.println(); for (int i = 1; i <= 10; i++) {
		 * if (i < 10) { System.out.printf("%" + (i - 10) + "s", " "); } for (int j = 1;
		 * j <= i; j++) { System.out.print("*"); } System.out.println(); }
		 * 
		 * 5.16 (Gráfico de barras do programa de impressão) Uma aplicação interessante
		 * dos computadores é exibir diagramas e gráficos de barras. Escreva um
		 * aplicativo que leia cinco números entre 1 e 30. Para cada número que é lido,
		 * seu programa deve exibir o mesmo número de asteriscos adjacentes. Por
		 * exemplo, se seu programa lê o número 7, ele deve exibir *******. Exiba as
		 * barras dos asteriscos depois de ler os cinco números.
		 * 
		 * 
		 * int[] vetor = new int[5]; int i = 0; SecureRandom numberRandom = new
		 * SecureRandom();
		 * System.out.println("Gerando 5 números aleatórios entre 1 e 30:"); while (i <
		 * vetor.length) { vetor[i] = 1 + numberRandom.nextInt(30); i++; };
		 * 
		 * for(i = 0; i < vetor.length; i++) { for(int j = 0; j < vetor[i]; j++) {
		 * System.out.print("*"); } System.out.print(" - "+vetor[i]);
		 * System.out.println(); }
		 * 
		 * 5.17 (Calculando vendas) Um varejista on-line vende cinco produtos cujos
		 * preços no varejo são como a seguir: produto 1, US$ 2,98; produto 2, US$ 4,50;
		 * produto 3, US$ 9,98; produto 4, US$ 4,49 e produto 5, US$ 6,87. Escreva um
		 * aplicativo que leia uma série de pares de números como segue: a) número de
		 * produto b) quantidade vendida Seu programa deve utilizar uma instrução switch
		 * para determinar o preço de varejo de cada produto. Você deve calcular e
		 * exibir o valor de varejo total de todos os produtos vendidos. Utilize um loop
		 * controlado por sentinela para determinar quando o programa deve parar o loop
		 * e exibir os resultados finais.
		 * 
		 * 
		 * double totalVendido = 0; int sentinela = 1;
		 * 
		 * do { System.out.
		 * println("Informe um produto do estoque entre 1 e 5 (0 - para finalizar):");
		 * int produto = input.nextInt(); if(produto != 0) {
		 * System.out.println("Informe a quantidade vendida:"); int quantidade =
		 * input.nextInt();
		 * 
		 * System.out.println("Informe o preço unitário:"); double preco =
		 * input.nextDouble();
		 * 
		 * totalVendido = vendeProduto(produto, quantidade, preco); }else { sentinela =
		 * 0; }
		 * 
		 * } while (sentinela != 0); if(totalVendido != 0) {
		 * System.out.printf("Valor total da venda: %.2f", totalVendido); }else
		 * if(totalVendido==0){ System.out.println("Nenhum produto inserido!"); }
		 *
		 *
		 * 
		 * 5.18 (Programa de juros compostos modificado) Modifique o aplicativo na
		 * Figura 5.6 para utilizar apenas inteiros para calcular os juros compostos.
		 * [Dica: trate todas as quantidades monetárias como números inteiros em
		 * centavos. Então, divida o resultado em suas partes dólar e centavos
		 * utilizando as operações divisão e resto, respectivamente. Insira uma vírgula
		 * entre as partes dólar e centavos.
		 * 
		 * double resultado; double aumentoAnual = 0.05; // taxa de juros String
		 * restoDeCentavos; int ajusteValor = 0; int deposito = 1000; // quantidade
		 * inicial antes dos juros int dolar = 0; int centavos = 0;
		 * 
		 * // exibe cabeçalhos System.out.printf("%s%20s %n", "Year",
		 * "Amount on deposit");
		 * 
		 * // calcula quantidade de depósito para cada um dos dez anos for (int year =
		 * 1; year <= 10; ++year) {
		 * 
		 * resultado = deposito * Math.pow(1 + aumentoAnual, year); dolar = (int)
		 * resultado / 100; if (dolar < 100) { centavos = (int) resultado % 100;
		 * restoDeCentavos = String.format("%.2f", resultado % 100); if
		 * (restoDeCentavos.length() < 5) { ajusteValor +=
		 * Integer.parseInt(restoDeCentavos.substring(2, restoDeCentavos.length()));
		 * if(ajusteValor==100) { centavos++; } } } // int numeroReal=
		 * Integer.parseInt(stringDeDados);
		 * 
		 * System.out.printf("%4d%,20d,%d%n", year, dolar, centavos); }
		 *
		 * 5.19 Suponha que i = 1, j = 2, k = 3 e m = 2. O que cada uma das seguintes
		 * instruções imprime? a) System.out.println(i == 1) = true; b)
		 * System.out.println(j == 3) = false; c) System.out.println((i >= 1) && (j <
		 * 4)) = true; d) System.out.println((m <= 99) & (k < m)) = false; e)
		 * System.out.println((j >= i) || (k == m)) = true; f) System.out.println((k + m
		 * < j) | (3 - j >= k)) = false; g) System.out.println(!(k > m)) = false;
		 * 
		 * 5.20 (Calculando o valor de pi) Calcule o valor de pi a partir de uma série
		 * infinita Imprima uma tabela que mostre o valor aproximado de pi calculando os
		 * 200.000 primeiros termos dessa série. Quantos termos você tem de utilizar
		 * antes de primeiro obter um valor que começa com 3,14159?
		 * 
		 * 
		 * final double PRINCIPAL = 4; double pi = PRINCIPAL; boolean calcular = true;
		 * int contador = 0;
		 * 
		 * System.out.printf("Contagem Valor calculado %n%8d %.5f %n", contador, pi);
		 * for (int i = 1; i <= 500000; i++) { if (i > 2 && i % 2 != 0) { if (calcular)
		 * { pi -= (PRINCIPAL / i); calcular = false; contador++;
		 * System.out.printf(" %n%8d %.5f %n", contador, pi); } else { pi += (PRINCIPAL
		 * / i); calcular = true; contador++; System.out.printf("%n%8d %.5f %n",
		 * contador, pi); } }
		 * 
		 * String aux = String.format("%.5f", pi);
		 * 
		 * if (aux.equals("3,14159")) { System.out.println("Fim da contagem!!"); break;
		 * } }
		 *
		 *
		 * 
		 * 5.21 (Triplos de Pitágoras) Um triângulo retângulo pode ter lados cujos
		 * comprimentos são todos inteiros. O conjunto de três valores inteiros para os
		 * comprimentos dos lados de um triângulo retângulo é chamado de triplo de
		 * Pitágoras. Os comprimentos dos três lados devem satisfazer a relação de que a
		 * soma dos quadrados de dois dos lados é igual ao quadrado da hipotenusa.
		 * Escreva um aplicativo para exibir uma tabela dos triplos de Pitágoras para
		 * side1, side2 e hypotenuse, todos não maiores que 500. Utilize um loop for
		 * triplamente aninhado que tenta todas as possibilidades. Esse é um método de
		 * computação de “força bruta”. Você aprenderá nos cursos de ciência da
		 * computação mais avançados que para muitos problemas interessantes não há uma
		 * abordagem algorítmica conhecida além do uso de força bruta absoluta.
		 * 
		 * 
		 * System.out.println("Calculando valores de catetos e hipotenusa!");
		 * System.out.printf("%5s / %5s / %5s %n","Cateto1","Cateto 2","hipotenusa");
		 * for(int lado1 = 1; lado1 <= 500; lado1++) { for(int lado2 = 1; lado2 <= 500;
		 * lado2++) { for(int hipotenusa = 1; hipotenusa <= 500; hipotenusa++) {
		 * if((hipotenusa*hipotenusa) == (lado1*lado1)+(lado2*lado2)) {
		 * System.out.printf("%7d %7d %9d%n",lado1, lado2, hipotenusa); } } } }
		 * 
		 * 5.22 (Programa de impressão de triângulos modificado) Modifique a Questão
		 * 5.15 para combinar seu código dos quatro triângulos de asteriscos separados,
		 * de modo que todos os quatro padrões sejam impressos lado a lado. [Dica: faça
		 * uso inteligente de loops for aninhados.]
		 */

		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if (j + 1 > i) {
					for (int a = 1; a <= 11 - i; a++) {
						System.out.printf("%s", " ");
					}
				}
			}
			
			for (int j = 10 - (i - 1); j >= 1; j--) {
				System.out.print("*");
				if (j <= 1) {
					for (int a = 1; a <= i; a++) {
						System.out.printf("%s", " ");
					}
				}
			}
			
			for (int j = 10 - (i - 1); j >= 1; j--) {
				if (j == 10-(i-1)) {
					for (int a = 1; a <= i-1; a++) {	
						System.out.print(" ");
					}
				}
				System.out.print("*");
			}
			
			for (int j = 10 - (i - 1); j >= 1; j--) {
				System.out.print(" ");
				if (j <= 1) {
					for (int a = 1; a <= i; a++) {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}

	}

	/*
	 * public static double vendeProduto(int produto, int quantidade, double preco)
	 * { double totalVendido = 0; switch (produto) { case 1: totalVendido +=
	 * quantidade * preco; break; case 2: totalVendido += quantidade * preco; break;
	 * case 3: totalVendido += quantidade * preco; break; case 4: totalVendido +=
	 * quantidade * preco; break; case 5: totalVendido += quantidade * preco; break;
	 * } return totalVendido; }
	 */
}
