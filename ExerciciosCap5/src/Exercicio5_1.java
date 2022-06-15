import java.awt.Graphics;
import javax.swing.JPanel;

public class Exercicio5_1 extends JPanel {

	/*
	 * private int escolha;
	 * 
	 * public Exercicio5_1(int escolha) { this.escolha = escolha; }
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int retornoDados[] = new int[5];

	public Exercicio5_1(int retornoDados[]) {
		this.retornoDados = retornoDados;
	}

	public void paintComponent(Graphics g) {
		//super.paintComponent(g);

		/*
		 * 5.1 Desenhe 12 c�rculos conc�ntricos no centro de um JPanel (Figura 5.29). O
		 * c�rculo mais interno deve ter um raio de 10 pixels e cada c�rculo sucessivo
		 * deve ter um raio de 10 pixels maior que o anterior. Comece localizando o
		 * centro do JPanel. Para obter o canto superior esquerdo de um c�rculo, mova-se
		 * um raio para cima e um raio para a esquerda a partir do centro. A largura e a
		 * altura do ret�ngulo delimitador t�m o mesmo di�metro do c�rculo (isto �, duas
		 * vezes o raio).
		 * 
		 * int x= getWidth();//Largura total int y = getHeight();//Altura total int i=0;
		 * while(i<=120) { g.drawOval(x/3-i, y/3-i,x/3+i*2,y/3+i*2); i+=10;
		 * 
		 * 
		 * 5.2 Modifique a Quest�o 5.16 no final dos exerc�cios do cap�tulo para ler a
		 * entrada utilizando di�logos e exibir o gr�fico de barras usando ret�ngulos de
		 * comprimentos variados. (5.16 (Gr�fico de barras do programa de impress�o) Uma
		 * aplica��o interessante dos computadores � exibir diagramas e gr�ficos de
		 * barras. Escreva um aplicativo que leia cinco n�meros entre 1 e 30. Para cada
		 * n�mero que � lido, seu programa deve exibir o mesmo n�mero de asteriscos
		 * adjacentes. Por exemplo, se seu programa l� o n�mero 7, ele deve exibir.
		 * Exiba as barras dos asteriscos depois de ler os cinco n�meros.)
		 

		int x = getWidth();
		int y = getHeight();
		int contador = 0;
		while (contador < retornoDados.length) {
			if (contador != 0) {
				g.drawRect((x/retornoDados.length)*contador, y/retornoDados[contador], (x/(retornoDados.length*2)), y);
			}
			contador++;
		}*/

	}
}
