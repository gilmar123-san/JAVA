import javax.swing.JOptionPane;

public class Palavras {

	private String palavra;


	public Palavras() {
		palavra = "";
	}

	public String getPalavra() {
		
	String palavra = "";
	String textoCompleto="";
	String retorno ="";
	String retorno01 ="";
	String vetor[];
	String vetor01[];
	int cont=1;
	
	vetor = new String[50];
	
	for(int i=1; i <= this.palavra.length(); i++) {
		
		vetor[i] = this.palavra.substring(i-1,i);
		
		if(vetor[i] != vetor[i].toUpperCase()) {
			palavra = vetor[i];
			textoCompleto += palavra;
		}else {
			palavra = vetor[i];
			textoCompleto += "/"+palavra;
			vetor[i] = "/"+vetor[i];
		}
		
		if(vetor[i].substring(0,1).equals("/")) {
			cont++;			
		}
		
	}
		
		vetor01 = new String[cont];
		
		for(int i=0;i<=cont-1;i++) {
			
			if(cont>0) {
				String[] textoSeparado = textoCompleto.split("/");
				vetor[i]=textoSeparado[i];
				retorno01 += "\n"+textoSeparado[i];
			}
			
		}
	
		//System.out.println(textoCompleto);
		retorno = String.format("%nPalavras inseridas: %n%s %n %nQuantidade: %d",retorno01, cont);
		return retorno;

	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	
	
}



