package Invoice;

public class Invoice {
	
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Invoice() {
		this.numero = "";
		this.descricao = "";
		this.quantidade = 0;
		this.preco = 0.0;	
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		
		return this.numero;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		
		return this.descricao;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		
		return this.quantidade;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		
		return this.preco;	
	}
	
	public double getInvoiceAmount() {
		
		if(this.quantidade<0) {
			this.quantidade = 0;
		}else if(this.preco<0.0){
			this.preco = 0.0;
		}
		double fatura = (this.quantidade*this.preco);
		
		return fatura;
	}

}
