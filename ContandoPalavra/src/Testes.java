import javax.swing.JOptionPane;

public class Testes {

	public static void main(String[] args) {
		
		/*1)	Construa um programa que o usu�rio entre com uma sequ�ncia de palavras em camelCase e imprima na tela o n�mero de palavras informadas. 
			Exemplo: 
			 	   Entrada: umDoisTres (3 palavras na string)
			   Sa�da: 3
		*/
		
		Palavras teste = new Palavras();
		
		String entrada01 = JOptionPane.showInputDialog("Insira uma ou mais palavras em camelCase: ");
		teste.setPalavra(entrada01);
		
		JOptionPane.showMessageDialog(null,teste.getPalavra());
		
		/*2)	Crie um algoritmo que calcule a diferen�a entre as somas das duas principais diagonais de uma matriz e apresente o resultado.
			Exemplo: 
			      1   2   3
			      4   6   6
			      9   8   9 
			1� diagonal: 1 + 6 + 9 = 16
			2� diagonal: 3 + 6 + 9 = 18 
			Obs.: O Usu�rio dever� escolher a dimens�o e os valores da matriz, sendo eles positivos ou negativos. 

		  */
		/*
		Matriz matriz = new Matriz();
		
		String entrada02 = JOptionPane.showInputDialog("Insira a quantidade de linhas da matriz: ");
		int conversao01 = Integer.parseInt (entrada02);
		
		String entrada03 = JOptionPane.showInputDialog("Insira a quantidade de colunas da matriz: ");
		int conversao02 = Integer.parseInt (entrada03);
		
		matriz.setTamanhoMatriz(conversao01, conversao02);
		
		JOptionPane.showMessageDialog(null,matriz.getMatriz());
		
		String entrada04 = JOptionPane.showInputDialog("Informe o valor a ser inserido na coluna da linha: ");
		int conversao03 = Integer.parseInt(entrada01);
		matriz.setValoresMatriz(conversao03);
		
		String entrada05 = JOptionPane.showInputDialog("Informe o valor a ser inserido na coluna da linha: ");
		int conversao04 = Integer.parseInt(entrada02);
		matriz.setValoresMatriz(conversao04);
		
		String entrada06 = JOptionPane.showInputDialog("Informe o valor a ser inserido na coluna da linha :");
		int conversao05 = Integer.parseInt(entrada03);
		matriz.setValoresMatriz(conversao05);*/
		
		/*3)	Construa um algoritmo que retorne como resultado as posi��es do jogador obtido durante cada jogada. 
			Exemplo:
			   Ranking:
			      1� lugar: 100 pontos;
			      2� lugar: 90 pontos;
			      2� lugar: 90 pontos;
			      3� lugar: 80 pontos;
			
			   Jogadas: 
			      1� jogada: 75 pontos;
			      2� jogada: 80 pontos;
			      3� jogada: 105 pontos;
			
			4� lugar (posi��o obtida na 1� jogada);
			3� lugar (posi��o obtida na 2� jogada);
			1� lugar (posi��o obtida na 3� jogada);
			Sa�da esperada do algoritmo: 4, 3, 1.
			
			Obs.: O algoritmo deve permitir que o usu�rio entre com as pontua��es do ranking separado por espa�o em ordem decrescente. O usu�rio deve escolher a quantidade de pontua��es no Ranking.
			Exemplo:
			   Quantidade de posi��es no ranking: 4
			   Ranking Pontua��o: 100 90 90 80
			
			Obs.: As pontua��es obtidas durantes as jogadas pelo jogador. O usu�rio deve escolher a quantidade de jogadas realizadas.
			Exemplo:
			   Quantidade de jogadas: 3
			   Pontua��es das jogadas: 75, 105, 80
			   Mostrar a sa�da esperada: 3, 1, 2
			   */
					
	}
}
