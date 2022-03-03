import java.util.Scanner;
import java.security.SecureRandom;

public class ChamadaExercicioCap5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/*
		 * 5.1 Desenhe 12 c�rculos conc�ntricos no centro de um JPanel (Figura 5.29). O
		 * c�rculo mais interno deve ter um raio de 10 pixels e cada c�rculo sucessivo
		 * deve ter um raio de 10 pixels maior que o anterior. Comece localizando o
		 * centro do JPanel. Para obter o canto superior esquerdo de um c�rculo, mova-se
		 * um raio para cima e um raio para a esquerda a partir do centro. A largura e a
		 * altura do ret�ngulo delimitador t�m o mesmo di�metro do c�rculo (isto �, duas
		 * vezes o raio).
		 * 
		 * 5.2 Modifique a Quest�o 5.16 no final dos exerc�cios do cap�tulo para ler a
		 * entrada utilizando di�logos e exibir o gr�fico de barras usando ret�ngulos de
		 * comprimentos variados.
		 * 
		 * String escolha = JOptionPane.
		 * showInputDialog("Informe 1 para desenhar retangulos\nInforme 2 para desenhar ovais\nInforme 3 para desenhar tudo junto."
		 * ); int decisao = Integer.parseInt(escolha);
		 * 
		 * int [] retornoCliente = new int [5]; int contador=0; do { String escolha =
		 * JOptionPane.showInputDialog("Informe 5 n�meros entre 1 e 30:"); int decisao =
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
		 * 5.3 Escreva uma instru��o Java ou um conjunto de instru��es Java para
		 * realizar cada uma das seguintes tarefas: a) Some os inteiros �mpares entre 1
		 * e 99 utilizando uma instru��o for. Assuma que as vari�veis de inteiro sum e
		 * count foram declaradas. int sum = 0; for(int count = 1 ; count < 100 ;
		 * count++) { if((count%2) != 0) { sum += count;
		 * System.out.println("N�mero impar: "+count); System.out.println("Soma: "+sum);
		 * } }
		 * 
		 * b) Calcule o valor de 2.5 elevado � pot�ncia de 3, utilizando o m�todo pow.
		 * 
		 * double resultado = Math.pow(2.5,3);
		 * System.out.println("Resultado: "+resultado);
		 * 
		 * c) Imprima os inteiros de 1 a 20, utilizando um loop while e a vari�vel
		 * contadora i. Assuma que a vari�vel i foi declarada, mas n�o foi inicializada.
		 * Imprima apenas cinco inteiros por linha. [Dica: utilize o c�lculo i % 5.
		 * Quando o valor dessa express�o for 0, imprima um caractere de nova linha;
		 * caso contr�rio, imprima um caractere de tabula��o. Assuma que esse c�digo �
		 * um aplicativo. Utilize o m�todo System.out.println () para imprimir o
		 * caractere de nova linha, e utilize o m�todo System.out.print ('\t') para
		 * imprimir o caractere de tabula��o.]
		 * 
		 * int i = 1; while(i <= 20) { if(i % 5 == 1 && i != 1) { System.out.println();
		 * } System.out.print(i+","); i++; }
		 * 
		 * d) Repita a parte (c) utilizando uma instru��o for.
		 * 
		 * for(int i = 1; i <=* 20;i++) { if(i % 5 == 1 && i != 1) {
		 * System.out.println(); } System.out.print(i+","); }
		 * 
		 * 
		 * 5.11 (Localize o menor valor) Escreva um aplicativo que localiza o menor de
		 * v�rios n�meros inteiros. Suponha que o primeiro valor lido especifica o
		 * n�mero de valores a serem inseridos pelo usu�rio.
		 * 
		 * System.out.println("informe quantos n�meros ser�o inseridos:"); int contador
		 * = input.nextInt(); int[] vetor = new int[contador]; int aux = 0; contador =
		 * 0; System.out.println("Gerando n�meros aleatoriamente..."+"\n"); SecureRandom
		 * random = new SecureRandom(); while (contador < vetor.length) {
		 * vetor[contador] = random.nextInt(); if (contador == 0) { aux =
		 * vetor[contador]; } else if (vetor[contador] < aux) { aux = vetor[contador]; }
		 * contador++; } System.out.println("O menor n�mero �: "+aux);
		 * 
		 * 5.12 (Calculando o produto de n�meros inteiros �mpares) Escreva um aplicativo
		 * que calcula o produto dos n�meros inteiros �mpares de 1 a 15.
		 * 
		 * 
		 * int i = 0; int res = 0; for (i = 1; i <= 15; i++) { if (i % 2 != 0) {
		 * if(i==1) { res = i; } System.out.printf("Multiplicando %d por %d...%n",i,
		 * res); res *=i; System.out.printf("Resultado: %d%n", res); } }
		 * 
		 * 5.13 (Fatoriais) Fatoriais costumam ser utilizados em problemas de
		 * probabilidade. O fatorial de um inteiro positivo n (escrito como n! e
		 * pronunciado como �fatorial de n�) � igual ao produto dos n�meros inteiros
		 * positivos de 1 a n. Escreva um aplicativo que calcula os fatoriais de 1 a 20.
		 * Utilize o tipo long. Exiba os resultados em formato tabular. Que dificuldade
		 * poderia impedir voc� de calcular o fatorial de 100?
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
		 * double amount; // quantia em dep�sito ao fim de cada ano double principal =
		 * 0; // quantidade inicial antes dos juros double rate = 0; // taxa de juros
		 * 
		 * System.out.println("Informe o valor a ser calculado:"); principal =
		 * input.nextInt();
		 * 
		 * // exibe cabe�alhos System.out.printf("%s%20s %n", "Year",
		 * "Amount on deposit");
		 * 
		 * for (int i = 5; i < 10; i++) { rate = (double)i / 100; // calcula quantidade
		 * de dep�sito para cada um dos dez anos for (int year = 1; year <= 10; ++year)
		 * { // calcula nova quantidade durante ano especificado amount = principal *
		 * Math.pow(1.0 + rate, year);
		 * 
		 * // exibe o ano e a quantidade � System.out.printf("%4d%,20.2f%n", year,
		 * amount); } System.out.println(); }
		 * 
		 * 5.15 (Programa para impress�o de tri�ngulos) Escreva um aplicativo que exibe
		 * os seguintes padr�es separadamente, um embaixo do outro. Utilize loops for
		 * para gerar os padr�es. Todos os asteriscos (*) devem ser impressos por uma
		 * �nica instru��o na forma System.out. print('*'); o que faz com que os
		 * asteriscos sejam impressos lado a lado. Uma instru��o na forma
		 * System.out.println(); pode ser utilizada para mover-se para a pr�xima linha.
		 * Uma instru��o na forma System.out.print(' '); pode ser utilizada para exibir
		 * um espa�o para os �ltimos dois padr�es. N�o deve haver outras instru��es de
		 * sa�da no programa. [Dica: os dois �ltimos padr�es requerem que cada linha
		 * inicie com um n�mero adequado de espa�os em branco.] (a) (b) (c) (d)
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
		 * 5.16 (Gr�fico de barras do programa de impress�o) Uma aplica��o interessante
		 * dos computadores � exibir diagramas e gr�ficos de barras. Escreva um
		 * aplicativo que leia cinco n�meros entre 1 e 30. Para cada n�mero que � lido,
		 * seu programa deve exibir o mesmo n�mero de asteriscos adjacentes. Por
		 * exemplo, se seu programa l� o n�mero 7, ele deve exibir *******. Exiba as
		 * barras dos asteriscos depois de ler os cinco n�meros.
		 * 
		 * 
		 * int[] vetor = new int[5]; int i = 0; SecureRandom numberRandom = new
		 * SecureRandom();
		 * System.out.println("Gerando 5 n�meros aleat�rios entre 1 e 30:"); while (i <
		 * vetor.length) { vetor[i] = 1 + numberRandom.nextInt(30); i++; };
		 * 
		 * for(i = 0; i < vetor.length; i++) { for(int j = 0; j < vetor[i]; j++) {
		 * System.out.print("*"); } System.out.print(" - "+vetor[i]);
		 * System.out.println(); }
		 * 
		 * 5.17 (Calculando vendas) Um varejista on-line vende cinco produtos cujos
		 * pre�os no varejo s�o como a seguir: produto 1, US$ 2,98; produto 2, US$ 4,50;
		 * produto 3, US$ 9,98; produto 4, US$ 4,49 e produto 5, US$ 6,87. Escreva um
		 * aplicativo que leia uma s�rie de pares de n�meros como segue: a) n�mero de
		 * produto b) quantidade vendida Seu programa deve utilizar uma instru��o switch
		 * para determinar o pre�o de varejo de cada produto. Voc� deve calcular e
		 * exibir o valor de varejo total de todos os produtos vendidos. Utilize um loop
		 * controlado por sentinela para determinar quando o programa deve parar o loop
		 * e exibir os resultados finais.
		 */
		
	}
}
