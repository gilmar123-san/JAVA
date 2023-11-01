package map;

public class Candidato implements Comparable<Candidato>{
	
	private Pessoa candidato;
	private Integer votos = 0;
	
	public Candidato(Pessoa candidato, Integer votos) {	
		this.candidato = candidato;
		this.votos += votos;
	}

	public Pessoa getCandidato() {
		return candidato;
	}

	public void setCandidato(Pessoa candidato) {
		this.candidato = candidato;
	}

	public Integer getVotos() {
		return votos;
	}

	public void setVotos(Integer votos) {
		this.votos = votos;
	}

	@Override
	public int compareTo(Candidato other) {
		return this.candidato.getNomeCompleto().toUpperCase().compareTo(other.getCandidato().getNomeCompleto().toUpperCase());
	}
}
