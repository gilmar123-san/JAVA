package Interface;

public interface PagamentoOnlineService {
	
	public Double taxaPagamento(Double valor) throws Exception;
	public Double interesse(Double valor, Integer meses) throws Exception;

}
