package retangulo;

import java.util.Scanner;

public class RetanguloMain {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		Exercicio01 retangulo = new Exercicio01();
		double largura, altura;

		System.out.println("Informe a largura e altura de um retângulo:");
		largura = inp.nextDouble();
		altura = inp.nextDouble();

		retangulo.setLargura(largura);
		retangulo.setAltura(altura);

		System.out.printf("Área: %.2f %nPerimetro: %.2f %nDiagonal: %.2f", retangulo.area(), retangulo.perimetro(), retangulo.diagonal());
		inp.close();
	}

}
