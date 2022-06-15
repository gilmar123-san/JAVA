package programa;

public class ConversorCorrenteUtils {

	public static final double IOF = 1.10/100;
	
	
	public static double calcularPagamento(double valorDolar, double qtdDolar) {
		
		double valorPagamento =  qtdDolar * valorDolar;
		
		return valorPagamento += valorPagamento * IOF;
	}
	
}
