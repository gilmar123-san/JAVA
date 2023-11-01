package exercicioEnum;

import javax.management.StringValueExp;
import javax.swing.plaf.synth.SynthProgressBarUI;

public class PedidoItem {

	private Integer quantidade;
	private Double preco;
	private Double subtotal;
	
	private Produto produto;

	public PedidoItem(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Double subtotal() {					
		return preco * quantidade;
	}
	
	public String toString() {
		
		return String.format("%s, quantidade: %d", this.getProduto().toString(), this.getQuantidade());
	}
	
}
