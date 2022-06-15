import java.util.Scanner;

public class CrescimentoFacebook {

	private int meses;
	private int taxaAtual;
	private double taxaCrescimentoMensal;

	public double getTaxaCrescimentoMensal() {
		return taxaCrescimentoMensal;
	}

	public void setTaxaCrescimentoMensal(double taxaCrescimentoMensal) {
		this.taxaCrescimentoMensal = taxaCrescimentoMensal;
	}

	private int qtdDesejaAlcancar;

	public int getTaxaAtual() {
		return taxaAtual;
	}

	public void setTaxaAtual(int taxaAtual) {
		this.taxaAtual = taxaAtual;
	}

	public int getQtdDesejaAlcancar() {
		return qtdDesejaAlcancar;
	}

	public void setQtdDesejaAlcancar(int qtdDesejaAlcancar) {
		this.qtdDesejaAlcancar = qtdDesejaAlcancar;
	}

	public void calculador() {
		do {
			System.out.println(taxaAtual);
			taxaAtual += (taxaCrescimentoMensal / 100 * taxaAtual);
			meses++;
		} while (taxaAtual < qtdDesejaAlcancar);

		System.out.printf("Taxa: %d%nQtd de meses: %d%n%n", taxaAtual, meses);
	}

	public void gerarEntradas(Scanner input) {
		System.out.println("Qual a quantidade de usuários do Facebook atual:");
		int qtd = input.nextInt();
		setTaxaAtual(qtd);

		System.out.println("Quantidade que se deseja saber em meses:");
		qtd = input.nextInt();
		setQtdDesejaAlcancar(qtd);

		System.out.println("Taxa de crescimento mensal:");
		double taxaCrescimento = input.nextInt();
		setTaxaCrescimentoMensal(taxaCrescimento);
		
		calculador();
	}

	public void desejaInserirDados(Scanner input) {
		
		String sentinela = "";

		do {
			System.out.println("Deseja fazer outro cálculo? (S-Sim/N-Não)");
			sentinela = input.next();

			if (sentinela.equals("S")) {
				gerarEntradas(input);
				sentinela="";
			}
		} while (sentinela.equals("") || !sentinela.equals("S") && !sentinela.equals("N"));


		System.out.println("Fim do programa!");
	}

}
