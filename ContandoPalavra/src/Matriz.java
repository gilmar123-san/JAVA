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
		String retorno="";
		String textoCompleto="";
		int somaDiagonalPrincipal = 0;
		int somaDiagonalContra = 0;
		
	
		matriz = new int[linhas][colunas];
		
		System.out.printf("Linhas: %d%nColunas: %d%n",linhas,colunas);
		
		for(int i=0;i <= linhas-1;i++) {
			
			for(int j=0; j <= colunas-1; j++) {
				
				String entrada = JOptionPane.showInputDialog("Informe o valor a ser inserido na coluna "+j+" da linha "+i+": ");
				this.valor = Integer.parseInt(entrada);
				matriz [i][j] = this.valor;	
				if(j == colunas-1) {
					textoCompleto+=" "+matriz [i][j]+"\n";
					//System.out.print(matriz [i][j]+"\n");
				}else {
					textoCompleto+=" "+matriz [i][j];
					//System.out.print(matriz [i][j]);
				}
			}	
						
		}
		
		for(int i=0;i <= linhas-1;i++) {			
			for(int j=0; j <= colunas-1; j++) {
				
				if(j==i) {
					somaDiagonalPrincipal += matriz [i][j];	
					 //System.out.println(somaDiagonalPrincipal);
				}
				
				if(j==((colunas-1)-i)) {
					somaDiagonalContra += matriz [i][j];	
					//System.out.println(somaDiagonalContra);
				}
			}							
		}
		
		String retorno01 = String.format("Martriz: %n%s DP: %d%n DC: %d%n Diferença entre as diagonais: %d",textoCompleto, somaDiagonalPrincipal, somaDiagonalContra,somaDiagonalPrincipal-somaDiagonalContra);
		
		return retorno01;
	}
	
	public void setTamanhoMatriz(int colunas, int linhas) {
		this.colunas = colunas;
		this.linhas = linhas;
	}
	
}
