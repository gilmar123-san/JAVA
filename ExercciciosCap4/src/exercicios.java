
import java.util.Scanner;
import javax.swing.JOptionPane;

public class exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		/*4.3 Escreva quatro instru��es Java diferentes que adicionam 1 � vari�vel de inteiro x.
		
		int X=0;
		
		System.out.printf("4.3 - %n%n Informe o valor de X: %n");
		X = entrada.nextInt();
		
		X = X + 1;
		X +=1;
		X++;
		++X;
		 
		System.out.printf("X: %d %n%n", X);*/
		
		
		/*4.4 Escreva instru��es Java para realizar cada uma das seguintes tarefas:
			a) Utilize uma instru��o para atribuir a soma de x e y a z, em seguida, incremente x por 1.
			b) Teste se a vari�vel contador � maior do que 10. Se for, imprima "Contador � maior que 10".
			c) Utilize uma instru��o para decrementar a vari�vel x por 1, ent�o subtraia-o da vari�vel total e armazene o resultado na vari�vel
			total.
			d) Calcule o resto ap�s q ser dividido por divisor e atribua o resultado a q. Escreva essa instru��o de duas maneiras diferentes.
		
		//A z = x++ + y;
		
		System.out.println("A) \n");
		
		int x, y, z;
		
		System.out.println("Informe os valores de x, y e z na sequ�ncia:");
		x = entrada.nextInt();
		y= entrada.nextInt();
		z= entrada.nextInt();
		
		z = x+y;
		x++;
		
		System.out.printf("O valor de x �: %d %n O valor de z:%d %n%n ", x, z);
		
		//B
		
		System.out.println("B) \n");
		
		int contador;
		
		System.out.println("Informe o valore do contador:");
		contador = entrada.nextInt();
		
		if(contador>10) {
			System.out.println("Contador � maior que 10 \n");
		}
		
		
		//C total -= --x;
		
		System.out.println("C) \n");
		
		int total=0;
		X=0;
		
		System.out.println("Informe o valore de X:");
		X = entrada.nextInt();
		X--;		
		total -= X;
		
		System.out.println("Total: "+total+"\n");
		
		//D
		
		System.out.println("D) \n");
		
		int divisor;
		int q;
		
		System.out.println("Informe os valores de q e seu divisor na sequ�ncia:");
		q = entrada.nextInt();
		divisor = entrada.nextInt();

		q = q%divisor;
		
		q %=divisor;
		
		System.out.println("Resto: "+q);*/
		
		/*4.5 Escreva uma instru��o Java para realizar cada uma das seguintes tarefas:
		
		a) Declarar vari�veis sum do tipo int e inicialize-as como 0.
		
		int sum = 0;
		
		b) Declarar vari�veis x do tipo int e inicialize-as como 0.
		
		int x = 0;
		
		c) Adicione a vari�vel x � vari�vel sum, e atribua o resultado � vari�vel sum.
		
		System.out.println("Informe o valor de x:");
		x = entrada.nextInt();
		
		sum += x;
		
		d) Imprima "A soma �: " seguido pelo valor da vari�vel sum.
		
		System.out.println("A soma �: "+sum);*/
		
		/*4.6 Combine as instru��es escritas no Exerc�cio 4.5 em um aplicativo Java que calcula e imprime a soma dos inteiros de 1 a 10. Utilize a instru��o
		while para fazer loop pelas instru��es de c�lculo e incremento. O loop deve terminar quando o valor de x tornar-se 11.
		
		int sum = 0;
		int x = 0;
		
		while(x < 11) {
			System.out.println(x);
			sum += x;
			
			x++;
		}
		
		System.out.println("A soma �: "+sum);*/
		
		/*4.7 Determine o valor das vari�veis na instru��o product *= x++; depois que o c�lculo � realizado. Suponha que todas as vari�veis sejam
		do tipo int e inicialmente tenham o valor 5. Product = 25, X = 6*/
		
		/*4.8 Identifique e corrija os erros em cada um dos seguintes conjuntos de c�digo:
		
		//a)
		int product = 1;
		int c = 0;
		
			while (c <= 5){
				
				System.out.println(c);
				product = product * c;
				System.out.println(product);
				++c;
			
			}
			
		System.out.println("O valor de product �: "+product);
		
		//b) 
		
		int gender = 0;
		
		if (gender == 1) {
			System.out.println("Woman");
		}else {
			System.out.println("Man");
		}*/
		
		/*4.9 O que h� de errado com a instru��o while a seguir?
		
		int z = 0;
		int sum = 0;
		
		while (z >= 0) {
			sum += z;
		}
		
		4.16
		
		int x = 1;
		int total = 0;
		
		 while (x <= 10)
		 {
		 int y = x * x;
		 System.out.println(y);
		 total += y;
		 ++x;
		 }
		
		System.out.printf("Total is %d%n", total);*/
		
		/*Para os exerc�cios de 4.17 a 4.20, execute cada um dos seguintes passos:
			a) Leia a declara��o do problema.
			b) Formule o algoritmo utilizando pseudoc�digo e refinamento passo a passo de cima para baixo (top-down stepwise).
			c) Escreva um programa Java.
			d) Teste, depure e execute o programa Java.
			e) Processe tr�s conjuntos completos de dados.
			
			4.17 (Quilometragem de combust�vel) Os motoristas se preocupam com a quilometragem obtida por seus autom�veis. Um motorista monitorou
			v�rias viagens registrando a quilometragem dirigida e a quantidade de combust�vel em litros utilizados para cada tanque cheio.
			Desenvolva um aplicativo Java que receba como entrada os quil�metros dirigidos e os litros de gasolina consumidos (ambos como inteiros)
			para cada viagem. O programa deve calcular e exibir o consumo em quil�metros/litro para cada viagem e imprimir a quilometragem
			total e a soma total de litros de combust�vel consumidos at� esse ponto para todas as viagens. Todos os c�lculos de m�dia devem produzir
			resultados de ponto flutuante. Utilize classe Scanner e repeti��o controlada por sentinela para obter os dados do usu�rio.
			
			problema geral
			
			1 - Calculando a quilometragem do combustivel
			
			topo
			
			1 - inicializa as var�aveis
			
			2 - insira a quantidade de litro e kilometros
			
			3 - calcule, exiba o consumo em kilometros/litro por viagem e imprima a kilometragem total e a soma toal de litros de combustivel consumidos at� esse ponto para as viagens
			
			
			Refinamento:
			
			1 - inicializa as var�aveis
			
				inicializa litros como zero
				inicializa kilometros como zero
				
			2 - insira a quantidade de litro e kilometros
			
				Recebe os valores de entrada do usu�rio para litros e kilometros
				
			
			3 - calcule, exiba o consumo em kilometros/litro por viagem e imprima a kilometragem total e a soma total de litros de combustivel consumidos at� esse ponto para as viagens
			
				cria uma vari�vel divisao do tipo flutuante
				
				enquanto sentinela for diferente de -1 fa�a
							
				
				divide kilometros por litros e atribui a vari�vel divisao
				
				mostra na tela o gasto de litros por kilometros
				
				mostrar na tela quantos kilometros foram percorridos
				
				mostrar na tela quantos litros foram gastos no total
			
				
		
		//usando valor de sentinela e n�o controle por contador
		
		int sentinela = 0;
		int kmTotal=0;
		int lTotal=0;
		
		while(sentinela!=-1) {
			
		String Kilometos = JOptionPane.showInputDialog("Informe a quantidade de quilometros percorridos nesta viagem:");
		int km = Integer.parseInt(Kilometos);
		kmTotal +=km;
		
		String litros = JOptionPane.showInputDialog("Informe a quantidade de litros gastos:");
		int l = Integer.parseInt(litros);
		lTotal+= l;
		
		double divisao = (double)l/km;
		
		String retorno = String.format("Media de gasolina gasta em litro nesta viagem para cada KM rodado: %.2f %n%nKMs percorridos: %d %n%nQuantidade de litros gastos nesta viagem: %d",divisao, km, l);
		
		JOptionPane.showMessageDialog(null,retorno);
		
		String valor_de_remate = JOptionPane.showInputDialog("Deseja calcular os gastos de outra viagem? (1 (S) / -1 (N))");
		sentinela = Integer.parseInt(valor_de_remate);
		
			if(sentinela!=1 && sentinela!=-1) {
				
				while( sentinela!=1 && sentinela!=-1 ) {
					
					JOptionPane.showMessageDialog(null, "Valor da opera��o inv�lido");
					
					String valor_de_remate01 = JOptionPane.showInputDialog("Deseja calcular os gastos de outra viagem? (1 (S) / -1 (N))");
					sentinela = Integer.parseInt(valor_de_remate01);
					
				}
			
			}
			
		}
		
		String retornoFinal = String.format("KMs totais:%d%n%nLitros totaais:%d",kmTotal, lTotal);
		
		JOptionPane.showMessageDialog(null,retornoFinal);
		
	
		4.18 (Calculador de limite de cr�dito) Desenvolva um aplicativo Java que determina se um cliente de uma loja de departamentos excedeu o
		limite de cr�dito em uma conta-corrente. Para cada cliente, os seguintes dados est�o dispon�veis:
		a) N�mero de conta.
		b) Saldo no in�cio do m�s.
		c) Total de todos os itens cobrados desse cliente no m�s.
		d) Total de cr�ditos aplicados ao cliente no m�s.
		e) Limite de cr�dito autorizado.
		O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (= saldo inicial + despesas � cr�ditos), exibir o novo saldo e
		determinar se o novo saldo excede ao limite de cr�dito do cliente. Para aqueles clientes cujo limite de cr�dito foi excedido, o programa deve
		exibir a mensagem "Limite de cr�dito excedido".
		
		Calculador de limite de cr�dito
		
		topo:
		
			1 - inicialize as vari�veis;
			
			2 - informe n�mero da conta, Saldo no in�cio do m�s, total de todos os itens cobrados deste cliente, Total de cr�ditos aplicados ao cliente no m�s, Limite de cr�dito autorizado;
			
			3 - calcule o novo saldo (saldo inicial + despesas - cr�dito), exibir o novo saldo e determinar se esse novo saldo excede o valor do cr�tido;
		
		Refinamento:
			
			1 - inicialize as vari�veis;
				
				inicializa saldo;
				inicializa conta;
				inicializa totItens;
				inicializa totCredto
				inicializa limitCredto;
				
			2 - informe n�mero da conta, Saldo no in�cio do m�s, total de todos os itens cobrados deste cliente, Total de cr�ditos aplicados ao cliente no m�s, Limite de cr�dito autorizado;
			
				Recebe saldo do usu�rio;
				Recebe n� conta;
				Recebe valor do totItens;
				Recebe valor do totCredto;
				Recebe valor do limitCredto;
				
			3 - calcule o novo saldo (saldo inicial + despesas - cr�dito), exibir o novo saldo e determinar se esse novo saldo excede o valor do cr�tido;
				
				Calcular novo saldo = saldo inicial + despesas - cr�dito;
				exibe o novo saldo;
				determinar se esse novo saldo excede o valor do cr�tido
			
			
		int saldo = 0;
		int conta = 0;
		int totItens = 0;
		int totCredto = 0;
		int limitCredto = 0;
		
			String stringConta = JOptionPane.showInputDialog("Informe o N� da conta:");
				conta = Integer.parseInt(stringConta);
			
			String stringSaldo = JOptionPane.showInputDialog("Informe o saldo da conta:");
				saldo = Integer.parseInt(stringSaldo);
			
			String stringTotItens = JOptionPane.showInputDialog("Informe as despesas cliente:");
				totItens = Integer.parseInt(stringTotItens);
			
			String stringTotCredto = JOptionPane.showInputDialog("Informe o cr�dito total aplicado ao cliente:");
				totCredto = Integer.parseInt(stringTotCredto);
			
			String stringLimitCredto = JOptionPane.showInputDialog("Informe o limite de cr�dito aprovado para o cliente:");
				limitCredto = Integer.parseInt(stringLimitCredto);
		
			saldo = (saldo+totItens)-totCredto;
			
			String retorno = String.format("Saldo restante:%d %n%s", saldo, saldo < limitCredto?"O saldo � maior que o limite de cr�dito":"O saldo � menor que o limite de cr�dito");
			
			JOptionPane.showMessageDialog(null, retorno);
			
		
		4.19 (Calculador de comiss�o de vendas) Uma grande empresa paga seu pessoal de vendas com base em comiss�es. O pessoal de vendas
		recebe R$ 200 por semana mais 9% de suas vendas brutas durante esse per�odo. Por exemplo, um vendedor que realiza um total de vendas
		de mercadorias de R$ 5.000 em uma semana recebe R$ 200 mais 9% de R$ 5.000, um total de R$ 650. Foi-lhe fornecida uma lista dos itens
		vendidos por cada vendedor. Os valores desses itens s�o como segue:
		Item Value
		1 239.99
		2 129.75
		3 99.95
		4 350.89
		Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a �ltima semana e calcula e exibe os rendimentos
		do vendedor. N�o existe nenhum limite para o n�mero de itens que pode ser vendido.
		
		
		Calculador de comiss�o de vendas
		
		Topo:
		
		1 - inicializa as vari�veis
		2 - Recebe os valores dos produtos vendidos
		3 - faz os calculos necess�rios
		
		Refinamento:
			
		1 - inicializa as vari�veis
			
			inicializa salario;
		    inicializa item;
		   
		2 - Recebe os valores dos produtos vendidos 
			
			recebe salario;
		
		3 - faz os calculos necess�rios
		
		
			soma item mais 1;
			soma o valor inserido a salario;
			mostra o resultado
		
		
			int salario = 200;
			int item=0;
			int sentinela=0;
			
			while(sentinela!=-1) {
				item++;
				
					String stringEntrada = JOptionPane.showInputDialog("Informe o valor do item "+item+" vendido:");
						int valor = Integer.parseInt(stringEntrada);
							salario+=valor;
					
					String stringSentinela = JOptionPane.showInputDialog("Deseja inserir mais um item? 1 (S) /-1 (N)");
						sentinela = Integer.parseInt(stringSentinela);		
				
			}
			
			String retorno = String.format("Itens inseridos: %d %nValor a receber: %d", item, salario);
			
			JOptionPane.showMessageDialog(null, retorno);
			
			
			4.20 (Calculador de sal�rios) Desenvolva um aplicativo Java que determina o sal�rio bruto de cada um de tr�s empregados. A empresa paga
			as horas normais pelas primeiras 40 horas trabalhadas por cada funcion�rio e 50% a mais por todas as horas trabalhadas al�m das 40
			horas. Voc� recebe uma lista de empregados, o n�mero de horas trabalhadas por eles na semana passada e o sal�rio-hora de cada um. Seu
			programa deve aceitar a entrada dessas informa��es para cada empregado e, ent�o, determinar e exibir o sal�rio bruto do empregado.
			Utilize a classe Scanner para inserir os dados.
			
			Calculador de sal�rios
			
			topo:
				
				1 - inicializa vari�veis
				2 - Recebe o valor das vari�veis
				3 - calcular sal�rio
			
			Refinamento:
				
				1 - inicializa vari�veis
					
					inicializa nome;
					inicializa horasTrabalhadas;
					inicializa salarioHora;
					inicializa contador; 
					
				2 - Recebe o valor das vari�veis
					
					Recebe nome;
					Recebe horasTrabalhadas;
					Recebe salarioHora;
					Recebe contador;
					
				3 - calcular sal�rio
				
					verifica se horasTrabalhadas � maior que 40
					se verdade calcula quantas horas mais e adiciona 50% ao s�lario
					deterima salario
					exibe salario
					
				
				String nome;
				int horasTrabalhadas;
				int salarioHora;
				int contador = 1;
				int salarioBruto=0;
				
				while(contador<=3) {
					
					nome = JOptionPane.showInputDialog("Informe o nome do empregado:");
					
					String setHorasTrabalhadas = JOptionPane.showInputDialog("Horas trabalhadas:");
						horasTrabalhadas = Integer.parseInt(setHorasTrabalhadas);
					
					String setSalarioHora = JOptionPane.showInputDialog("Sal�rio hora trabalhada:");
						salarioHora = Integer.parseInt(setSalarioHora);
					
							if(horasTrabalhadas>40) {
								//horasTrabalhadas -= 40;
								salarioBruto = salarioHora * horasTrabalhadas + ((salarioHora* 50/100) * (horasTrabalhadas-40) ); 
								
							}else {
								
								salarioBruto = salarioHora * horasTrabalhadas;
								
							}					
							
							String retorno = String.format("Funcion�rio: %s%nSal�rio bruto: %d", nome, salarioBruto);
							
							JOptionPane.showMessageDialog(null, retorno);
				
				}
					
					
				4.21 (Localize o maior n�mero) O processo de localizar o maior valor � muito utilizado em aplicativos de computador. Por exemplo, um
				programa que determina o vencedor de uma competi��o de vendas inseriria o n�mero de unidades vendidas por cada vendedor. O vendedor
				que vende mais unidades ganha a competi��o. Escreva um programa em pseudoc�digo e, ent�o, um aplicativo Java que aceita como entrada
				uma s�rie de 10 inteiros e determina e imprime o maior dos inteiros. Seu programa deve utilizar pelo menos as tr�s vari�veis a seguir:
				a) counter: um contador para contar at� 10 (isto �, monitorar quantos n�meros foram inseridos e determinar quando todos os 10 n�meros
				foram processados).
				b) number: o inteiro mais recentemente inserido pelo usu�rio.
				c) largest: o maior n�mero encontrado at� agora.
		
			Localize o maior n�mero
				
				Topo:
					
				1 - inicializa as vari�veis
				2 - recebe os valores da vari�veis
				3 - validar o maior n�mero;
				
				Refinamento:
					
				1 - inicializa as vari�veis
					
					inicializa contador;
					inicializa numero;
					inicializa maiorValor;
				
				2 - recebe os valores da vari�veis
					
					recebe n�mero;
				
				3 - validar o maior n�mero;
		
				int contador = 1;
				int numero = 0;
				int maiorValor = 0;
				int cache = 0;
				
				while(contador<=10) {
					
					String setNumero = JOptionPane.showInputDialog("Informe o "+contador+"� n�mero:");
						numero = Integer.parseInt(setNumero);
							if(numero > maiorValor) {
								
								JOptionPane.showMessageDialog(null, numero+" � maior que "+ maiorValor);
									maiorValor = numero;
								
							}else {
								JOptionPane.showMessageDialog(null, numero+" � menor que "+ maiorValor);
							}
							contador++;
							
				}
				
				4.22 (Sa�da no formato de tabela) Escreva um aplicativo Java que utiliza um loop para imprimir a seguinte tabela de valores:
						N 10*N 100*N 1000*N
						1 10 	100  1000
						2 20 	200  2000
						3 30 	300  3000
						4 40 	400  4000
						5 50 	500  5000
				
				int contador = 1;
				
				while(contador<=5) {
					if(contador==1) {
						System.out.println("N 10*N 100*N 1000*N");
					}
					System.out.printf("%d  %d   %d   %d%n%n", contador,  contador*10, contador*100, contador*1000);
					contador++;
				}
		
			4.23 (Encontre os dois n�meros maiores) Utilizando uma abordagem semelhante �quela do Exerc�cio 4.21, encontre os dois maiores valores
			entre os 10 valores inseridos. [Observa��o: voc� s� pode inserir cada n�mero uma vez.]		
			
			int contador = 1;
			int numero = 0;
			int maiorValor = 0;
			int cache = 0;
			
			while(contador<=10) {
				
				String setNumero = JOptionPane.showInputDialog("Informe o "+contador+"� n�mero:");
					numero = Integer.parseInt(setNumero);
					
						if(numero >= maiorValor) {
														
							
							if(maiorValor > cache) {
								
								JOptionPane.showMessageDialog(null, numero+" e "+ maiorValor+" s�o os maiores entre "+"("+numero+", "+ maiorValor+", "+ cache+"...)");														
															
							}else if(cache > maiorValor){
								
								JOptionPane.showMessageDialog(null, numero+" e "+ cache+" s�o os maiores entre "+"("+numero+", "+ maiorValor+", "+ cache+"...)");
							}
								cache = maiorValor;
								maiorValor = numero;
							
						}else if( maiorValor > numero && numero > cache){
							
							JOptionPane.showMessageDialog(null, maiorValor+" e "+numero+" s�o os maiores entre "+"("+numero+", "+ maiorValor+", "+ cache+"...)");
							
						
						}else {
							
							JOptionPane.showMessageDialog(null, maiorValor+" e "+cache+" s�o os maiores entre "+"("+numero+", "+ maiorValor+", "+ cache+"...)");
							
						}
						
						contador++;
			}
			
			4.24 (Validando entrada de usu�rio) Modifique o programa na Figura 4.12 para validar suas entradas. Para qualquer entrada, se o valor
			entrado for diferente de 1 ou 2, continue o loop at� o usu�rio inserir um valor correto.
		
		 //inicializando vari�veis nas declara��es
		
		 int aprovado = 0;
		 int reprovado = 0;
		 int contadorEstudante = 1;
		 int resultado = 0;
		 // processa 10 alunos utilizando o loop controlado por contador
		 
		 
		
		 
		 while (contadorEstudante <= 10){
			 
			 String opcao = JOptionPane.showInputDialog("Insira o resultado (1 = aprovado, 2 = reprovado):");			 
			 resultado = Integer.parseInt(opcao);
			 
			 	
				if(resultado!=1 && resultado!=2) {
									
					while(resultado!=1 && resultado!=2) {
							 
							 // solicita ao usu�rio uma entrada e obt�m valor fornecido pelo usu�rio
						String opcao1 = JOptionPane.showInputDialog("Insira o resultado (1 = aprovado, 2 = reprovado):");
						 resultado = Integer.parseInt(opcao1);
						 
					 }
				}
			
				 // if...else est� aninhado na instru��o while
				 if (resultado == 1) {
					 
					 aprovado += 1;
					 contadorEstudante += 1;
					 
				 }else {
					 reprovado += 1;
		
					 contadorEstudante += 1;
				 }
				 
				 System.out.print(contadorEstudante);
				 System.out.printf("%nAprovado: %d%nFalha: %d%n", aprovado, reprovado);
		 }
	  

		  // fase de t�rmino; prepara e exibe os resultados
		 System.out.printf("%nAprovado: %d%nFalha: %d%n", aprovado, reprovado);

		  // determina se mais de 8 alunos foram aprovados�
		  if (aprovado > 8) {
			  System.out.println("B�nus para instructor!");
		  }
		  
		
			4.25 O que o seguinte programa imprime?
		
		int count = 1;
		
		while (count <= 10){
			
		 System.out.println(count % 2 == 1 ? "****" : "++++++++");
		 ++count;
		 
		 }
		 
		 
		 4.26 O que o seguinte programa imprime?
		
		int row = 10;

		while (row >= 1){
			
		 int column = 1;

		 while (column <= 10) {
			 
			 System.out.print(row % 2 == 1 ? "<" : ">");
		 		++column;
		 		
		 }

		 --row;
		 	System.out.println();
		 
		 }
		
		4.27 (Problema do else oscilante) Determine a sa�da para cada um dos conjuntos dados de c�digo quando x � 9 e y � 11 e quando x � 11
		e y � 9. O compilador ignora o recuo em um programa Java. Da mesma forma, o compilador Java sempre associa um else com o if imediatamente
		precedente a menos que instru�do a fazer de outro modo pela coloca��o de chaves ({}). � primeira vista, o programador pode
		n�o ter certeza de qual if um else particular corresponde � essa situa��o � conhecida como "problema do else oscilante". Eliminamos
		o recuo do seguinte c�digo para tornar o problema mais desafiador. [Dica: aplique as conven��es de recuo que voc� aprendeu.]*/
		//a)
		/*int x1 = 11;
		int y1 = 9;
		
		if (x1 < 10)
			if (y1 > 10)
			System.out.println("*****");
			else
			System.out.println("#####");	
			System.out.println("$$$$$");
		//b)
		int x2 = 11;
		int y3 = 9;
		
		if (x2 < 10){
			if (y3 > 10)
				System.out.println("*****");
		}else{
				System.out.println("#####");
				System.out.println("$$$$$");
		}
		4.28 (Outro problema do else oscilante) Modifique o c�digo dado para produzir a sa�da mostrada em cada parte do problema. Utilize
		t�cnicas de recuo adequadas. N�o fa�a nenhuma altera��o al�m de inserir chaves e alterar o recuo do c�digo. O compilador ignora recuo
		em um programa Java. Eliminamos o recuo do c�digo fornecido para tornar o problema mais desafiador. [Observa��o: � poss�vel que n�o
		seja necess�ria nenhuma modifica��o para algumas das partes.]
		
		if (y == 8)
			if (x == 5)
			System.out.println("@@@@@");
			else
			System.out.println("#####");
		System.out.println("$$$$$");
		System.out.println("&&&&&");
		
		a) Supondo que x = 5 e y = 8, a seguinte sa�da � produzida:
		@@@@@
		$$$$$
		&&&&&
		
		int x = 5;
		int y = 8;
		
		if (y == 8)
			if (x == 5)
			System.out.println("@@@@@");
			else
			System.out.println("#####");
		System.out.println("$$$$$");
		System.out.println("&&&&&");
		
		b) Supondo que x = 5 e y = 8, a seguinte sa�da � produzida:
		@@@@@
		
		int x = 5;
		int y = 8;
		
		if (y == 8) {
			if (x == 5) {
			System.out.println("@@@@@");
			}else {
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
			}
		}
		
		c) Supondo que x = 5 e y = 8, a seguinte sa�da � produzida:
		@@@@@
		
		int x = 5;
		int y = 8;
		
		if (y == 8) {
			if (x == 5) {
			System.out.println("@@@@@");
			}else {
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
			}
		}	
		
		d) Supondo que x = 5 e y = 7, a seguinte sa�da � produzida. [Observa��o: todas as tr�s �ltimas instru��es de sa�da depois do else s�o
		partes de um bloco].
		#####
		$$$$$
		&&&&&
		
		int x = 5;
		int y = 7;
		
		if (y == 8) {
			if (x == 5)
			System.out.println("@@@@@");
		}else {
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		}
		
		4.29 (Quadrado de asteriscos) Escreva um aplicativo que solicita ao usu�rio que insira o tamanho do lado de um quadrado e, ent�o, exibe um
		quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos os comprimentos de lado poss�veis
		entre 1 e 20.
		
		String setTamanho = JOptionPane.showInputDialog("Insira o tamanho do lado de um quadrado:");
		int tamanho = Integer.parseInt(setTamanho);
		
		int contador=1;
		
		while(contador <= tamanho) {
			
			if(contador < 2 || contador > tamanho-1) {
				
				int counter=1;
					while(counter <= tamanho) {
						
						System.out.print("*");
						if(counter==tamanho) {
							System.out.print("\n");
						}
						counter++;
					}
					
			}else {
				int counter=1;
				while(counter <= tamanho) {
					
					
					if(counter<2) {
						System.out.print("*");
						int cache = 1;
							while(cache < tamanho-1) {
								System.out.print(" ");
								cache++;
							}
						
						
					}else if(counter==tamanho-1) {
						System.out.print("*"+"\n");
					}
					
					counter++;
				}
				
			}
			
			contador++;
		}
		
		4.30 (Pal�ndromos) Um pal�ndromo � uma sequ�ncia de caracteres que � lida da esquerda para a direita ou da direita para a esquerda. Por
		exemplo, cada um dos seguintes inteiros de cinco d�gitos � um pal�ndromo: 12321, 55555, 45554 e 11611. Escreva um aplicativo que l� em
		um inteiro de cinco d�gitos e determina se ele � ou n�o um pal�ndromo. Se o n�mero n�o for de cinco d�gitos, exiba uma mensagem de
		erro e permita que o usu�rio insira um novo valor.
		
		int pali=0;
		
		String setPali = JOptionPane.showInputDialog("Informe um n�mero de 5 digitos:");			
		
			System.out.print(setPali.substring(0,2));
			System.out.print(setPali.substring(3,5));
			
			if( setPali.substring(0,1).equals(setPali.substring(4,5))) {
				if( setPali.substring(1,2).equals(setPali.substring(3,4))) {
					pali = Integer.parseInt(setPali);
					JOptionPane.showMessageDialog(null, "O valor inserido � um pal�dromo: "+pali);
				}
				
			}else {
				pali = Integer.parseInt(setPali);
				JOptionPane.showMessageDialog(null, "O valor inserido n�o � um pal�dromo: "+pali);
			}
			
			
			4.31 (Imprimindo o equivalente decimal de um n�mero bin�rio) Escreva um aplicativo que insere um n�mero inteiro que cont�m somente
				0s e 1s (isto �, um n�mero inteiro bin�rio) e imprime seu equivalente decimal. [Dica: utilize os operadores de resto e divis�o para
				pegar os d�gitos do n�mero bin�rio um de cada vez da direita para a esquerda. No sistema de n�meros decimais, o d�gito mais � direita
				tem um valor posicional de 1 e o pr�ximo d�gito � esquerda um valor posicional de 10, depois 100, depois 1.000 e assim por diante. O
				n�mero decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de n�mero bin�rio, o d�gito mais � direita tem um
				valor posicional de 1, o pr�ximo d�gito � esquerda um valor posicional de 2, depois 4, depois 8 e assim por diante. O equivalente decimal
				do bin�rio 1.101 � 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]*/			
			
						
			int decimal = 0;
			int contador;
			int multD = 1;
			int aux=0;
			
				String setValor = JOptionPane.showInputDialog("Informe um n�mero bin�rio:");								
				
				contador = setValor.length();
				
				while(contador >= 0) {
					
					if(contador > 0) {
						
						decimal = Integer.parseInt(setValor.substring(contador-1,contador));
							decimal*=multD;
								aux+=decimal;									
						
					}
					multD*=2;
					contador--;
				}
				
				JOptionPane.showMessageDialog(null, "O valor do bin�rio informado � "+aux+" na base decimal!");
						
	}

}
















