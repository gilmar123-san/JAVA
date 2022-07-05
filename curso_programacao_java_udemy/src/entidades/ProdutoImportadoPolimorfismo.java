package entidades;

public class ProdutoImportadoPolimorfismo extends ProdutoPolimorfisco{

	private Double taxaAlfandega;
	
	public ProdutoImportadoPolimorfismo(String nome, Double preco) {
		super(nome, preco);
	}

	public ProdutoImportadoPolimorfismo(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public Double precoTotal() {			
		return  super.getPreco() + getTaxaAlfandega();
	}
	
	@Override
	public String precoTag() {		
		return String.format("%s $ %.2f (Taxa de alfândega: $ %.2f)", getNome(), getPreco(), getTaxaAlfandega());
	}
}
