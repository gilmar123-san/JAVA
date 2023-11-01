package tratamentoExcecoes;

import java.util.Scanner;

public class ProgramaTratamentoExcecoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			
			System.out.println("Informe os dados da conta:");
			System.out.print("Numero: ");
			int numero = sc.nextInt();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Saldo inicial: ");
			double saldo = sc.nextDouble();
			sc.nextLine();
			System.out.print("Limite de saque: ");
			double limiteSaque = sc.nextDouble();
			
			ContaTratamentoExcecoes conta = new ContaTratamentoExcecoes(numero, nome, saldo, limiteSaque);
			
			System.out.println("Informe o valor do saque:");
			double saque = sc.nextDouble();
			conta.saque(saque);
			System.out.print("Novo saldo:"+conta.getSaldo());
			
		} catch (IllegalArgumentException e) {
			System.out.println("Ocorreram alguns erros: " + e.getMessage());
		} finally {
			sc.close();
		}
	}

}
