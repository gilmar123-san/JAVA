package abstracao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaExercicioAbstracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> Contribuintes = new ArrayList<>();

		System.out.print("Insira o número de contribuintes: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			System.out.println("Dados do #" + i + " contribuinte: ");
			System.out.print("Pessoa física ou pessoa jurídica? (f/j): ");
			char tipoContribuinte = sc.next().charAt(0);
			System.out.print("");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			if(tipoContribuinte == 'f') {
				System.out.print("Gastos com saúde: ");
				Double gastoSaude = sc.nextDouble();
				Contribuintes.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			}else {
				System.out.print("Número de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				Contribuintes.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}			
		}
		
		System.out.println();
		System.out.println("Impostos pagos: ");
		for (Contribuinte contribuinte : Contribuintes) {
			System.out.println(contribuinte.toString());
		}

		sc.close();
	}

}
