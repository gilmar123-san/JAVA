import java.util.Scanner;
import javax.swing.JFrame;

public class ExerciciosCap6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		/*
		 * DesenhoArcoiris arcoiris = new DesenhoArcoiris();
		 * 
		 * JFrame frame = new JFrame();
		 * frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); frame.add(arcoiris);
		 * frame.setSize(400,250); frame.setVisible(true);
		 * 
		 * input.close();
		 * 
		 * 
		 * 7.1 (Desenhando espirais) Neste exercício, você desenhará espirais com os
		 * métodos drawLine e drawArc.
		 * 
		 * a) Desenhe uma espiral com a forma quadrada (como na captura de tela esquerda
		 * da Figura 7.27), centralizada no painel, utilizando o método drawLine. Uma
		 * técnica é utilizar um loop que aumenta o comprimento da linha depois de
		 * desenhar cada duas linhas. A direção na qual desenhar a próxima linha deve
		 * seguir um padrão distinto, por exemplo, para baixo, para a esquerda, para
		 * cima, para a direita.
		 * 
		 * 
		 * JFrame frame = new JFrame(); DesenhoCap6 desenho = new DesenhoCap6();
		 * 
		 * frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); frame.add(desenho);
		 * frame.setSize(400,400); frame.setVisible(true);
		 *
		 * 
		 * b) Desenhe uma espiral circular (como na captura de tela à direita da Figura
		 * 7.27), utilizando o método drawArc para desenhar um semicírculo por vez. Cada
		 * semicírculo sucessivo deve ter um raio maior (conforme especificado pela
		 * largura do retângulo delimitador) e deve continuar a desenhar onde o
		 * semicírculo anterior concluir.
		 */

		JFrame frame = new JFrame();
		DesenhoCap6 cap6 = new DesenhoCap6();
		
		frame.add(cap6);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setVisible(true);

	}

}
