package lendoArquivos;

public class ProdutoLendoArquivos {
	
	private String nome;
	private Double precoUnitario;
	private Integer quantidade;
	
	public ProdutoLendoArquivos() {		
	}
	
	public ProdutoLendoArquivos(String nome,Double precoUnitario,Integer quantidade) {
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;		
	}
	
	public String getNome() {
		return nome;		
	}
	
	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;		
	}
	
	public Double getPrecoUnitario() {
		return precoUnitario;		
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;		
	}
	
	public Integer getQuantidade() {
		return quantidade;		
	}	
	
	@Override
	public String toString() {
		return getNome() +","+ getPrecoUnitario()*getQuantidade();
				
	}

}

