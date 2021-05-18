import javax.swing.JOptionPane;

public class Testes {

	public static void main(String[] args) {
		
		/*1)	Construa um programa que o usuário entre com uma sequência de palavras em camelCase e imprima na tela o número de palavras informadas. 
			Exemplo: 
			 	   Entrada: umDoisTres (3 palavras na string)
			   Saída: 3
		*/
		
		Palavras teste = new Palavras();
		
		String entrada01 = JOptionPane.showInputDialog("Insira uma ou mais palavras em camelCase: ");
		teste.setPalavra(entrada01);
		
		JOptionPane.showMessageDialog(null,teste.getPalavra());
		
		/*2)	Crie um algoritmo que calcule a diferença entre as somas das duas principais diagonais de uma matriz e apresente o resultado.
			Exemplo: 
			      1   2   3
			      4   6   6
			      9   8   9 
			1ª diagonal: 1 + 6 + 9 = 16
			2ª diagonal: 3 + 6 + 9 = 18 
			Obs.: O Usuário deverá escolher a dimensão e os valores da matriz, sendo eles positivos ou negativos. 

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
		
		/*3)	Construa um algoritmo que retorne como resultado as posições do jogador obtido durante cada jogada. 
			Exemplo:
			   Ranking:
			      1º lugar: 100 pontos;
			      2º lugar: 90 pontos;
			      2º lugar: 90 pontos;
			      3º lugar: 80 pontos;
			
			   Jogadas: 
			      1ª jogada: 75 pontos;
			      2ª jogada: 80 pontos;
			      3ª jogada: 105 pontos;
			
			4º lugar (posição obtida na 1ª jogada);
			3º lugar (posição obtida na 2ª jogada);
			1º lugar (posição obtida na 3ª jogada);
			Saída esperada do algoritmo: 4, 3, 1.
			
			Obs.: O algoritmo deve permitir que o usuário entre com as pontuações do ranking separado por espaço em ordem decrescente. O usuário deve escolher a quantidade de pontuações no Ranking.
			Exemplo:
			   Quantidade de posições no ranking: 4
			   Ranking Pontuação: 100 90 90 80
			
			Obs.: As pontuações obtidas durantes as jogadas pelo jogador. O usuário deve escolher a quantidade de jogadas realizadas.
			Exemplo:
			   Quantidade de jogadas: 3
			   Pontuações das jogadas: 75, 105, 80
			   Mostrar a saída esperada: 3, 1, 2
			   */
					
	}
}
