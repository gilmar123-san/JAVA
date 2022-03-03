
import java.util.Scanner;
import javax.swing.JOptionPane;

public class exercicios {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		/*4.3 Escreva quatro instruções Java diferentes que adicionam 1 à variável de inteiro x.
		
		int X=0;
		
		System.out.printf("4.3 - %n%n Informe o valor de X: %n");
		X = entrada.nextInt();
		
		X = X + 1;
		X +=1;
		X++;
		++X;
		 
		System.out.printf("X: %d %n%n", X);*/
		
		
		/*4.4 Escreva instruções Java para realizar cada uma das seguintes tarefas:
			a) Utilize uma instrução para atribuir a soma de x e y a z, em seguida, incremente x por 1.
			b) Teste se a variável contador é maior do que 10. Se for, imprima "Contador é maior que 10".
			c) Utilize uma instrução para decrementar a variável x por 1, então subtraia-o da variável total e armazene o resultado na variável
			total.
			d) Calcule o resto após q ser dividido por divisor e atribua o resultado a q. Escreva essa instrução de duas maneiras diferentes.
		
		//A z = x++ + y;
		
		System.out.println("A) \n");
		
		int x, y, z;
		
		System.out.println("Informe os valores de x, y e z na sequência:");
		x = entrada.nextInt();
		y= entrada.nextInt();
		z= entrada.nextInt();
		
		z = x+y;
		x++;
		
		System.out.printf("O valor de x é: %d %n O valor de z:%d %n%n ", x, z);
		
		//B
		
		System.out.println("B) \n");
		
		int contador;
		
		System.out.println("Informe o valore do contador:");
		contador = entrada.nextInt();
		
		if(contador>10) {
			System.out.println("Contador é maior que 10 \n");
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
		
		System.out.println("Informe os valores de q e seu divisor na sequência:");
		q = entrada.nextInt();
		divisor = entrada.nextInt();

		q = q%divisor;
		
		q %=divisor;
		
		System.out.println("Resto: "+q);*/
		
		/*4.5 Escreva uma instrução Java para realizar cada uma das seguintes tarefas:
		
		a) Declarar variáveis sum do tipo int e inicialize-as como 0.
		
		int sum = 0;
		
		b) Declarar variáveis x do tipo int e inicialize-as como 0.
		
		int x = 0;
		
		c) Adicione a variável x à variável sum, e atribua o resultado à variável sum.
		
		System.out.println("Informe o valor de x:");
		x = entrada.nextInt();
		
		sum += x;
		
		d) Imprima "A soma é: " seguido pelo valor da variável sum.
		
		System.out.println("A soma é: "+sum);*/
		
		/*4.6 Combine as instruções escritas no Exercício 4.5 em um aplicativo Java que calcula e imprime a soma dos inteiros de 1 a 10. Utilize a instrução
		while para fazer loop pelas instruções de cálculo e incremento. O loop deve terminar quando o valor de x tornar-se 11.
		
		int sum = 0;
		int x = 0;
		
		while(x < 11) {
			System.out.println(x);
			sum += x;
			
			x++;
		}
		
		System.out.println("A soma é: "+sum);*/
		
		/*4.7 Determine o valor das variáveis na instrução product *= x++; depois que o cálculo é realizado. Suponha que todas as variáveis sejam
		do tipo int e inicialmente tenham o valor 5. Product = 25, X = 6*/
		
		/*4.8 Identifique e corrija os erros em cada um dos seguintes conjuntos de código:
		
		//a)
		int product = 1;
		int c = 0;
		
			while (c <= 5){
				
				System.out.println(c);
				product = product * c;
				System.out.println(product);
				++c;
			
			}
			
		System.out.println("O valor de product é: "+product);
		
		//b) 
		
		int gender = 0;
		
		if (gender == 1) {
			System.out.println("Woman");
		}else {
			System.out.println("Man");
		}*/
		
		/*4.9 O que há de errado com a instrução while a seguir?
		
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
		
		/*Para os exercícios de 4.17 a 4.20, execute cada um dos seguintes passos:
			a) Leia a declaração do problema.
			b) Formule o algoritmo utilizando pseudocódigo e refinamento passo a passo de cima para baixo (top-down stepwise).
			c) Escreva um programa Java.
			d) Teste, depure e execute o programa Java.
			e) Processe três conjuntos completos de dados.
			
			4.17 (Quilometragem de combustível) Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista monitorou
			várias viagens registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
			Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros)
			para cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem
			total e a soma total de litros de combustível consumidos até esse ponto para todas as viagens. Todos os cálculos de média devem produzir
			resultados de ponto flutuante. Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário.
			
			problema geral
			
			1 - Calculando a quilometragem do combustivel
			
			topo
			
			1 - inicializa as varíaveis
			
			2 - insira a quantidade de litro e kilometros
			
			3 - calcule, exiba o consumo em kilometros/litro por viagem e imprima a kilometragem total e a soma toal de litros de combustivel consumidos até esse ponto para as viagens
			
			
			Refinamento:
			
			1 - inicializa as varíaveis
			
				inicializa litros como zero
				inicializa kilometros como zero
				
			2 - insira a quantidade de litro e kilometros
			
				Recebe os valores de entrada do usuário para litros e kilometros
				
			
			3 - calcule, exiba o consumo em kilometros/litro por viagem e imprima a kilometragem total e a soma total de litros de combustivel consumidos até esse ponto para as viagens
			
				cria uma variável divisao do tipo flutuante
				
				enquanto sentinela for diferente de -1 faça
							
				
				divide kilometros por litros e atribui a variável divisao
				
				mostra na tela o gasto de litros por kilometros
				
				mostrar na tela quantos kilometros foram percorridos
				
				mostrar na tela quantos litros foram gastos no total
			
				
		
		//usando valor de sentinela e não controle por contador
		
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
					
					JOptionPane.showMessageDialog(null, "Valor da operação inválido");
					
					String valor_de_remate01 = JOptionPane.showInputDialog("Deseja calcular os gastos de outra viagem? (1 (S) / -1 (N))");
					sentinela = Integer.parseInt(valor_de_remate01);
					
				}
			
			}
			
		}
		
		String retornoFinal = String.format("KMs totais:%d%n%nLitros totaais:%d",kmTotal, lTotal);
		
		JOptionPane.showMessageDialog(null,retornoFinal);
		
	
		4.18 (Calculador de limite de crédito) Desenvolva um aplicativo Java que determina se um cliente de uma loja de departamentos excedeu o
		limite de crédito em uma conta-corrente. Para cada cliente, os seguintes dados estão disponíveis:
		a) Número de conta.
		b) Saldo no início do mês.
		c) Total de todos os itens cobrados desse cliente no mês.
		d) Total de créditos aplicados ao cliente no mês.
		e) Limite de crédito autorizado.
		O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (= saldo inicial + despesas – créditos), exibir o novo saldo e
		determinar se o novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo limite de crédito foi excedido, o programa deve
		exibir a mensagem "Limite de crédito excedido".
		
		Calculador de limite de crédito
		
		topo:
		
			1 - inicialize as variáveis;
			
			2 - informe número da conta, Saldo no início do mês, total de todos os itens cobrados deste cliente, Total de créditos aplicados ao cliente no mês, Limite de crédito autorizado;
			
			3 - calcule o novo saldo (saldo inicial + despesas - crédito), exibir o novo saldo e determinar se esse novo saldo excede o valor do crétido;
		
		Refinamento:
			
			1 - inicialize as variáveis;
				
				inicializa saldo;
				inicializa conta;
				inicializa totItens;
				inicializa totCredto
				inicializa limitCredto;
				
			2 - informe número da conta, Saldo no início do mês, total de todos os itens cobrados deste cliente, Total de créditos aplicados ao cliente no mês, Limite de crédito autorizado;
			
				Recebe saldo do usuário;
				Recebe n° conta;
				Recebe valor do totItens;
				Recebe valor do totCredto;
				Recebe valor do limitCredto;
				
			3 - calcule o novo saldo (saldo inicial + despesas - crédito), exibir o novo saldo e determinar se esse novo saldo excede o valor do crétido;
				
				Calcular novo saldo = saldo inicial + despesas - crédito;
				exibe o novo saldo;
				determinar se esse novo saldo excede o valor do crétido
			
			
		int saldo = 0;
		int conta = 0;
		int totItens = 0;
		int totCredto = 0;
		int limitCredto = 0;
		
			String stringConta = JOptionPane.showInputDialog("Informe o N° da conta:");
				conta = Integer.parseInt(stringConta);
			
			String stringSaldo = JOptionPane.showInputDialog("Informe o saldo da conta:");
				saldo = Integer.parseInt(stringSaldo);
			
			String stringTotItens = JOptionPane.showInputDialog("Informe as despesas cliente:");
				totItens = Integer.parseInt(stringTotItens);
			
			String stringTotCredto = JOptionPane.showInputDialog("Informe o crédito total aplicado ao cliente:");
				totCredto = Integer.parseInt(stringTotCredto);
			
			String stringLimitCredto = JOptionPane.showInputDialog("Informe o limite de crédito aprovado para o cliente:");
				limitCredto = Integer.parseInt(stringLimitCredto);
		
			saldo = (saldo+totItens)-totCredto;
			
			String retorno = String.format("Saldo restante:%d %n%s", saldo, saldo < limitCredto?"O saldo é maior que o limite de crédito":"O saldo é menor que o limite de crédito");
			
			JOptionPane.showMessageDialog(null, retorno);
			
		
		4.19 (Calculador de comissão de vendas) Uma grande empresa paga seu pessoal de vendas com base em comissões. O pessoal de vendas
		recebe R$ 200 por semana mais 9% de suas vendas brutas durante esse período. Por exemplo, um vendedor que realiza um total de vendas
		de mercadorias de R$ 5.000 em uma semana recebe R$ 200 mais 9% de R$ 5.000, um total de R$ 650. Foi-lhe fornecida uma lista dos itens
		vendidos por cada vendedor. Os valores desses itens são como segue:
		Item Value
		1 239.99
		2 129.75
		3 99.95
		4 350.89
		Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a última semana e calcula e exibe os rendimentos
		do vendedor. Não existe nenhum limite para o número de itens que pode ser vendido.
		
		
		Calculador de comissão de vendas
		
		Topo:
		
		1 - inicializa as variáveis
		2 - Recebe os valores dos produtos vendidos
		3 - faz os calculos necessários
		
		Refinamento:
			
		1 - inicializa as variáveis
			
			inicializa salario;
		    inicializa item;
		   
		2 - Recebe os valores dos produtos vendidos 
			
			recebe salario;
		
		3 - faz os calculos necessários
		
		
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
			
			
			4.20 (Calculador de salários) Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. A empresa paga
			as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 40
			horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana passada e o salário-hora de cada um. Seu
			programa deve aceitar a entrada dessas informações para cada empregado e, então, determinar e exibir o salário bruto do empregado.
			Utilize a classe Scanner para inserir os dados.
			
			Calculador de salários
			
			topo:
				
				1 - inicializa variáveis
				2 - Recebe o valor das variáveis
				3 - calcular salário
			
			Refinamento:
				
				1 - inicializa variáveis
					
					inicializa nome;
					inicializa horasTrabalhadas;
					inicializa salarioHora;
					inicializa contador; 
					
				2 - Recebe o valor das variáveis
					
					Recebe nome;
					Recebe horasTrabalhadas;
					Recebe salarioHora;
					Recebe contador;
					
				3 - calcular salário
				
					verifica se horasTrabalhadas é maior que 40
					se verdade calcula quantas horas mais e adiciona 50% ao sálario
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
					
					String setSalarioHora = JOptionPane.showInputDialog("Salário hora trabalhada:");
						salarioHora = Integer.parseInt(setSalarioHora);
					
							if(horasTrabalhadas>40) {
								//horasTrabalhadas -= 40;
								salarioBruto = salarioHora * horasTrabalhadas + ((salarioHora* 50/100) * (horasTrabalhadas-40) ); 
								
							}else {
								
								salarioBruto = salarioHora * horasTrabalhadas;
								
							}					
							
							String retorno = String.format("Funcionário: %s%nSalário bruto: %d", nome, salarioBruto);
							
							JOptionPane.showMessageDialog(null, retorno);
				
				}
					
					
				4.21 (Localize o maior número) O processo de localizar o maior valor é muito utilizado em aplicativos de computador. Por exemplo, um
				programa que determina o vencedor de uma competição de vendas inseriria o número de unidades vendidas por cada vendedor. O vendedor
				que vende mais unidades ganha a competição. Escreva um programa em pseudocódigo e, então, um aplicativo Java que aceita como entrada
				uma série de 10 inteiros e determina e imprime o maior dos inteiros. Seu programa deve utilizar pelo menos as três variáveis a seguir:
				a) counter: um contador para contar até 10 (isto é, monitorar quantos números foram inseridos e determinar quando todos os 10 números
				foram processados).
				b) number: o inteiro mais recentemente inserido pelo usuário.
				c) largest: o maior número encontrado até agora.
		
			Localize o maior número
				
				Topo:
					
				1 - inicializa as variáveis
				2 - recebe os valores da variáveis
				3 - validar o maior número;
				
				Refinamento:
					
				1 - inicializa as variáveis
					
					inicializa contador;
					inicializa numero;
					inicializa maiorValor;
				
				2 - recebe os valores da variáveis
					
					recebe número;
				
				3 - validar o maior número;
		
				int contador = 1;
				int numero = 0;
				int maiorValor = 0;
				int cache = 0;
				
				while(contador<=10) {
					
					String setNumero = JOptionPane.showInputDialog("Informe o "+contador+"º número:");
						numero = Integer.parseInt(setNumero);
							if(numero > maiorValor) {
								
								JOptionPane.showMessageDialog(null, numero+" é maior que "+ maiorValor);
									maiorValor = numero;
								
							}else {
								JOptionPane.showMessageDialog(null, numero+" é menor que "+ maiorValor);
							}
							contador++;
							
				}
				
				4.22 (Saída no formato de tabela) Escreva um aplicativo Java que utiliza um loop para imprimir a seguinte tabela de valores:
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
		
			4.23 (Encontre os dois números maiores) Utilizando uma abordagem semelhante àquela do Exercício 4.21, encontre os dois maiores valores
			entre os 10 valores inseridos. [Observação: você só pode inserir cada número uma vez.]		
			
			int contador = 1;
			int numero = 0;
			int maiorValor = 0;
			int cache = 0;
			
			while(contador<=10) {
				
				String setNumero = JOptionPane.showInputDialog("Informe o "+contador+"º número:");
					numero = Integer.parseInt(setNumero);
					
						if(numero >= maiorValor) {
														
							
							if(maiorValor > cache) {
								
								JOptionPane.showMessageDialog(null, numero+" e "+ maiorValor+" são os maiores entre "+"("+numero+", "+ maiorValor+", "+ cache+"...)");														
															
							}else if(cache > maiorValor){
								
								JOptionPane.showMessageDialog(null, numero+" e "+ cache+" são os maiores entre "+"("+numero+", "+ maiorValor+", "+ cache+"...)");
							}
								cache = maiorValor;
								maiorValor = numero;
							
						}else if( maiorValor > numero && numero > cache){
							
							JOptionPane.showMessageDialog(null, maiorValor+" e "+numero+" são os maiores entre "+"("+numero+", "+ maiorValor+", "+ cache+"...)");
							
						
						}else {
							
							JOptionPane.showMessageDialog(null, maiorValor+" e "+cache+" são os maiores entre "+"("+numero+", "+ maiorValor+", "+ cache+"...)");
							
						}
						
						contador++;
			}
			
			4.24 (Validando entrada de usuário) Modifique o programa na Figura 4.12 para validar suas entradas. Para qualquer entrada, se o valor
			entrado for diferente de 1 ou 2, continue o loop até o usuário inserir um valor correto.
		
		 //inicializando variáveis nas declarações
		
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
							 
							 // solicita ao usuário uma entrada e obtém valor fornecido pelo usuário
						String opcao1 = JOptionPane.showInputDialog("Insira o resultado (1 = aprovado, 2 = reprovado):");
						 resultado = Integer.parseInt(opcao1);
						 
					 }
				}
			
				 // if...else está aninhado na instrução while
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
	  

		  // fase de término; prepara e exibe os resultados
		 System.out.printf("%nAprovado: %d%nFalha: %d%n", aprovado, reprovado);

		  // determina se mais de 8 alunos foram aprovadosÿ
		  if (aprovado > 8) {
			  System.out.println("Bônus para instructor!");
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
		
		4.27 (Problema do else oscilante) Determine a saída para cada um dos conjuntos dados de código quando x é 9 e y é 11 e quando x é 11
		e y é 9. O compilador ignora o recuo em um programa Java. Da mesma forma, o compilador Java sempre associa um else com o if imediatamente
		precedente a menos que instruído a fazer de outro modo pela colocação de chaves ({}). À primeira vista, o programador pode
		não ter certeza de qual if um else particular corresponde — essa situação é conhecida como "problema do else oscilante". Eliminamos
		o recuo do seguinte código para tornar o problema mais desafiador. [Dica: aplique as convenções de recuo que você aprendeu.]*/
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
		4.28 (Outro problema do else oscilante) Modifique o código dado para produzir a saída mostrada em cada parte do problema. Utilize
		técnicas de recuo adequadas. Não faça nenhuma alteração além de inserir chaves e alterar o recuo do código. O compilador ignora recuo
		em um programa Java. Eliminamos o recuo do código fornecido para tornar o problema mais desafiador. [Observação: é possível que não
		seja necessária nenhuma modificação para algumas das partes.]
		
		if (y == 8)
			if (x == 5)
			System.out.println("@@@@@");
			else
			System.out.println("#####");
		System.out.println("$$$$$");
		System.out.println("&&&&&");
		
		a) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
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
		
		b) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
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
		
		c) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
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
		
		d) Supondo que x = 5 e y = 7, a seguinte saída é produzida. [Observação: todas as três últimas instruções de saída depois do else são
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
		
		4.29 (Quadrado de asteriscos) Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e, então, exibe um
		quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos os comprimentos de lado possíveis
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
		
		4.30 (Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita ou da direita para a esquerda. Por
		exemplo, cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554 e 11611. Escreva um aplicativo que lê em
		um inteiro de cinco dígitos e determina se ele é ou não um palíndromo. Se o número não for de cinco dígitos, exiba uma mensagem de
		erro e permita que o usuário insira um novo valor.
		
		int pali=0;
		
		String setPali = JOptionPane.showInputDialog("Informe um número de 5 digitos:");			
		
			System.out.print(setPali.substring(0,2));
			System.out.print(setPali.substring(3,5));
			
			if( setPali.substring(0,1).equals(setPali.substring(4,5))) {
				if( setPali.substring(1,2).equals(setPali.substring(3,4))) {
					pali = Integer.parseInt(setPali);
					JOptionPane.showMessageDialog(null, "O valor inserido é um palídromo: "+pali);
				}
				
			}else {
				pali = Integer.parseInt(setPali);
				JOptionPane.showMessageDialog(null, "O valor inserido não é um palídromo: "+pali);
			}
			
			
			4.31 (Imprimindo o equivalente decimal de um número binário) Escreva um aplicativo que insere um número inteiro que contém somente
				0s e 1s (isto é, um número inteiro binário) e imprime seu equivalente decimal. [Dica: utilize os operadores de resto e divisão para
				pegar os dígitos do número binário um de cada vez da direita para a esquerda. No sistema de números decimais, o dígito mais à direita
				tem um valor posicional de 1 e o próximo dígito à esquerda um valor posicional de 10, depois 100, depois 1.000 e assim por diante. O
				número decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de número binário, o dígito mais à direita tem um
				valor posicional de 1, o próximo dígito à esquerda um valor posicional de 2, depois 4, depois 8 e assim por diante. O equivalente decimal
				do binário 1.101 é 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]			
			
						
			int decimal = 0;
			int contador;
			int multD = 1;
			int aux=0;
			
				String setValor = JOptionPane.showInputDialog("Informe um número binário:");								
				
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
				
				JOptionPane.showMessageDialog(null, "O valor do binário informado é "+aux+" na base decimal!");
				
				
				4.32 (Padrão de tabuleiro de damas de asteriscos) Escreva um aplicativo que utiliza apenas as instruções de saída
				System.out.print("* ");
				System.out.print(" ");
				System.out.println();
				para exibir o padrão de tabuleiro de damas a seguir. Uma chamada de método System.out.println sem argumentos faz com que o programa
				gere saída de um único caractere de nova linha. [Dica: as instruções de repetição são requeridas.
				
				* * * * * * * *
				 * * * * * * * *
				* * * * * * * *
				 * * * * * * * *
				* * * * * * * *
				 * * * * * * * *
				* * * * * * * *
				 * * * * * * * * 				 				 					
		
			String resposta = JOptionPane.showInputDialog("Informe o número de posições do tabuleiro:");
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
			
			4.33 (Múltiplos de 2 com um loop infinito) Escreva um aplicativo que continue exibindo na janela de comando os múltiplos do inteiro 2
			— a saber, 2, 4, 8, 16, 32, 64 e assim por diante. Seu loop não deve terminar (isto é, deve criar um loop infinito). O que acontece quando
			você executa esse programa?
			
		
			int multDois=2;
			int contador=1;
			
			while(contador <= multDois) {
				System.out.println(multDois);
				multDois*=2;
				
			}
			
			
			4.34 (O que há de errado com esse código?) O que há de errado com a seguinte instrução? Forneça a instrução correta para adicionar 1 à
			soma de x e y.
			System.out.println(++(x + y));
			
		
			int x=0;
			int y =0;
			
			System.out.println((++x)+ y);
			
			
			4.35 (Lados de um triângulo) Escreva um aplicativo que lê três valores diferentes de zero inseridos pelo usuário, determina e
			imprime se eles poderiam representar os lados de um triângulo.
			
		
			int a, b, c;
		
			System.out.println("Informe o tamanho dos 3 lados de um triângulo:");
			a = entrada.nextInt();
			b = entrada.nextInt();
			c = entrada.nextInt();
			
			if(a == 0 || b == 0 || c==0) {
				
				System.out.println("Nenhum dos valores deve ser igual a 0!!"+"\n");
				
				
				while(a == 0 || b == 0 || c==0) {
					System.out.println("Informe o tamanho dos 3 lados de um triângulo:");
					a = entrada.nextInt();
					b = entrada.nextInt();
					c = entrada.nextInt();
				}
				
			}else if(a == b && b == c) {
				System.out.println("Poderia ser um Triângulo Equilátero");
			}else if(a==b && b!=c || a==c && b!=c ) {
				System.out.println("Poderia ser um Triângulo Isóceles");
			}else {
				System.out.println("Poderia ser um Triângulo Escaleno");
			}
			
			
			4.36 (Lados de um triângulo direito) Escreva um aplicativo que lê três inteiros diferentes de zero, determina e
			 imprime se eles poderiam representar os lados de um triângulo direito.
			
				(FAZER)
			
			4.37 (Fatorial) O fatorial de um inteiro não negativo n é escrito como n! (pronuncia-se “n fatorial”) e é definido como segue:
				n! = n · (n – 1) · (n – 2) · ... · 1 (para valores de n maiores ou iguais a 1)
				e
				n! = 1 (para n = 0)
				Por exemplo, 5! = 5 · 4 · 3 · 2 · 1, o que dá 120.
				
				a) Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu fatorial.
		
		
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
					
					JOptionPane.showMessageDialog(null, "O fator é: "+total);
		
		
				b) Escreva um aplicativo que estima o valor da constante matemática (e) utilizando a fórmula a seguir. Permita ao usuário inserir o número
				de termos a calcular.
				
				e = 1 + 1/1! + 1/2!+ 1/3!+ …
				
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
						
						
					String retorno = String.format("O valor de 'e' é: %.5f", total);
					JOptionPane.showMessageDialog(null, retorno);*/		
		
				/*c) Escreva um aplicativo que computa o valor de e*x utilizando a fórmula a seguir. Permita ao usuário inserir o número de termos a calcular.
				e*X = 1+ x/1! + x*2/2! + x*3/3! + …
		
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
							
						//calculando o valor da potência de x
																	
							aux *= base;
						
													
						System.out.printf("%.2f %n",aux);
							
						//juntando as parte da formula
							
							total += aux /total02;
							
							System.out.printf("%.3f %n",total);
						
						
						contador++;
					}
					
				
				String retorno = String.format("O valor de 'e' é: %.2f", total);
				JOptionPane.showMessageDialog(null, retorno);
		
				4.38 (Impondo privacidade com criptografia) O crescimento explosivo de comunicação e armazenamento de dados na internet e em
				computadores conectados por ela aumentou muito a preocupação com a privacidade. O campo da criptografia envolve a codificação de
				dados para torná-los difíceis de acessar (e espera-se — com os esquemas mais avançados — impossíveis de acessar) para usuários sem
				autorização de leitura. Nesse exercício, você investigará um esquema simples para criptografar e descriptografar dados. Uma empresa que
				quer enviar dados pela internet pediu-lhe que escrevesse um programa que criptografe dados a fim de que eles possam ser transmitidos
				com maior segurança. Todos os dados são transmitidos como inteiros de quatro dígitos. Seu aplicativo deve ler um inteiro de quatro dígitos
				inserido pelo usuário e criptografá-lo da seguinte maneira: substitua cada dígito pelo resultado da adição de 7 ao dígito, obtendo o restante
				depois da divisão do novo valor por 10. Troque então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto. Então, imprima o
				inteiro criptografado. Escreva um aplicativo separado que receba a entrada de um inteiro de quatro dígitos criptografado e o descriptografe
				(revertendo o esquema de criptografia) para formar o número original. [Projeto de leitura opcional: pesquise a “criptografia de chave
				pública” em geral e o esquema de chave pública específica PGP (Pretty Good Privacy). Você também pode querer investigar o esquema
				RSA, que é amplamente usado em aplicativos robustos industriais.]
				
			//Recebendo os dados do usuário e criptografando:
		
				String dados = JOptionPane.showInputDialog("Informe um inteiro de 4 dígitos:");
				int setDados = Integer.parseInt(dados);
				
				if(setDados > 10000) {
					JOptionPane.showMessageDialog(null, "ain. Valor muito grande!!");
						while(setDados > 10000) {
							dados = JOptionPane.showInputDialog("Informe um inteiro de 4 dígitos:");
							setDados = Integer.parseInt(dados);
						}
				}else if(setDados < 1000){
					
					JOptionPane.showMessageDialog(null, "ain. Valor muito pequeno!!");
						while(setDados < 1000) {
							dados = JOptionPane.showInputDialog("Informe um inteiro de 4 dígitos:");
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
				
				
				4.39 (Crescimento demográfico mundial) A população mundial cresceu consideravelmente ao longo dos séculos. O crescimento contínuo
				pode, por fim, desafiar os limites de ar respirável, água potável, terra fértil para agricultura e outros recursos limitados.
				Há evidência de que o crescimento tem reduzido a velocidade nos últimos anos e que a população mundial pode chegar ao ponto
				máximo em algum momento  nesse século e, então, começar a diminuir. Para esse exercício, pesquise questões de crescimento demográfico
				mundial on-line. Não deixe de investigar vários pontos de vista.
				Obtenha estimativas da população mundial atual e sua taxa de crescimento (a porcentagem pela qual provavelmente aumentará neste
				ano). Escreva um programa que calcule o crescimento demográfico mundial anual dos próximos 75 anos, utilizando a premissa simplificadora
				de que a taxa de crescimento atual ficará constante. Imprima os resultados em uma tabela. A primeira coluna deve exibir os anos
				do ano 1 ao ano 75. A segunda coluna deve exibir a população mundial esperada no fim desse ano. A terceira deve exibir o aumento numérico
				na população mundial que ocorreria nesse ano. Utilizando os seus resultados, determine o ano em que a população dobraria com relação
				ao número de hoje se a taxa de crescimento do ano atual persistisse.*/
				
				//taxa de crescimento populacional em 2020 segundo a ONU: 1.1%
				//população mundial em 2020 segundo a ONU: 7.794.799.000
				
				//Criando e inicializando variáveis globais
				String porcentagem = "";
				String popTotal = "";
				String controleAnos = "";
				double setPorcentagem= 0.0;
				double setPopTotal = 0.0;
				int setControleAnos = 0;
				
				do {
					
					porcentagem = JOptionPane.showInputDialog("Informe a taxa de crecimento anual da população mundial:");
					if(porcentagem.length() > 1) {
						
						setPorcentagem = Double.parseDouble(porcentagem);
						System.out.println("setPorcentagem: "+setPorcentagem);
					}
					
					
					popTotal = JOptionPane.showInputDialog("Informe o valor da população mundial:");					
					if(popTotal.length() > 1) {
						
						setPopTotal = Double.parseDouble(popTotal);
						System.out.println("setPopTotal: "+setPopTotal);
					}	
					
					controleAnos = JOptionPane.showInputDialog("Informe quantos anos serão calculados:");					
					if(controleAnos.length() > 1) {
						
						setControleAnos = Integer.parseInt(controleAnos);
						System.out.println("setControleAnos: "+setControleAnos);
					}	

				}while(porcentagem.length()<1 || popTotal.length() < 1 || controleAnos.length() < 1 );
				
				double aux = 0.0;

				
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
							

							tabela [i][j] = (setPorcentagem/100) * (setPopTotal*i);//A segunda coluna deve exibir a população mundial esperada no fim desse ano.
							
							System.out.printf("%.0f | ",tabela [i][j]);
							
						}else if(j == 2 && i > 0){
														
							tabela [i][j]= tabela[i][2];//A terceira deve exibir o aumento numérico na população mundial que ocorreria nesse ano.
							System.out.printf("%.0f\n",tabela [i][j]);
							
						}
																		
					}
						j = 0;

				}
									
		
	}

}
