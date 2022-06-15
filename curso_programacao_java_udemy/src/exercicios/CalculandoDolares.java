package exercicios;

import java.util.Scanner;

import programa.ConversorCorrenteUtils;

public class CalculandoDolares {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Qual o valor do dollar?");
	double valorDolar = sc.nextDouble();
	
	System.out.println("Quantos dolares você deseja comprar?");
	double qtdDolar = sc.nextDouble();
	
	System.out.printf("Valor a ser pago: %.2f%n", ConversorCorrenteUtils.calcularPagamento(valorDolar, qtdDolar));
	
	
	sc.close();
	}

}
