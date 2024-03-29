import javax.swing.JOptionPane;

public class HeartRates {

	private String nome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int anonNsc;
	private int anoAtual;
	private int frequenciaMaxima;
	private int idade;
	private double calculo50;
	private double calculo85;
	
	public HeartRates(String nome, String sobrenome, int dia, int mes, int anonNsc, int anoAtual, int frequenciaMaxima, int idade, double calculo50, double calculo85) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.anonNsc = anonNsc;
		this.anoAtual = anoAtual;
		this.frequenciaMaxima = frequenciaMaxima;
		this.idade = idade;
		this.calculo50 = calculo50;
		this.calculo85 = calculo85;
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

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnoNsc() {
		return anonNsc;
	}

	public void setAnoNsc(int anonNsc) {
		this.anonNsc = anonNsc;
	}
	
	public int getAnoAtual() {
		return anoAtual;
	}

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}
	
	public String calcularIdade() {
		this.idade = (this.anoAtual - this.anonNsc);
		
		String anoNascimento = String.format("Voc� tem %d anos",idade);
		
		return anoNascimento;
	}
		
	public String calculaFrequenciaMaxima() {
		
		if(anoAtual == 0) {
			JOptionPane.showMessageDialog(null,"Ano atual vazio!");
		}else {
			this.frequenciaMaxima = (220 - this.idade);
		}
		
		String frequenciaMaxima = String.format("Sua frequ�ncia cardiaca m�xima �: %d",this.frequenciaMaxima);
		
		return frequenciaMaxima;
	}
	
	public String calculaFrequenciaCardiacaAlvo() {

		
		if(this.frequenciaMaxima > 0) {
			this.calculo50 = ((50.0/100.0)*this.frequenciaMaxima);
			this.calculo85 = ((85.0/100.0)*this.frequenciaMaxima);
		}else {
			JOptionPane.showMessageDialog(null,"Frequ�ncia card�aca m�xima menor ou igual a zero!!");
		}
		
		String retorno = String.format("Frequ�ncia cardiaca alvo: %.2f-%.2f", this.calculo50, this.calculo85);

		return  retorno;
	}
	
}
