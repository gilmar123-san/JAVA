
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
				do bin�rio 1.101 � 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]			
			
						
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
				
				
				4.32 (Padr�o de tabuleiro de damas de asteriscos) Escreva um aplicativo que utiliza apenas as instru��es de sa�da
				System.out.print("* ");
				System.out.print(" ");
				System.out.println();
				para exibir o padr�o de tabuleiro de damas a seguir. Uma chamada de m�todo System.out.println sem argumentos faz com que o programa
				gere sa�da de um �nico caractere de nova linha. [Dica: as instru��es de repeti��o s�o requeridas.
				
				* * * * * * * *
				 * * * * * * * *
				* * * * * * * *
				 * * * * * * * *
				* * * * * * * *
				 * * * * * * * *
				* * * * * * * *
				 * * * * * * * * 				 				 					
		
			String resposta = JOptionPane.showInputDialog("Informe o n�mero de posi��es do tabuleiro:");
			int setResposta = Integer.parseInt(resposta);
			
			int contador=1;
			
			while(contador <= setResposta){
					
				
				if(contador % 2 ==0) {
					
					System.out.print(" ");
					
					int contador01 = 1;
					while(contador01 <= setResposta) {
																												
						if(contador01 == setResposta) {
							System.out.print("*"+"\n");	
						}else {
							System.out.print("*");	
						}
							
						contador01++;
					}
				}else {
					int contador01 = 1;
					while(contador01 <= setResposta) {												
						
							if(contador01 == setResposta) {
								System.out.print("*"+"\n");	
							}else {
								System.out.print("*");	
							}
							
						contador01++;
					}
				}		
				
				contador++;
			}
			
			4.33 (M�ltiplos de 2 com um loop infinito) Escreva um aplicativo que continue exibindo na janela de comando os m�ltiplos do inteiro 2
			� a saber, 2, 4, 8, 16, 32, 64 e assim por diante. Seu loop n�o deve terminar (isto �, deve criar um loop infinito). O que acontece quando
			voc� executa esse programa?
			
		
			int multDois=2;
			int contador=1;
			
			while(contador <= multDois) {
				System.out.println(multDois);
				multDois*=2;
				
			}
			
			
			4.34 (O que h� de errado com esse c�digo?) O que h� de errado com a seguinte instru��o? Forne�a a instru��o correta para adicionar 1 �
			soma de x e y.
			System.out.println(++(x + y));
			
		
			int x=0;
			int y =0;
			
			System.out.println((++x)+ y);
			
			
			4.35 (Lados de um tri�ngulo) Escreva um aplicativo que l� tr�s valores diferentes de zero inseridos pelo usu�rio, determina e
			imprime se eles poderiam representar os lados de um tri�ngulo.
			
		
			int a, b, c;
		
			System.out.println("Informe o tamanho dos 3 lados de um tri�ngulo:");
			a = entrada.nextInt();
			b = entrada.nextInt();
			c = entrada.nextInt();
			
			if(a == 0 || b == 0 || c==0) {
				
				System.out.println("Nenhum dos valores deve ser igual a 0!!"+"\n");
				
				
				while(a == 0 || b == 0 || c==0) {
					System.out.println("Informe o tamanho dos 3 lados de um tri�ngulo:");
					a = entrada.nextInt();
					b = entrada.nextInt();
					c = entrada.nextInt();
				}
				
			}else if(a == b && b == c) {
				System.out.println("Poderia ser um Tri�ngulo Equil�tero");
			}else if(a==b && b!=c || a==c && b!=c ) {
				System.out.println("Poderia ser um Tri�ngulo Is�celes");
			}else {
				System.out.println("Poderia ser um Tri�ngulo Escaleno");
			}
			
			
			4.36 (Lados de um tri�ngulo direito) Escreva um aplicativo que l� tr�s inteiros diferentes de zero, determina e
			 imprime se eles poderiam representar os lados de um tri�ngulo direito.
			
				(FAZER)
			
			4.37 (Fatorial) O fatorial de um inteiro n�o negativo n � escrito como n! (pronuncia-se �n fatorial�) e � definido como segue:
				n! = n � (n � 1) � (n � 2) � ... � 1 (para valores de n maiores ou iguais a 1)
				e
				n! = 1 (para n = 0)
				Por exemplo, 5! = 5 � 4 � 3 � 2 � 1, o que d� 120.
				
				a) Escreva um aplicativo que l� um inteiro n�o negativo, calcula e imprime seu fatorial.
		
		
					String setFator = JOptionPane.showInputDialog("Informe um inteiro positivo:");
					int fator = Integer.parseInt(setFator);
					
					if(fator < 0) {
						
						while(fator < 0) {
														
							setFator = JOptionPane.showInputDialog("Ain, valor negativo detectado!!"+"\n"+"Tente novamente"+"\n"+"Informe um inteiro positivo:");
							fator = Integer.parseInt(setFator);
						}
						
					}
					
					int contador=1;
					int total=0;
										
					while(contador < fator) {
						
						if(contador==1) {
							total += fator;
							System.out.println(total);
						}else {
							total*=(fator-(contador-1));
							System.out.println(total);
						}
						
						contador++;
					}
					
					JOptionPane.showMessageDialog(null, "O fator �: "+total);
		
		
				b) Escreva um aplicativo que estima o valor da constante matem�tica (e) utilizando a f�rmula a seguir. Permita ao usu�rio inserir o n�mero
				de termos a calcular.
				
				e = 1 + 1/1! + 1/2!+ 1/3!+ �
				
					String setTerm = JOptionPane.showInputDialog("Informe quantos termos devemos calcular:");
					int term = Integer.parseInt(setTerm);
					
					if(term < 0) {
						
						while(term < 0) {
														
							setTerm = JOptionPane.showInputDialog("Ain, valor negativo detectado!!"+"\n"+"Tente novamente"+"\n"+"Informe um inteiro positivo:");
							term = Integer.parseInt(setTerm);
						}
						
					}										
						int contador02=1;
						double  total=1;
						int total02=0;
											
						while(contador02 < term) {
							
							if(contador02==1) {
								total02 += term;
									if(term ==1) {
										
										total02*=(term-(contador02-1));
										
									}
								System.out.println(total02);
							}else {
								total02*=(term-(contador02-1));
								System.out.println(total02);
							}
							
							total += (double) 1/total02;
							System.out.println(total);
							
							contador02++;
						}
						
						
					String retorno = String.format("O valor de 'e' �: %.5f", total);
					JOptionPane.showMessageDialog(null, retorno);*/		
		
				/*c) Escreva um aplicativo que computa o valor de e*x utilizando a f�rmula a seguir. Permita ao usu�rio inserir o n�mero de termos a calcular.
				e*X = 1+ x/1! + x*2/2! + x*3/3! + �
		
				String setXiz = JOptionPane.showInputDialog("Informe o valor de base:");
				int base = Integer.parseInt(setXiz);
				
				if(base < 0) {
					
					while(base < 0) {
													
						setXiz = JOptionPane.showInputDialog("Ain, valor negativo detectado!!"+"\n"+"Tente novamente"+"\n"+"Informe um inteiro positivo:");
						base = Integer.parseInt(setXiz);
					}
					
				}
		
				String setTerm = JOptionPane.showInputDialog("Informe quantos termos devemos calcular:");
				int expente = Integer.parseInt(setTerm);
				
				if(expente < 0) {
					
					while(expente < 0) {
													
						setTerm = JOptionPane.showInputDialog("Ain, valor negativo detectado!!"+"\n"+"Tente novamente"+"\n"+"Informe um inteiro positivo:");
						expente = Integer.parseInt(setTerm);
					}
					
				}
								
					int contador=1;
					double  total=1;
					int total02=0;
					double aux=1;
					//System.out.println(aux);
							
					while(contador <= expente) {						
						//calculando o fator de cada denominador
							if(contador==1) {
								
								total02 += expente;
								
									if(expente ==1) {	
										
										total02*=expente;
										
									}
	
							}else {
																
								total02*=(expente-(contador-1));
								
							}
							
						//calculando o valor da pot�ncia de x
																	
							aux *= base;
						
													
						System.out.printf("%.2f %n",aux);
							
						//juntando as parte da formula
							
							total += aux /total02;
							
							System.out.printf("%.3f %n",total);
						
						
						contador++;
					}
					
				
				String retorno = String.format("O valor de 'e' �: %.2f", total);
				JOptionPane.showMessageDialog(null, retorno);
		
				4.38 (Impondo privacidade com criptografia) O crescimento explosivo de comunica��o e armazenamento de dados na internet e em
				computadores conectados por ela aumentou muito a preocupa��o com a privacidade. O campo da criptografia envolve a codifica��o de
				dados para torn�-los dif�ceis de acessar (e espera-se � com os esquemas mais avan�ados � imposs�veis de acessar) para usu�rios sem
				autoriza��o de leitura. Nesse exerc�cio, voc� investigar� um esquema simples para criptografar e descriptografar dados. Uma empresa que
				quer enviar dados pela internet pediu-lhe que escrevesse um programa que criptografe dados a fim de que eles possam ser transmitidos
				com maior seguran�a. Todos os dados s�o transmitidos como inteiros de quatro d�gitos. Seu aplicativo deve ler um inteiro de quatro d�gitos
				inserido pelo usu�rio e criptograf�-lo da seguinte maneira: substitua cada d�gito pelo resultado da adi��o de 7 ao d�gito, obtendo o restante
				depois da divis�o do novo valor por 10. Troque ent�o o primeiro d�gito pelo terceiro e o segundo d�gito pelo quarto. Ent�o, imprima o
				inteiro criptografado. Escreva um aplicativo separado que receba a entrada de um inteiro de quatro d�gitos criptografado e o descriptografe
				(revertendo o esquema de criptografia) para formar o n�mero original. [Projeto de leitura opcional: pesquise a �criptografia de chave
				p�blica� em geral e o esquema de chave p�blica espec�fica PGP (Pretty Good Privacy). Voc� tamb�m pode querer investigar o esquema
				RSA, que � amplamente usado em aplicativos robustos industriais.]
				
			//Recebendo os dados do usu�rio e criptografando:
		
				String dados = JOptionPane.showInputDialog("Informe um inteiro de 4 d�gitos:");
				int setDados = Integer.parseInt(dados);
				
				if(setDados > 10000) {
					JOptionPane.showMessageDialog(null, "ain. Valor muito grande!!");
						while(setDados > 10000) {
							dados = JOptionPane.showInputDialog("Informe um inteiro de 4 d�gitos:");
							setDados = Integer.parseInt(dados);
						}
				}else if(setDados < 1000){
					
					JOptionPane.showMessageDialog(null, "ain. Valor muito pequeno!!");
						while(setDados < 1000) {
							dados = JOptionPane.showInputDialog("Informe um inteiro de 4 d�gitos:");
							setDados = Integer.parseInt(dados);
						}
				}
				
				//Somando cada item inserido mais 7
				
				//System.out.println(dados.length());
				
				int contador = 0;
				int aux02 = 0;
				int setAux = 0;
				String aux = "";
				String fim = "";
				int vetor[] = new int [dados.length()];

				
				
					while(contador <= dados.length()-1){
						
						if(contador != dados.length()){
							aux = dados.substring(contador,contador+1);
							setAux = Integer.parseInt(aux);							
						}											
										
						aux02 = setAux+7;											
						//System.out.println(aux02);
						
						vetor[contador] = aux02 % 10;
						System.out.println(vetor[contador]);				
						contador++;
					}
					
					contador = 0;
					setAux=0;
					
					while(contador <= 3){
						setAux = vetor[contador];
						if(contador == 0) {
							vetor[contador] = vetor[contador+2];
							vetor[contador+2] = setAux;						
						}else if(contador == 1){
							vetor[contador] = vetor[contador+2];
							vetor[contador+2] = setAux;	
						}
						fim+=vetor[contador];
						
						contador++;
					}
												
				//aux02 = Integer.parseInt(fim);
								
				String retorno = String.format("Novo valor criptografado:%s",fim);
				JOptionPane.showMessageDialog(null, retorno);				
		
				//Desemcriptando o valor
				
				fim="";
				contador = 0;
				setAux=0;				
				
				while(contador <= 3){
					setAux = vetor[contador];
					if(contador == 0) {
						vetor[contador] = vetor[contador+2];
						vetor[contador+2] = setAux;						
					}else if(contador == 1){
						vetor[contador] = vetor[contador+2];
						vetor[contador+2] = setAux;	
					}
					
					if(vetor[contador]-7==1) {
						fim += (vetor[contador]-7);
					}else {
						fim+= (vetor[contador]+10)-7;
					}
					
					contador++;
				}							
				
				retorno = String.format("Valor descriptografado:%s",fim);
				JOptionPane.showMessageDialog(null, retorno);
				
				
				4.39 (Crescimento demogr�fico mundial) A popula��o mundial cresceu consideravelmente ao longo dos s�culos. O crescimento cont�nuo
				pode, por fim, desafiar os limites de ar respir�vel, �gua pot�vel, terra f�rtil para agricultura e outros recursos limitados.
				H� evid�ncia de que o crescimento tem reduzido a velocidade nos �ltimos anos e que a popula��o mundial pode chegar ao ponto
				m�ximo em algum momento  nesse s�culo e, ent�o, come�ar a diminuir. Para esse exerc�cio, pesquise quest�es de crescimento demogr�fico
				mundial on-line. N�o deixe de investigar v�rios pontos de vista.
				Obtenha estimativas da popula��o mundial atual e sua taxa de crescimento (a porcentagem pela qual provavelmente aumentar� neste
				ano). Escreva um programa que calcule o crescimento demogr�fico mundial anual dos pr�ximos 75 anos, utilizando a premissa simplificadora
				de que a taxa de crescimento atual ficar� constante. Imprima os resultados em uma tabela. A primeira coluna deve exibir os anos
				do ano 1 ao ano 75. A segunda coluna deve exibir a popula��o mundial esperada no fim desse ano. A terceira deve exibir o aumento num�rico
				na popula��o mundial que ocorreria nesse ano. Utilizando os seus resultados, determine o ano em que a popula��o dobraria com rela��o
				ao n�mero de hoje se a taxa de crescimento do ano atual persistisse.*/
				
				//taxa de crescimento populacional em 2020 segundo a ONU: 1.1%
				//popula��o mundial em 2020 segundo a ONU: 7.794.799.000
				
				//Criando e inicializando vari�veis globais
				String porcentagem = "";
				String popTotal = "";
				String controleAnos = "";
				double setPorcentagem= 0.0;
				double setPopTotal = 0.0;
				int setControleAnos = 0;
				
				do {
					
					porcentagem = JOptionPane.showInputDialog("Informe a taxa de crecimento anual da popula��o mundial:");
					if(porcentagem.length() > 1) {
						
						setPorcentagem = Double.parseDouble(porcentagem);
						System.out.println("setPorcentagem: "+setPorcentagem);
					}
					
					
					popTotal = JOptionPane.showInputDialog("Informe o valor da popula��o mundial:");					
					if(popTotal.length() > 1) {
						
						setPopTotal = Double.parseDouble(popTotal);
						System.out.println("setPopTotal: "+setPopTotal);
					}	
					
					controleAnos = JOptionPane.showInputDialog("Informe quantos anos ser�o calculados:");					
					if(controleAnos.length() > 1) {
						
						setControleAnos = Integer.parseInt(controleAnos);
						System.out.println("setControleAnos: "+setControleAnos);
					}	

				}while(porcentagem.length()<1 || popTotal.length() < 1 || controleAnos.length() < 1 );
				
				double tabela [][] = new double [setControleAnos][3];
				
				int i = 0;
				int j = 0;						
				
				for(; i < setControleAnos; i++) {
					
					for(; j < 3 ;j++) {
						
						tabela [i][j]=i;
						
						if(j == 0) {
						
							tabela [i][j]= i+1;//A primeira coluna deve exibir os anos do ano 1 ao ano 75.
							
							System.out.printf("%.0f | ",tabela [i][j]);
							
						}else if(j == 1) {
							

							tabela [i][j] = (setPorcentagem/100) * (setPopTotal*i);//A segunda coluna deve exibir a popula��o mundial esperada no fim desse ano.
							
							System.out.printf("%.0f | ",tabela [i][j]);
							
						}else if(j == 2 && i > 0){
														
							tabela [i][j]= tabela[i][2];//A terceira deve exibir o aumento num�rico na popula��o mundial que ocorreria nesse ano.
							System.out.printf("%.0f\n",tabela [i][j]);
							
						}
																		
					}
						j = 0;

				}
				entrada.close();
		
	}

}
