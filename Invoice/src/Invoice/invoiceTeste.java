package Invoice;

import javax.swing.JOptionPane;

public class invoiceTeste {

	public static void main(String[] args) {
		
		Invoice fatura = new Invoice();
			fatura.setNumero("1");
			fatura.setDescricao("teclado computacional");
			fatura.setQuantidade(40);
			fatura.setPreco(40.0);
			
			
			String mensagem =String.format("Produto:%n N�mero: %s%n Descri��o: %s%n Quantidade: %d%n Pre�o: %.2f%n Total: %.2f", fatura.getNumero(), fatura.getDescricao(), fatura.getQuantidade(), fatura.getPreco(), fatura.getInvoiceAmount());
			
			JOptionPane.showMessageDialog(null,mensagem);

	}

}
