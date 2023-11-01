package calculaSalario;

public class Exercicio02 {

	private String nome;
	private double salarioBruto;
	private double imposto;

	public Exercicio02() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public void aumentarSalario(double porcentagem) {
		double aux = this.salarioBruto;
		this.salarioBruto += aux * (porcentagem/100);
		System.out.println("Aumento aplicado: " + aux * (porcentagem/100));
		System.out.println(toString());
	}

	public String toString() {		
		return String.format("Funcionário: %s | Salário: %.2f", getNome(), salarioLiquido());
	}

}
