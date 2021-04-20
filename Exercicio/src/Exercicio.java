
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
		
		System.out.println("Insira um número inteiro:");
		value = entrada.nextInt();
		
		if (value != 7) {
			System.out.println("The variable number is not equal to 7");
		}*/
		
		/*Questão 2.14 da segunda unidade. 
		 * Escreva um aplicativo que exiba os números 1 a 4 na mesma linha, com cada par de adjacentes separados por um espaço. Use as seguintes
			técnicas:
			a) Uma instrução System.out.println.
			b) Quatro instruções System.out.print.
			c) Uma instrução System.out.printf.
		
		System.out.println("1, 2, 3, 4");
		
		System.out.print("1, 2, 3, 4\n");
		
		int numero1 = 1;
		int numero2 = 2;
		int numero3 = 3;
		int numero4 = 4;
		
		System.out.printf("%d, %d, %d, %d",numero1,numero2,numero3,numero4);*/
		
		/*Questão 2.15 da segunda unidade. (Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números
		 *  e imprima sua
		 *   soma (resultado de uma soma),
		 *   produto (resultado de uma multiplicação), 
		 *   diferença (resultado de uma subtração)
		 *   quociente (divisão). 
		 *   Utilize as técnicas mostradas na Figura 2.7.
		
		int numero1;
		int numero2;
		int soma;
		int produto;
		int diferença;
		int quociente;
		
		System.out.println("Informe um valor:");
		numero1 = entrada.nextInt();
		
		System.out.println("Informe outro valor:");
		numero2 = entrada.nextInt();
		
		soma = numero1+numero2;
		
		produto = numero1*numero2;
		
		diferença = numero1-numero2;
		
		quociente = numero1/numero2;
		
		System.out.printf("|Soma: %d%n|Multiplicação: %d%n|Subtração: %d%n|Divisão: %d%n",soma,produto,diferença,quociente);*/
		
		/*Questão 2.16 da segunda unidade. (Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir dois inteiros,
		 *  obtenha dele esses números e exiba o númeromaior seguido pelas palavras “is larger".
		 *   Se os números forem iguais, imprima a mensagem “These numbers are equal". Utilizeas técnicas mostradas na Figura 2.15.
		
		int numero1;
		int numero2;
		

		System.out.println("Informe um valor:");
		numero1 = entrada.nextInt();
		
		System.out.println("Informe outro valor:");
		numero2 = entrada.nextInt();
		
		if(numero1 == numero2) {
			System.out.println("These numbers are equal");
		}*/
		
		/*Questão 2.17 da segunda unidade.(Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e
		 *  exiba a soma, média, produto e os números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. 
		 *  [Observação: o cálculo da média neste exercício deve resultar em uma representação de inteiro. 
		 *  Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...]
		
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
			System.out.print(numero1+" é maior que "+numero2+", ");
		}else if(numero1 < numero2) {
			System.out.print(numero1+" é menor que "+numero2+", ");
		}
		
		if(numero1 > numero3) {
			System.out.print(numero1+" é maior que "+numero3+", ");
		}else if(numero1 < numero3) {
			System.out.print(numero1+" é menor que "+numero3+", ");
		}
		
		if(numero2 > numero3) {
			System.out.print(numero2+" é maior que "+numero3+"\n");
		}else if(numero2 < numero3) {
			System.out.print(numero2+" é menor que "+numero3+"\n");
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
		
		/*2.24 - (Inteiros maiores e menores) Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e o menor inteiro
		no grupo. Utilize somente as técnicas de programação que você aprendeu neste capítulo.
		

		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int maior;
		int menor;


		System.out.println("Informe cinco números sequenciaisr:");
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();
		numero3 = entrada.nextInt();
		numero4 = entrada.nextInt();
		numero5 = entrada.nextInt();
		
		
		//verificando o menor número
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
		
		/*2.25 (Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador
		de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
		
		int numero1;
		
		System.out.println("Informe um números: ");
		numero1 = entrada.nextInt();
		
		if(numero1%2 == 0) {
			System.out.println(numero1+" é um número par");
		}else {
			System.out.println(numero1+" é um número ímpar");
		}*/
		
		/*2.26 (Múltiplos) Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e imprimir o resultado.
		[Dica: utilize o operador de resto.]
		
		int numero1;
		int numero2;
		
		System.out.println("Informe dois números sequenciais: ");
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();
		
		if(numero1%numero2 == 0) {
			System.out.println(numero1+" é um número multiplo de "+numero2);
		}else {
			System.out.println(numero1+" não é um número multiplo de "+numero2);
		}*/
		
		/*2.27 (Padrão de tabuleiro de damas de asteriscos) Escreva um aplicativo que exiba um padrão de tabuleiro de damas, como mostrado a seguir:
		
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");*/
		
		/*2.28 (Diâmetro, circunferência e área de um círculo) Eis uma prévia do que veremos mais adiante. Neste capítulo, você aprendeu sobre
		inteiros e o tipo int. O Java também pode representar números de pontos flutuantes que contêm pontos de fração decimal, como 3,14159.
		Escreva um aplicativo que leia a entrada a partir do usuário do raio de um círculo como um inteiro e imprima o diâmetro do círculo,
		circunferência e área utilizando o valor do ponto flutuante 3,14159 para pi. Utilize as técnicas mostradas na Figura 2.7. [Observação: você
		também pode empregar a constante Math.PI predefinida para o valor de pi. Essa constante é mais precisa que o valor 3,14159. A classe
		Math é definida no pacote java.lang. As classes nesse pacote são importadas automaticamente, portanto, você não precisa importar
		a classe Math para utilizá-la.] Adote as seguintes fórmulas (r é o raio):
		diâmetro = 2r
		circunferência = 2pir
		área = rpi2
		
		
		int raio;
		double Pi = 3.14159;
		
		
		System.out.println("Informe o raio r: ");
		raio = entrada.nextInt();
		
		System.out.printf("Diametro: %d%nCircunferência: %f%n", 2*raio, Pi*(2*raio));*/
		
		/*2.29 (O valor inteiro de um caractere) Eis outra prévia do que virá adiante. Neste capítulo, você aprendeu sobre inteiros e o tipo int. O
			Java também pode representar letras maiúsculas, minúsculas e uma variedade considerável de símbolos especiais. Cada caractere tem
			uma representação correspondente de inteiro. O conjunto de caracteres que um computador utiliza com as respectivas representações na
			forma de inteiro desses caracteres é chamado de conjunto de caracteres desse computador. Você pode indicar um valor de caractere em um
			programa simplesmente incluindo esse caractere entre aspas simples, como em ‘A'.
			Você pode determinar o equivalente em inteiro de um caractere precedendo-o com (int), como em
			(int) 'A'
			Um operador dessa forma é chamado operador de coerção. (Você aprenderá sobre os operadores de coerção no Capítulo 4.) A instrução
			a seguir gera saída de um caractere e seu equivalente de inteiro:
			System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
			Quando a instrução precedente executa, ela exibe o caractere A e o valor 65 (do conjunto de caracteres Unicode®) como parte da
			string. O especificador de formato %c é um espaço reservado para um caractere (nesse caso, ‘A').
			Utilizando instruções semelhantes àquela mostrada anteriormente neste exercício, escreva um aplicativo que exiba os equivalentes
			inteiros de algumas letras maiúsculas, minúsculas, dígitos e símbolos especiais. Mostre os equivalentes inteiros do seguinte: A B C a b c
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
		
		/*2.30 (Separando os dígitos em um inteiro) Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário,
		separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços. Por exemplo, se o usuário
		digitar o número 42339, o programa deve imprimir
		4 2 3 3 9
		
		int numero1;

		System.out.println("Informe um númeron com 5 dígitos: ");
		numero1 = entrada.nextInt();			
		System.out.print(numero1/100000+"\t");
		System.out.print(numero1/10000%10+"\t");
		System.out.print(numero1/1000%10+"\t");
		System.out.print(numero1/100%10+"\t");
		System.out.print(numero1/10%10+"\t");
		System.out.print(numero1/1%10);*/
		
		/*2.31 (Tabela de quadrados e cubos) Utilizando apenas as técnicas de programação que aprendeu neste capítulo, escreva um aplicativo que
			calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir:
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

		System.out.println("Informe um númeron : ");
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
		
		/*2.32 (Valores negativos, positivos e zero) Escreva um programa que insira cinco números, além de determinar e imprimir quantos negativos,
		quantos positivos e quantos zeros foram inseridos.
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int zero = 0;
		int positivo = 0;
		int negativo = 0;

		System.out.println("Informe cinco números: ");
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();
		numero3 = entrada.nextInt();
		numero4 = entrada.nextInt();
		numero5 = entrada.nextInt();
		
		if(numero1 < 0) {
			System.out.println(numero1+" é um valor negativo");
			negativo++;
		}else if(numero1 > 0) {
			System.out.println(numero1+" é um valor positivo");
			positivo++;
		}else {
			System.out.println(numero1+" é zero");
			zero++;
		}
		
		if(numero2 < 0) {
			System.out.println(numero2+" é um valor negativo");
			negativo++;
		}else if(numero2 > 0) {
			System.out.println(numero2+" é um valor positivo");
			positivo++;
		}else {
			System.out.println(numero2+" é zero");
			zero++;
		}
		
		if(numero3 < 0) {
			System.out.println(numero3+" é um valor negativo");
			negativo++;
		}else if(numero3 > 0) {
			System.out.println(numero3+" é um valor positivo");
			positivo++;
		}else {
			System.out.println(numero3+" é zero");
			zero++;
		}
		
		if(numero4 < 0) {
			System.out.println(numero4+" é um valor negativo");
			negativo++;
		}else if(numero4 > 0) {
			System.out.println(numero4+" é um valor positivo");
			positivo++;
		}else {
			System.out.println(numero4+" é zero");
			zero++;
		}
		
		if(numero5 < 0) {
			System.out.println(numero5+" é um valor negativo\n");
			negativo++;
		}else if(numero5 > 0) {
			System.out.println(numero5+" é um valor positivo\n");
			positivo++;
		}else {
			System.out.println(numero5+" é zero\n");
			zero++;
		}

		System.out.printf("Negativo: %d%nPositivos: %d%nZeros: %d%n",negativo,positivo,zero);*/
		
		/*2.33 (Calculadora de índice de massa corporal) Introduzimos a calculadora de índice de massa corporal (IMC) no Exercício 1.10. As fórmulas
		para calcular o IMC são
		IMC =
		pesoEmLibras × 703
		alturaEmPolegadas2
		ou
		IMC =
		pesoEmQuilogramas
		alturaEmMetros2
		Crie um aplicativo de calculadora IMC que leia o peso do usuário em libras e a altura em polegadas (ou, se preferir, o peso em quilogramas
		e a altura em metros) e, então, calcule e exiba o índice de massa corporal dele. Além disso, que exiba as seguintes informações do Department
		of Health and Human Services/National Institutes of Health, assim o usuário pode avaliar o seu IMC:
		
		BMI VALUES
		Underweight: less than 18.5
		Normal: between 18.5 and 24.9
		Overweight: between 25 and 29.9
		Obese: 30 or greater
		
		[Nota: neste capítulo, você aprendeu a utilizar o tipo int para representar números inteiros. Os cálculos de IMC, quando feitos com
		valores int, produzirão resultados com números inteiros. No Capítulo 3, você aprenderá a utilizar o tipo double para representar números
		com pontos decimais. Quando os cálculos de IMC
		
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
		
		/*2.34 (Calculadora de crescimento demográfico mundial) Utilize a internet para descobrir a população mundial atual e a taxa de crescimento
		demográfico mundial anual. Escreva um aplicativo que introduza esses valores e, então, que exiba a população mundial estimada
		depois de um, dois, três, quatro e cinco anos.
		
		System.out.println("População estimada em 1 ano: "+ ((1.2/100)*((77.000*100.000)*1)+(77.000*100.000))+" bilhões de habitantes");
		System.out.println("População estimada em 2 ano: "+ ((1.2/100)*((77.000*100.000)*2)+(77.000*100.000))+" bilhões de habitantes");
		System.out.println("População estimada em 3 ano: "+ ((1.2/100)*((77.000*100.000)*3)+(77.000*100.000))+" bilhões de habitantes");
		System.out.println("População estimada em 4 ano: "+ ((1.2/100)*((77.000*100.000)*4)+(77.000*100.000))+" bilhões de habitantes");
		System.out.println("População estimada em 5 ano: "+ ((1.2/100)*((77.000*100.000)*5)+(77.000*100.000))+" bilhões de habitantes");*/
		
		/*2.35 (Calculadora de economia da faixa solidária) Pesquise vários sites sobre faixa solidária. Crie um aplicativo que calcule o custo diário
		de dirigir, para estimar quanto dinheiro pode ser economizado com o uso da faixa solidária, que também tem outras vantagens, como
		reduzir emissões de carbono e congestionamento de tráfego. O aplicativo deve introduzir as seguintes informações e exibir o custo por dia
		de dirigir para o trabalho do usuário:
		a) Quilômetros totais dirigidos por dia.
		b) Preço por litro de gasolina.
		c) Quilômetros médios por litro.
		d) Taxas de estacionamento por dia.
		e) Pedágio por dia.
		
		int totKm;
		int precoL;
		int mediaL;
		int taxaEstac;
		int pedagioDia;

		System.out.println("Informe a quantidade de KM rodados diariamente para chegar ao seu trablho: ");
		totKm = entrada.nextInt();		
		System.out.println("Preço por litro de gasolina: ");
		precoL = entrada.nextInt();
		System.out.println("Quilômetros médios por litro: ");
		mediaL = entrada.nextInt();
		System.out.println("Taxas de estacionamento por dia: ");
		taxaEstac = entrada.nextInt();
		System.out.println("Pedágio por dia: ");
		pedagioDia = entrada.nextInt();
		
		System.out.println("Gastos na diário: "+((totKm/mediaL)*precoL+(pedagioDia*2)+(taxaEstac)));*/
		
	}

}
