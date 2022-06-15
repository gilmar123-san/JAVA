import java.util.Scanner;

public class ConverterDespesas {

	private String despesa = "";
	private int valor = 0;

	public String getDespesa() {
		return despesa;
	}

	public void setDespesa(String despesa) {
		this.despesa = despesa;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor += valor;
	}

	public void gerarEntradaDados(Scanner input) {

		System.out.println("Informe a despesa:");
		String despesa = input.next();
		setDespesa(despesa);

		System.out.println("Informe o valor da despesa:");
		int valor = input.nextInt();
		setValor(valor);
	}

	public void desejaInserirDados(Scanner input) {

		String sentinela = "";

		do {
			System.out.println("Deseja inserir mais dados? (S-Sim/N-Não)");
			sentinela = input.next();
		} while (sentinela.equals("") || !sentinela.equals("S") && !sentinela.equals("N"));

		if (sentinela.equals("S")) {
			gerarEntradaDados(input);
		}
		
		calcularImposto();

		System.out.println("Fim do programa!");
	}

	public void calcularImposto() {
		System.out.println("Imposto a pagar: "+(23.0/100) * this.getValor());
	}
}
