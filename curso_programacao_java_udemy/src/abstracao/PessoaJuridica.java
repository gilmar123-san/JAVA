package abstracao;

public class PessoaJuridica extends Contribuinte{

	private Integer numeroFuncionarios;
	
	public PessoaJuridica(String nome, Double rendaAnual) {
		super(nome, rendaAnual);
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double calculaImporto() {
		if(getNumeroFuncionarios() > 10) {
			return getRendaAnual() * (14.00/100);
		}
		return getRendaAnual() * (16.00/100);
	}
	
	public String toString() {
		return String.format("%s $ %.2f", getNome(), calculaImporto());
	}
}
