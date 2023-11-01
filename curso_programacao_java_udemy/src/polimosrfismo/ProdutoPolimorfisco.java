package polimosrfismo;

import java.text.ParseException;

public class ProdutoPolimorfisco {
 
	private String nome;
	private Double preco;
	
	public 	ProdutoPolimorfisco() {
	}
	
	public ProdutoPolimorfisco(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String precoTag() throws ParseException {
		
		return String.format("%s $ %.2f", getNome(), getPreco());
	}
	
}
