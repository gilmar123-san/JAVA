package abstracao;

public class PessoaFisica extends Contribuinte{

	private Double gastoSaude;
		
	public PessoaFisica(String nome, Double rendaAnual) {
		super(nome, rendaAnual);
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double calculaImporto() {
		if(getRendaAnual() < 20000) {
			return getRendaAnual() * (15.00/100) - getGastoSaude() * (50.00/100);
		}
		return getRendaAnual() * (25.00/100) - getGastoSaude() * (50.00/100);
	}
	
	@Override
	public String toString() {
		return String.format("%s $ %.2f", getNome(), calculaImporto());
	}

}
