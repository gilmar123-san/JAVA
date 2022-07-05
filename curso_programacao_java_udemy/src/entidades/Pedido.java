package entidades;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import entidade.enuns.PedidoStatus;

public class Pedido {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

	private Date momento;
	private PedidoStatus status;
	private Double total;

	private List<PedidoItem> itens = new ArrayList<>();
	private Cliente cliente;

	public Pedido(Date momento, PedidoStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public List<PedidoItem> getItens() {
		return itens;
	}

	public void setItens(List<PedidoItem> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void addItens(PedidoItem item) {
		itens.add(item);
	}

	public void removeItens(PedidoItem item) {
		itens.remove(item);
	}

	public Double getTotal() {
		total();
		return this.total;
	}

	public void total() {
		double sum = 0.0;

		for (PedidoItem Item : itens) {
			sum += Item.subtotal();
		}
		total = sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento: " + sdf.format(this.getMomento()) + "\n");
		sb.append("Status: " + this.status + "\n");
		sb.append("Cliente: " + this.getCliente() + "\n");
		sb.append("Itens: " + "\n");
		for (PedidoItem item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: " + getTotal() + "\n");

		return sb.toString();
	}

}
