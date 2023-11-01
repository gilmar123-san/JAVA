package Interface;

public class PaypalService implements PagamentoOnlineService{

	private static final double FEE_PERCENTAGE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;
	
	@Override
	public Double taxaPagamento(Double valor) throws Exception  {
		if(valor==null) {
			throw new Exception("Valor nulo não são permitidos!");
		}
		return valor * FEE_PERCENTAGE;
	}

	@Override
	public Double interesse(Double valor, Integer meses) throws Exception {
		if(valor==null) {
			throw new Exception("Valor não são permitidos!");
		}
		
		if(meses==null) {
			throw new Exception("Meses não podem ser nulos!");
		}		
		return valor * MONTHLY_INTEREST * meses;
	}

}
