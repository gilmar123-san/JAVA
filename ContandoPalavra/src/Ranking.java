public class Ranking {
	
	private int posicao;
	private String  pontos;
	private int  jogada;
	
	public Ranking() {
		posicao = 0;
		pontos = " ";
		jogada = 0;		
	}
	
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	public int getPosicao() {
		return posicao;
	}
	
	public void setPontos(String pontos) {
		this.pontos = pontos;
		//System.out.println(pontos);
	}
	
	public String getPontos() {
		int vetor[];
		vetor = new int[posicao];
		
		
		
		return pontos;
	}
	
	public void setjogada(int jogada) {
		this.jogada = jogada;
		
	}
	
	public int getjogada() {
		return jogada;
	}
	
	
}
