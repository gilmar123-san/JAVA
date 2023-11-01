package polimosrfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsadoPolimorfismo extends ProdutoPolimorfisco{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String dataDeFabricacao;
	
	public ProdutoUsadoPolimorfismo(String nome, Double preco) {
		super(nome, preco);
	}

	public ProdutoUsadoPolimorfismo(String nome, Double preco, String dataDeFabricacao) {
		super(nome, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public Date getDataDeFabricacao() throws ParseException {
		return sdf.parse(dataDeFabricacao);
	}

	public void setDataDeFabricacao(String dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}	
	
	@Override
	public String precoTag() throws ParseException {
		return String.format("%s (usado) $ %.2f (Data de Fabricação: %s)",getNome(), getPreco(), sdf.format(getDataDeFabricacao()));
	}
	

}
