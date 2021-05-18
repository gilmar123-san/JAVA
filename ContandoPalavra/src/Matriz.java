import javax.swing.JOptionPane;

public class Matriz {

	private int colunas;
	private int linhas;
	private int valor;
	
	public Matriz() {
		linhas = 0;
		colunas = 0;
		valor = 0;
	}
	
	public String getMatriz() {
		int matriz [][];
		
		matriz = new int [linhas][colunas];
		
		for(int i=0;i<=linhas;i++) {
			
			for(int j=0; j <= colunas; i++) {
				
				matriz [i][j] = this.valor; 	
				
			}
			
		}
		
		String retorno="";
		
		return retorno;
	}
	
	public void setTamanhoMatriz(int colunas, int linhas) {
		this.colunas = colunas;
		this.linhas = linhas;
	}
	
	public void setValoresMatriz(int valor) {
		this.valor = valor;
	}
	
}
