package Interface;

import java.util.Calendar;
import java.util.Date;

public class GeraParcelaService {
	
	private PagamentoOnlineService pagamentoOnline;
		
	public GeraParcelaService(PagamentoOnlineService pagamentoOnline) {
		this.pagamentoOnline = pagamentoOnline;
	}

	public void processaContrato(Contrato contrato, Integer meses) throws Exception {
		double valorBasico = contrato.getValorTotal() / meses;
        for (int i = 1; i <= meses; i++) {
            Date date = addMonths(contrato.getData(), i);
            double updatedQuota = valorBasico + pagamentoOnline.interesse(valorBasico, i);
            double fullQuota =  updatedQuota + pagamentoOnline.taxaPagamento(updatedQuota);
            contrato.addInstallment(new Parcela(date, fullQuota));
        }
	}
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
