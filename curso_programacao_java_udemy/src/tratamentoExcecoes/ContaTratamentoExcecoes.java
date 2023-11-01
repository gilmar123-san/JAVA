package tratamentoExcecoes;

public class ContaTratamentoExcecoes {

	private Integer numero;
	private String dono;
	private Double saldo;
	private Double limiteSaque;

	public ContaTratamentoExcecoes(Integer numero, String dono, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.dono = dono;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void deposito(Double valor) {
		saldo += valor;
	}

	public void saque(Double valor) {
		if (valor > limiteSaque) {
			throw new IllegalArgumentException("Valor de saque maior que o limite de saque atual!");
		}
		
		if(valor > saldo) {
			throw new IllegalArgumentException("Valor de saque maior que o saldo atual!");	
		}
		
		saldo-=valor;
	}

}
