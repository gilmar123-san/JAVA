package account;

//chamado a classe scanner para receber entrada de dados dos usu�rios
import java.util.Scanner;

//importando a classe joptionpane para criar caixas de dialogos.
import javax.swing.JOptionPane;

public class AccountTest {

	public static void main(String[] args) {
		
		//Criando um objeto Scanner para entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		//cria um objeto Conta e atribui a minhaConta
		Account myAccount = new Account("",0.0);
		
		//cria um novo objeto conta e atribui a minha conta
		Account account1 = new Account("Jane Green",0.0);
		Account account2 = new Account("Jhon Blue",0.0);
		
		//criando os objetos de acount para inserir nome e valor do deposito.
		System.out.printf("Nome inicial %s%n", account1.getNome());
		System.out.printf("Saldo inicial %s%n", account1.getBalance());
		
		System.out.println();//Imprime uma linha em brano
		
		System.out.printf("Nome inicial %s%n", account2.getNome());
		System.out.printf("Saldo inicial %s%n", account2.getBalance());
		
		System.out.println();//Imprime uma linha em brano
		
		//Solicitando o nome:
		System.out.print("Por favor, insira seu nome: ");
		String nome = entrada.nextLine();//cria uma var�avel que recebe um valor e vira parametro posteriormente
		myAccount.setNome(nome);//passando o parametro recebido anteriormente na classe Account,mna var�avel de inst�ncia nome
		
		System.out.println();//Imprime uma linha em brano
		
		//solicitando o valor do deposito.
		System.out.print("Por favor, insira o valor do deposito: ");
		double deposito = entrada.nextDouble();//cria uma var�avel que recebe um valor e vira parametro posteriormente
		myAccount.setBalance(deposito);//passando o parametro recebido anteriormente na classe Account,mna var�avel de inst�ncia nome
		
		System.out.println();//Imprime uma linha em brano
		
		//Exibe o nome armazenado no objeto myAccount
		System.out.printf("Dono da conta: %s%nSaldo: %.2f ", myAccount.getNome(), myAccount.getBalance());
		
		JOptionPane.showMessageDialog(null, "Dono da conta");
		entrada.close();
	}

}
