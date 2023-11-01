package retangulo;

public class Exercicio01 {

	private double largura;
	private double altura;

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double algura) {
		this.altura = algura;
	}

	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		double perimetro;
		
		perimetro = 2*(largura+altura);
		
		
		return perimetro;
	}
	
	public double diagonal() {
		double diagonal;
		
		diagonal = Math.sqrt(Math.pow(largura,2)+Math.pow(altura,2));
		
		
		return diagonal;
	}

}
