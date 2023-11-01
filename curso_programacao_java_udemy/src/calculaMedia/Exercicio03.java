package calculaMedia;

public class Exercicio03 {

	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;

	public Exercicio03() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 2) {
			this.nome = nome;
		} else {
			System.out.println("Nome inválido. Informe um nome com mais de 2 caracteres");
		}
		;
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota(int count, double nota) {

		switch (count) {
		case 1:
			nota1 = nota;
			break;
		case 2:
			nota2 = nota;
			break;
		case 3:
			nota3 = nota;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + count);
		}
	}

	public String verificarSePassou() {
		String retornoValidacao = "";
		double somaNota = nota1 + nota2 + nota3;

		if (somaNota < 60) {
			retornoValidacao = String.format("Aluno Reprovado. Soma: %.2f. Faltaram %.2f para o aluno ser aprovado.",
					somaNota, (60 - somaNota));
		} else {
			retornoValidacao = String.format("Aluno aprovado com nota %.2f.", somaNota);
		}

		return retornoValidacao;
	}

	public String toString() {

		return String.format("Nome do Aluno: %s%nNotas do Aluno: %.2f, %.2f, %.2f", nome, nota1, nota2, nota3);
	}

}
