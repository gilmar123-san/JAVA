public class ClasseTeste {

	private int soma;
	
	public ClasseTeste(int soma) {
		
		this.soma = soma;
		
	}
	
	public int getSoma() {
		return this.soma;
	}
	
	public void realizaSoma(int numero01, int numero02) {
		
		this.soma = numero01+numero02;
	}
	
}
