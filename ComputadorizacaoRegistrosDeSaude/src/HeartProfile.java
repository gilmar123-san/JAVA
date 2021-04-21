import javax.swing.JOptionPane;

public class HeartProfile {
	
	private String nome;
	private String sobrenome;
	private String sexo;
	private int diaNasc;
	private int mesNasc;
	private int anoNasc;
	private double altura;
	private double peso;
	private int anoAtual;
	private int frequenciaMaxima;
	private int idade;
	private double calculo50;
	private double calculo85;
	
	public HeartProfile() {
		this.nome = "";
		this.sobrenome = "";
		this.sexo = "";
		this.diaNasc = 0;
		this.mesNasc = 0;
		this.anoNasc = 0;
		this.altura = 0.0;
		this.peso = 0.0;
		this.anoAtual = 0;
		this.frequenciaMaxima = 0;
		this.idade = 0;
		this.calculo50 = 0.0;
		this.calculo85 = 0.0;
	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		
		this.sobrenome = sobrenome;
	}
	
	public String getSexo() {
		
		return this.sexo;
	}
	
	public void setSexo(String sexo) {
		
		this.sexo = sexo;
	}

	public int getDiaNasc() {
		
		return diaNasc;
	}

	public void setDiaNasc(int diaNasc) {
		
		this.diaNasc = diaNasc;
	}

	public int getMesNasc() {
		
		return mesNasc;
	}

	public void setMesNasc(int mesNasc) {
		
		this.mesNasc = mesNasc;
	}

	public int getAnoNasc() {
		
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		
		this.anoNasc = anoNasc;
	}

	public double getAltura() {
		
		return altura;
	}

	public void setAltura(double altura) {
		
		this.altura = altura;
	}

	public double getPeso() {
		
		return peso;
	}

	public void setPeso(double peso) {
		
		this.peso = peso;
	}
	
	public int getAnoAtual(){
		
		return this.anoAtual;
	}
	
	public void setAnoAtual(int anoAtual) {
		
		this.anoAtual = anoAtual;
	}
	
	public String calcularIdade() {
		
		this.idade = (this.anoAtual - this.anoNasc);
		
		String anoNascimento = String.format("Você tem %d anos",idade);
		
		return anoNascimento;
	}
		
	public String calculaFrequenciaMaxima() {
		
		if(anoAtual == 0) {
			JOptionPane.showMessageDialog(null,"Ano atual vazio!");
		}else {
			this.frequenciaMaxima = (220 - this.idade);
		}
		
		String frequenciaMaxima = String.format("Sua frequência cardiaca máxima é: %d",this.frequenciaMaxima);
		
		return frequenciaMaxima;
	}
	
	public String calculaFrequenciaCardiacaAlvo() {

		
		if(this.frequenciaMaxima > 0) {
			this.calculo50 = ((50.0/100.0)*this.frequenciaMaxima);
			this.calculo85 = ((85.0/100.0)*this.frequenciaMaxima);
		}else {
			JOptionPane.showMessageDialog(null,"Frequência cardíaca máxima menor ou igual a zero!!");
		}
		
		String retorno = String.format("Frequência cardiaca alvo: %.2f-%.2f", this.calculo50, this.calculo85);

		return  retorno;
	}
	
	public String calculaImc() {
		
		double imc = 0.0;
		
		if(this.peso == 0 || this.altura ==0 ) {
			JOptionPane.showMessageDialog(null,"Altura ou peso não informado!!");
		}else {
			imc = (this.peso/(this.altura*this.altura));		
		}
		
		String retorno = String.format("  Índice de massa corporal: %.2f", imc );
		
		return retorno;
	}

}
	
