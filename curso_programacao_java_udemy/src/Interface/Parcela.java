package Interface;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataVencimento;
	private Double valor;
	
	public Parcela() {		
	}
	
	public Parcela(Date dataVencimento, Double valor) {
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %.2f", sdf.format(dataVencimento), getValor()); 
	}
}
