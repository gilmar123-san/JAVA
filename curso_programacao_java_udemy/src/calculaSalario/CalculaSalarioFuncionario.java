package calculaSalario;

import java.util.Scanner;

public class CalculaSalarioFuncionario {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Exercicio02 funcionario = new Exercicio02();

		System.out.println("Informe o nome do funcionário:");
		String nome = in.next();
		funcionario.setNome(nome);
		
		System.out.println("Informe o salário do funcionário:");
		double salario = in.nextDouble();
		funcionario.setSalarioBruto(salario);

		System.out.println("Informe o imposto sobre o salário:");
		double imposto = in.nextDouble();
		funcionario.setImposto(imposto);
		
		System.out.println(funcionario.toString());
		
		System.out.println("Informe a porcentagem de aumento do salário:");
		double aumento = in.nextDouble();
		funcionario.aumentarSalario(aumento);
		in.close();
	}

}
