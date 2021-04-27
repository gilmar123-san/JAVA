public class Student {

	private String nome;
	private double media;
	
	public Student(String nome, double media) {
		this.nome = nome;
	
		if(media > 0.0) {
			if(media <= 100.0) {
				this.media = media;
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
	
		if(media > 0.0) {
			if(media <= 100.0) {
				this.media = media;
			}
		}
	}
	
	public String getGral() {
		
		String classificacao="";
		
		if(this.media>=90.0){
			classificacao = "A";
		}else if(this.media>=80) {
			classificacao = "B";
		}else if(this.media>=70) {
			classificacao = "C";
		}else if(this.media>=60) {
			classificacao = "D";
		}else {
			classificacao = "F";
		}
		
		return classificacao;
	}
}
