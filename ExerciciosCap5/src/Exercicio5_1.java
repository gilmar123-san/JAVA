import java.awt.Graphics;
import javax.swing.JPanel;

public class Exercicio5_1 extends JPanel {

	/*
	 * private int escolha;
	 * 
	 * public Exercicio5_1(int escolha) { this.escolha = escolha; }
	 */

	private int retornoDados[] = new int[5];

	public Exercicio5_1(int retornoDados[]) {
		this.retornoDados = retornoDados;
	}

	public void paintComponent(Graphics g) {
		//super.paintComponent(g);

		/*
		 * 5.1 Desenhe 12 círculos concêntricos no centro de um JPanel (Figura 5.29). O
		 * círculo mais interno deve ter um raio de 10 pixels e cada círculo sucessivo
		 * deve ter um raio de 10 pixels maior que o anterior. Comece localizando o
		 * centro do JPanel. Para obter o canto superior esquerdo de um círculo, mova-se
		 * um raio para cima e um raio para a esquerda a partir do centro. A largura e a
		 * altura do retângulo delimitador têm o mesmo diâmetro do círculo (isto é, duas
		 * vezes o raio).
		 * 
		 * int x= getWidth();//Largura total int y = getHeight();//Altura total int i=0;
		 * while(i<=120) { g.drawOval(x/3-i, y/3-i,x/3+i*2,y/3+i*2); i+=10;
		 * 
		 * 
		 * 5.2 Modifique a Questão 5.16 no final dos exercícios do capítulo para ler a
		 * entrada utilizando diálogos e exibir o gráfico de barras usando retângulos de
		 * comprimentos variados. (5.16 (Gráfico de barras do programa de impressão) Uma
		 * aplicação interessante dos computadores é exibir diagramas e gráficos de
		 * barras. Escreva um aplicativo que leia cinco números entre 1 e 30. Para cada
		 * número que é lido, seu programa deve exibir o mesmo número de asteriscos
		 * adjacentes. Por exemplo, se seu programa lê o número 7, ele deve exibir.
		 * Exiba as barras dos asteriscos depois de ler os cinco números.)
		 

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
