package account;

import javax.swing.JOptionPane;

public class Account {
	
	private String nome;//Vari�vel de inst�ncia
	private double balance;//Vari�vel de inst�ncia para saldo
	
	//cria o construtor da classe Account
	public Account(String nome, double balance){//O construtor recebe o mesmo nome da classe
		this.nome = nome;
		if(balance>0.0) {
		this.balance=  balance;
		}
		
	}

		//M�todo para definir o nome do objeto
	public void setNome(String nome) {
		this.nome = nome;//armazena o nome passado no parametro (String nome) na vari�vel de inst�ncia (private String nome).
	}
	
	//M�todo para recuperar o nome do objeto.
	public String getNome() {
		return nome;//retorna o valor da vari�vel de inst�ncia (private String nome).
	}
	
	//M�todo para recuperar o valor do saldo
	public double getBalance() {
			return this.balance;		
	}
	
	//M�todo para alterar o valor da balan�a
	public void setBalance(double depositAmount) {
		if(depositAmount > 0.0) {
			this.balance = this.balance + depositAmount;
		}else {
			System.out.println("O valor "+depositAmount+" n�o pode ser adicionado.");
		}
	}
	
	/*3.11 (Classe Account modificada) Modifique a classe Account (Figura 3.8) para fornecer um m�todo chamado withdraw que retira dinheiro
	de uma Account. Assegure que o valor de d�bito n�o exceda o saldo de Account. Se exceder, o saldo deve ser deixado inalterado
	e o m�todo deve imprimir uma mensagem que indica "Withdrawal amount exceeded account balance" [Valor de d�bito
	excedeu o saldo da conta]. Modifique a classe AccountTest (Figura 3.9) para testar o m�todo withdraw.*/
	
	public void setWithDraw(double retirar) {
		if(this.balance > 0.0 && this.balance - retirar >= 0.0) {
			this.balance = 	this.balance - retirar;		
		}else {
			
			String mensagem = String.format("O valor do saque � maior do que o saldo dispon�vel!!!%n Informe um valor menor ou igual ao seu saldo.");
			
			JOptionPane.showMessageDialog(null,mensagem);
			
		}
		
	}
	
	/*3.12 (Classe Invoice) Crie uma classe chamada Invoice para que uma loja de suprimentos de inform�tica a utilize para representar uma
	fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informa��es como vari�veis de inst�ncia � o
	n�mero (tipo String), a descri��o (tipo String), a quantidade comprada de um item (tipo int) e o pre�o por item (double). Sua
	classe deve ter um construtor que inicializa as quatro vari�veis de inst�ncia. Forne�a um m�todo set e um get para cada vari�vel de inst�ncia.
	Al�m disso, forne�a um m�todo chamado getInvoiceAmount que calcula o valor de fatura (isto �, multiplica a quantidade pelo
	pre�o por item) e depois retorna esse valor como double. Se a quantidade n�o for positiva, ela deve ser configurada como 0. Se o pre�o
	por item n�o for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado InvoiceTest que demonstra as
	capacidades da classe Invoice.*/
	
	
	
	/*3.13 (Classe Employee) Crie uma classe chamada Employee que inclua tr�s vari�veis de inst�ncia � um primeiro nome (tipo String), um
	sobrenome (tipo String) e um sal�rio mensal (double). Forne�a um construtor que inicializa as tr�s vari�veis de inst�ncia. Forne�a um
	m�todo set e um get para cada vari�vel de inst�ncia. Se o sal�rio mensal n�o for positivo, n�o configure seu valor. Escreva um aplicativo de
	teste chamado EmployeeTest que demonstre as capacidades da classe Employee. Crie dois objetos Employee e exiba o sal�rio anual
	de cada objeto. Ent�o d� a cada Employee um aumento de 10% e exiba novamente o sal�rio anual de cada Employee.*/
	
	/*3.14 (Classe Date) Crie uma classe chamada Date que inclua tr�s vari�veis de inst�ncia � m�s (tipo int), dia (tipo int) e ano (tipo int).
	Forne�a um construtor que inicializa as tr�s vari�veis de inst�ncia supondo que os valores fornecidos estejam corretos. Ofere�a um m�todo
	set e um get para cada vari�vel de inst�ncia. Apresente um m�todo displayDate que exiba m�s, dia e ano separados por barras normais
	(/). Escreva um aplicativo de teste chamado DateTest que demonstre as capacidades da classe Date.*/
	
	/*3.15 (Removendo c�digo duplicado no m�todo main) Na classe AccountTest da Figura 3.9, o m�todo main cont�m seis instru��es
	(linhas 13 e 14, 15 e 16, 28 e 29, 30 e 31, 40 e 41 e 42 e 43) e cada uma exibe name e balance do objeto Account. Estude essas instru��es
	e voc� perceber� que elas s� diferem no objeto Account sendo manipulado � account1 ou account2. Neste exerc�cio, voc�
	definir� um novo m�todo displayAccount que cont�m uma c�pia dessa instru��o de sa�da. O par�metro do m�todo ser� um objeto
	Account e o m�todo ir� gerar name e balance dele. Ent�o voc� substituir� as seis instru��es duplicadas em main por chamadas para
	displayAccount passando como argumento o objeto espec�fico Account para sa�da.
	Modifique a classe AccountTest da Figura 3.9 para declarar o seguinte m�todo displayAccount ap�s a chave direita de fechamento
	de main e antes da chave direita de fechamento da classe AccountTest:
	public static void displayAccount(Account accountToDisplay)
	{
	// coloque aqui a instru��o que exibe
	// o name e o balance de accountToDisplay
	}
	Substitua o coment�rio no corpo do m�todo por uma instru��o que exiba name e balance de accountToDisplay.
	Lembre-se de que main � um m�todo static, assim pode ser chamado sem antes criar um objeto da classe em que � declarado. Tamb�m
	declaramos o m�todo displayAccount como um m�todo static. Quando main tem de chamar outro m�todo na mesma classe
	sem antes criar um objeto dela, o outro m�todo tamb�m deve ser declarado static.
	Depois de concluir a declara��o de displayAccount, modifique main para substituir as instru��es que exibem name e balance de
	cada Account pelas chamadas para displayAccount � cada uma recebendo como seu argumento o objeto account1 ou account2,
	como apropriado. Ent�o, teste a classe AccountTest atualizada para garantir que ela produz a mesma sa�da como mostrado na Figura
	3.9.*/
	

}
