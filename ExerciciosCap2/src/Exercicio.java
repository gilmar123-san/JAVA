
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		//Exercicio 2.3 do livro, segunda unidade - letra (a;
		/*int c;
		int thisIsAVariable;
		int q76354;
		int number;
		int value;
		
		System.out.print("This is a Java\n program\n\n");
		
		System.out.println("Insira um n�mero inteiro:");
		value = entrada.nextInt();
		
		if (value != 7) {
			System.out.println("The variable number is not equal to 7");
		}*/
		
		/*Quest�o 2.14 da segunda unidade. 
		 * Escreva um aplicativo que exiba os n�meros 1 a 4 na mesma linha, com cada par de adjacentes separados por um espa�o. Use as seguintes
			t�cnicas:
			a) Uma instru��o System.out.println.
			b) Quatro instru��es System.out.print.
			c) Uma instru��o System.out.printf.
		
		System.out.println("1, 2, 3, 4");
		
		System.out.print("1, 2, 3, 4\n");
		
		int numero1 = 1;
		int numero2 = 2;
		int numero3 = 3;
		int numero4 = 4;
		
		System.out.printf("%d, %d, %d, %d",numero1,numero2,numero3,numero4);*/
		
		/*Quest�o 2.15 da segunda unidade. (Aritm�tica) Escreva um aplicativo que solicite ao usu�rio inserir dois inteiros, obtenha dele esses n�meros
		 *  e imprima sua
		 *   soma (resultado de uma soma),
		 *   produto (resultado de uma multiplica��o), 
		 *   diferen�a (resultado de uma subtra��o)
		 *   quociente (divis�o). 
		 *   Utilize as t�cnicas mostradas na Figura 2.7.
		
		int numero1;
		int numero2;
		int soma;
		int produto;
		int diferen�a;
		int quociente;
		
		System.out.println("Informe um valor:");
		numero1 = entrada.nextInt();
		
		System.out.println("Informe outro valor:");
		numero2 = entrada.nextInt();
		
		soma = numero1+numero2;
		
		produto = numero1*numero2;
		
		diferen�a = numero1-numero2;
		
		quociente = numero1/numero2;
		
		System.out.printf("|Soma: %d%n|Multiplica��o: %d%n|Subtra��o: %d%n|Divis�o: %d%n",soma,produto,diferen�a,quociente);*/
		
		/*Quest�o 2.16 da segunda unidade. (Comparando inteiros) Escreva um aplicativo que solicite ao usu�rio inserir dois inteiros,
		 *  obtenha dele esses n�meros e exiba o n�meromaior seguido pelas palavras �is larger".
		 *   Se os n�meros forem iguais, imprima a mensagem �These numbers are equal". Utilizeas t�cnicas mostradas na Figura 2.15.
		
		int numero1;
		int numero2;
		

		System.out.println("Informe um valor:");
		numero1 = entrada.nextInt();
		
		System.out.println("Informe outro valor:");
		numero2 = entrada.nextInt();
		
		if(numero1 == numero2) {
			System.out.println("These numbers are equal");
		}*/
		
		/*Quest�o 2.17 da segunda unidade.(Aritm�tica, menor e maior) Escreva um aplicativo que insira tr�s inteiros digitados pelo usu�rio e
		 *  exiba a soma, m�dia, produto e os n�meros menores e maiores. Utilize as t�cnicas mostradas na Figura 2.15. 
		 *  [Observa��o: o c�lculo da m�dia neste exerc�cio deve resultar em uma representa��o de inteiro. 
		 *  Assim, se a soma dos valores for 7, a m�dia dever� ser 2, n�o 2,3333...]
		
		int numero1;
		int numero2;
		int numero3;
		int soma;
		int produto;
		int media;
		
		System.out.println("Informe o primeiro valor:");
		numero1 = entrada.nextInt();
		
		System.out.println("Informe o segundo valor:");
		numero2 = entrada.nextInt();
		
		System.out.println("Informe o terceiro valor:");
		numero3 = entrada.nextInt();
		
		soma = numero1+numero2+numero3;
		media = (numero1+numero2+numero3)/3;
		produto = numero1*numero2*numero3;
		
		if(numero1 > numero2) {
			System.out.print(numero1+" � maior que "+numero2+", ");
		}else if(numero1 < numero2) {
			System.out.print(numero1+" � menor que "+numero2+", ");
		}
		
		if(numero1 > numero3) {
			System.out.print(numero1+" � maior que "+numero3+", ");
		}else if(numero1 < numero3) {
			System.out.print(numero1+" � menor que "+numero3+", ");
		}
		
		if(numero2 > numero3) {
			System.out.print(numero2+" � maior que "+numero3+"\n");
		}else if(numero2 < numero3) {
			System.out.print(numero2+" � menor que "+numero3+"\n");
		}
		
		System.out.printf("Soma: %d%nMedia: %d%nProduto: %d%n", soma, media, produto);*/
		
		/*2.18 (Exibindo formas com asteriscos) Escreva um aplicativo que exiba uma caixa, uma elipse, uma seta e um losango utilizando asteriscos
		(*), como segue:
		
		System.out.println("*********    ***     *       *");
		System.out.println("*       *   *   *   ***     * *");
		System.out.println("*       *   *   *  *****   *   *");
		System.out.println("*       *   *   *    *    *     *");
		System.out.println("*       *   *   *    *     *   *");
		System.out.println("*       *   *   *    *      * *");
		System.out.println("*********    ***     *       *");*/
		
		/*2.24 - (Inteiros maiores e menores) Escreva um aplicativo que leia cinco inteiros, al�m de determinar e imprimir o maior e o menor inteiro
		no grupo. Utilize somente as t�cnicas de programa��o que voc� aprendeu neste cap�tulo.
		

		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int maior;
		int menor;


		System.out.println("Informe cinco n�meros sequenciaisr:");
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();
		numero3 = entrada.nextInt();
		numero4 = entrada.nextInt();
		numero5 = entrada.nextInt();
		
		
		//verificando o menor n�mero
		if(numero1 < numero2) {
			menor = numero1;
			maior = numero2;
		}else {
			menor = numero2;
			maior = numero1;
		}
		
		if(menor < numero3) {
			menor = menor;
			if(maior < numero3) {
				maior = numero3;
			}
		}else {
			menor = numero3;
		}
		
		if(menor < numero4) {
			menor = menor;		
			if(maior < numero4) {
				maior = numero4;
			}
		}else {
			menor = numero4;
		}
		
		if(menor < numero5) {
			menor = menor;	
			if(maior < numero5) {
				maior = numero5;
			}
		}else {
			menor = numero5;
		}
		
		System.out.printf("Menor: %d%nMaior: %d", menor,maior);*/
		
		/*2.25 (�mpar ou par) Escreva um aplicativo que leia um inteiro, al�m de determinar e imprimir se ele � �mpar ou par. [Dica: utilize o operador
		de resto. Um n�mero par � um m�ltiplo de 2. Qualquer m�ltiplo de 2 deixa um resto 0 quando dividido por 2.]
		
		int numero1;
		
		System.out.println("Informe um n�meros: ");
		numero1 = entrada.nextInt();
		
		if(numero1%2 == 0) {
			System.out.println(numero1+" � um n�mero par");
		}else {
			System.out.println(numero1+" � um n�mero �mpar");
		}*/
		
		/*2.26 (M�ltiplos) Escreva um aplicativo que leia dois inteiros, al�m de determinar se o primeiro � um m�ltiplo do segundo e imprimir o resultado.
		[Dica: utilize o operador de resto.]
		
		int numero1;
		int numero2;
		
		System.out.println("Informe dois n�meros sequenciais: ");
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();
		
		if(numero1%numero2 == 0) {
			System.out.println(numero1+" � um n�mero multiplo de "+numero2);
		}else {
			System.out.println(numero1+" n�o � um n�mero multiplo de "+numero2);
		}*/
		
		/*2.27 (Padr�o de tabuleiro de damas de asteriscos) Escreva um aplicativo que exiba um padr�o de tabuleiro de damas, como mostrado a seguir:
		
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");*/
		
		/*2.28 (Di�metro, circunfer�ncia e �rea de um c�rculo) Eis uma pr�via do que veremos mais adiante. Neste cap�tulo, voc� aprendeu sobre
		inteiros e o tipo int. O Java tamb�m pode representar n�meros de pontos flutuantes que cont�m pontos de fra��o decimal, como 3,14159.
		Escreva um aplicativo que leia a entrada a partir do usu�rio do raio de um c�rculo como um inteiro e imprima o di�metro do c�rculo,
		circunfer�ncia e �rea utilizando o valor do ponto flutuante 3,14159 para pi. Utilize as t�cnicas mostradas na Figura 2.7. [Observa��o: voc�
		tamb�m pode empregar a constante Math.PI predefinida para o valor de pi. Essa constante � mais precisa que o valor 3,14159. A classe
		Math � definida no pacote java.lang. As classes nesse pacote s�o importadas automaticamente, portanto, voc� n�o precisa importar
		a classe Math para utiliz�-la.] Adote as seguintes f�rmulas (r � o raio):
		di�metro = 2r
		circunfer�ncia = 2pir
		�rea = rpi2
		
		
		int raio;
		double Pi = 3.14159;
		
		
		System.out.println("Informe o raio r: ");
		raio = entrada.nextInt();
		
		System.out.printf("Diametro: %d%nCircunfer�ncia: %f%n", 2*raio, Pi*(2*raio));*/
		
		/*2.29 (O valor inteiro de um caractere) Eis outra pr�via do que vir� adiante. Neste cap�tulo, voc� aprendeu sobre inteiros e o tipo int. O
			Java tamb�m pode representar letras mai�sculas, min�sculas e uma variedade consider�vel de s�mbolos especiais. Cada caractere tem
			uma representa��o correspondente de inteiro. O conjunto de caracteres que um computador utiliza com as respectivas representa��es na
			forma de inteiro desses caracteres � chamado de conjunto de caracteres desse computador. Voc� pode indicar um valor de caractere em um
			programa simplesmente incluindo esse caractere entre aspas simples, como em �A'.
			Voc� pode determinar o equivalente em inteiro de um caractere precedendo-o com (int), como em
			(int) 'A'
			Um operador dessa forma � chamado operador de coer��o. (Voc� aprender� sobre os operadores de coer��o no Cap�tulo 4.) A instru��o
			a seguir gera sa�da de um caractere e seu equivalente de inteiro:
			System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
			Quando a instru��o precedente executa, ela exibe o caractere A e o valor 65 (do conjunto de caracteres Unicode�) como parte da
			string. O especificador de formato %c � um espa�o reservado para um caractere (nesse caso, �A').
			Utilizando instru��es semelhantes �quela mostrada anteriormente neste exerc�cio, escreva um aplicativo que exiba os equivalentes
			inteiros de algumas letras mai�sculas, min�sculas, d�gitos e s�mbolos especiais. Mostre os equivalentes inteiros do seguinte: A B C a b c
			0 1 2 $ * + / e o caractere em branco.
		
		System.out.printf("%c %d%n", 'A',((int) 'A'));
		System.out.printf("%c %d%n", 'B',((int) 'B'));
		System.out.printf("%c %d%n", 'C',((int) 'C'));
		System.out.printf("%c %d%n", 'a',((int) 'a'));
		System.out.printf("%c %d%n", 'b',((int) 'b'));
		System.out.printf("%c %d%n", 'c',((int) 'c'));
		System.out.printf("%c %d%n", '0',((int) '0'));
		System.out.printf("%c %d%n", '1',((int) '1'));
		System.out.printf("%c %d%n", '2',((int) '2'));
		System.out.printf("%c %d%n", '*',((int) '*'));
		System.out.printf("%c %d%n", '+',((int) '+'));
		System.out.printf("%c %d%n", '/',((int) '/'));
		System.out.printf("%c %d", ' ',((int) ' '));*/
		
		/*2.30 (Separando os d�gitos em um inteiro) Escreva um aplicativo que insira um n�mero consistindo em cinco d�gitos a partir do usu�rio,
		separe o n�mero em seus d�gitos individuais e imprima os d�gitos separados uns dos outros por tr�s espa�os. Por exemplo, se o usu�rio
		digitar o n�mero 42339, o programa deve imprimir
		4 2 3 3 9
		
		int numero1;

		System.out.println("Informe um n�meron com 5 d�gitos: ");
		numero1 = entrada.nextInt();			
		System.out.print(numero1/100000+"\t");
		System.out.print(numero1/10000%10+"\t");
		System.out.print(numero1/1000%10+"\t");
		System.out.print(numero1/100%10+"\t");
		System.out.print(numero1/10%10+"\t");
		System.out.print(numero1/1%10);*/
		
		/*2.31 (Tabela de quadrados e cubos) Utilizando apenas as t�cnicas de programa��o que aprendeu neste cap�tulo, escreva um aplicativo que
			calcule os quadrados e cubos dos n�meros de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir:
			number square cube
			0 		0 		0
			1 		1 		1
			2 		4 		8
			3 		9 		27
			4 		16 		64
			5 		25 		125
			6 		36 		216
			7 		49 		343
			8 		64 		512
			9 		81 		729
			10 		100 	1000
		
		int numero1;

		System.out.println("Informe um n�meron : ");
		numero1 = entrada.nextInt();
		
		System.out.print(numero1+"\t"+numero1*(numero1)+"\t"+numero1*(numero1)*(numero1)+"\n");
		System.out.print(numero1+1+"\t"+(numero1+1)*(numero1+1)+"\t"+(numero1+1)*(numero1+1)*(numero1+1)+"\n");
		System.out.print(numero1+2+"\t"+(numero1+2)*(numero1+2)+"\t"+(numero1+2)*(numero1+2)*(numero1+2)+"\n");
		System.out.print(numero1+3+"\t"+(numero1+3)*(numero1+3)+"\t"+(numero1+3)*(numero1+3)*(numero1+3)+"\n");
		System.out.print(numero1+4+"\t"+(numero1+4)*(numero1+4)+"\t"+(numero1+4)*(numero1+4)*(numero1+4)+"\n");
		System.out.print(numero1+5+"\t"+(numero1+5)*(numero1+5)+"\t"+(numero1+5)*(numero1+5)*(numero1+5)+"\n");
		System.out.print(numero1+6+"\t"+(numero1+6)*(numero1+6)+"\t"+(numero1+6)*(numero1+6)*(numero1+6)+"\n");
		System.out.print(numero1+7+"\t"+(numero1+7)*(numero1+7)+"\t"+(numero1+7)*(numero1+7)*(numero1+7)+"\n");
		System.out.print(numero1+8+"\t"+(numero1+8)*(numero1+8)+"\t"+(numero1+8)*(numero1+8)*(numero1+8)+"\n");
		System.out.print(numero1+9+"\t"+(numero1+9)*(numero1+9)+"\t"+(numero1+9)*(numero1+9)*(numero1+9)+"\n");*/
		
		/*2.32 (Valores negativos, positivos e zero) Escreva um programa que insira cinco n�meros, al�m de determinar e imprimir quantos negativos,
		quantos positivos e quantos zeros foram inseridos.
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int zero = 0;
		int positivo = 0;
		int negativo = 0;

		System.out.println("Informe cinco n�meros: ");
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();
		numero3 = entrada.nextInt();
		numero4 = entrada.nextInt();
		numero5 = entrada.nextInt();
		
		if(numero1 < 0) {
			System.out.println(numero1+" � um valor negativo");
			negativo++;
		}else if(numero1 > 0) {
			System.out.println(numero1+" � um valor positivo");
			positivo++;
		}else {
			System.out.println(numero1+" � zero");
			zero++;
		}
		
		if(numero2 < 0) {
			System.out.println(numero2+" � um valor negativo");
			negativo++;
		}else if(numero2 > 0) {
			System.out.println(numero2+" � um valor positivo");
			positivo++;
		}else {
			System.out.println(numero2+" � zero");
			zero++;
		}
		
		if(numero3 < 0) {
			System.out.println(numero3+" � um valor negativo");
			negativo++;
		}else if(numero3 > 0) {
			System.out.println(numero3+" � um valor positivo");
			positivo++;
		}else {
			System.out.println(numero3+" � zero");
			zero++;
		}
		
		if(numero4 < 0) {
			System.out.println(numero4+" � um valor negativo");
			negativo++;
		}else if(numero4 > 0) {
			System.out.println(numero4+" � um valor positivo");
			positivo++;
		}else {
			System.out.println(numero4+" � zero");
			zero++;
		}
		
		if(numero5 < 0) {
			System.out.println(numero5+" � um valor negativo\n");
			negativo++;
		}else if(numero5 > 0) {
			System.out.println(numero5+" � um valor positivo\n");
			positivo++;
		}else {
			System.out.println(numero5+" � zero\n");
			zero++;
		}

		System.out.printf("Negativo: %d%nPositivos: %d%nZeros: %d%n",negativo,positivo,zero);*/
		
		/*2.33 (Calculadora de �ndice de massa corporal) Introduzimos a calculadora de �ndice de massa corporal (IMC) no Exerc�cio 1.10. As f�rmulas
		para calcular o IMC s�o
		IMC =
		pesoEmLibras � 703
		alturaEmPolegadas2
		ou
		IMC =
		pesoEmQuilogramas
		alturaEmMetros2
		Crie um aplicativo de calculadora IMC que leia o peso do usu�rio em libras e a altura em polegadas (ou, se preferir, o peso em quilogramas
		e a altura em metros) e, ent�o, calcule e exiba o �ndice de massa corporal dele. Al�m disso, que exiba as seguintes informa��es do Department
		of Health and Human Services/National Institutes of Health, assim o usu�rio pode avaliar o seu IMC:
		
		BMI VALUES
		Underweight: less than 18.5
		Normal: between 18.5 and 24.9
		Overweight: between 25 and 29.9
		Obese: 30 or greater
		
		[Nota: neste cap�tulo, voc� aprendeu a utilizar o tipo int para representar n�meros inteiros. Os c�lculos de IMC, quando feitos com
		valores int, produzir�o resultados com n�meros inteiros. No Cap�tulo 3, voc� aprender� a utilizar o tipo double para representar n�meros
		com pontos decimais. Quando os c�lculos de IMC
		
		double peso;
		double altura;

		System.out.println("Informe seu peso: ");
		 peso = entrada.nextDouble();
		 
		System.out.println("Informe sua altura: ");
		altura = entrada.nextDouble();
		 
		 System.out.println("IMC: "+peso/altura);
		 
		 System.out.println("VALORES DE IMC");
		 System.out.println("Abaixo do peso: menos de 18,5 ");
		 System.out.println("Normal: entre 18,5 e 24,9");
		 System.out.println("Sobrepeso: entre 25 e 29,9");
		 System.out.println("Obeso: 30 ou mais");*/
		
		/*2.34 (Calculadora de crescimento demogr�fico mundial) Utilize a internet para descobrir a popula��o mundial atual e a taxa de crescimento
		demogr�fico mundial anual. Escreva um aplicativo que introduza esses valores e, ent�o, que exiba a popula��o mundial estimada
		depois de um, dois, tr�s, quatro e cinco anos.
		
		System.out.println("Popula��o estimada em 1 ano: "+ ((1.2/100)*((77.000*100.000)*1)+(77.000*100.000))+" bilh�es de habitantes");
		System.out.println("Popula��o estimada em 2 ano: "+ ((1.2/100)*((77.000*100.000)*2)+(77.000*100.000))+" bilh�es de habitantes");
		System.out.println("Popula��o estimada em 3 ano: "+ ((1.2/100)*((77.000*100.000)*3)+(77.000*100.000))+" bilh�es de habitantes");
		System.out.println("Popula��o estimada em 4 ano: "+ ((1.2/100)*((77.000*100.000)*4)+(77.000*100.000))+" bilh�es de habitantes");
		System.out.println("Popula��o estimada em 5 ano: "+ ((1.2/100)*((77.000*100.000)*5)+(77.000*100.000))+" bilh�es de habitantes");*/
		
		/*2.35 (Calculadora de economia da faixa solid�ria) Pesquise v�rios sites sobre faixa solid�ria. Crie um aplicativo que calcule o custo di�rio
		de dirigir, para estimar quanto dinheiro pode ser economizado com o uso da faixa solid�ria, que tamb�m tem outras vantagens, como
		reduzir emiss�es de carbono e congestionamento de tr�fego. O aplicativo deve introduzir as seguintes informa��es e exibir o custo por dia
		de dirigir para o trabalho do usu�rio:
		a) Quil�metros totais dirigidos por dia.
		b) Pre�o por litro de gasolina.
		c) Quil�metros m�dios por litro.
		d) Taxas de estacionamento por dia.
		e) Ped�gio por dia.
		
		int totKm;
		int precoL;
		int mediaL;
		int taxaEstac;
		int pedagioDia;

		System.out.println("Informe a quantidade de KM rodados diariamente para chegar ao seu trablho: ");
		totKm = entrada.nextInt();		
		System.out.println("Pre�o por litro de gasolina: ");
		precoL = entrada.nextInt();
		System.out.println("Quil�metros m�dios por litro: ");
		mediaL = entrada.nextInt();
		System.out.println("Taxas de estacionamento por dia: ");
		taxaEstac = entrada.nextInt();
		System.out.println("Ped�gio por dia: ");
		pedagioDia = entrada.nextInt();
		
		System.out.println("Gastos na di�rio: "+((totKm/mediaL)*precoL+(pedagioDia*2)+(taxaEstac)));*/
		entrada.close();
	}

}
