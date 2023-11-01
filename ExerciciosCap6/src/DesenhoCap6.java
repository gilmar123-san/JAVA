import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DesenhoCap6 extends JPanel {

	private final static Color VIOLET = new Color(128, 0, 128);
	private final static Color INDIGO = new Color(75, 0, 130);

	private Color[] colors = { Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW,
			Color.ORANGE, Color.RED };

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		/*
		 * a) Desenhe uma espiral com a forma quadrada (como na captura de tela esquerda
		 * da Figura 7.27), centralizada no painel, utilizando o método drawLine. Uma
		 * técnica é utilizar um loop que aumenta o comprimento da linha depois de
		 * desenhar cada duas linhas. A direção na qual desenhar a próxima linha deve
		 * seguir um padrão distinto, por exemplo, para baixo, para a esquerda, para
		 * cima, para a direita int widht = getWidth(); int height = getHeight(); int
		 * lado = 1;// os lados vão de 1 - 4 int increment = 50; for (int i = 0; i <=
		 * 500; i += increment) { while (lado <= 4) { switch (lado) { case 1:
		 * g.drawLine((widht / 2) + i, (height / 2) - i, (widht / 2) + i, (height / 2) +
		 * i + increment); break; case 2: if (i > 0) { g.drawLine((widht / 2) - i,
		 * (height / 2) + i, (widht / 2) + i - increment, (height / 2) + i); } break;
		 * case 3: g.drawLine((widht / 2) - i, (height / 2) - i, (widht / 2) - i,
		 * (height / 2) + i); break; case 4: g.drawLine((widht / 2) - i, (height / 2) -
		 * i, (widht / 2) + i, (height / 2) - i); break; }
		 * 
		 * lado++; }
		 * 
		 * if (lado >= 4) { lado = 1; } }
		 */

		int radius = 20; // raio de um arco
		int centerX = getWidth() / 2;
		int centerY = getHeight() - 10;
		g.setColor(Color.BLUE);
		for (int counter = colors.length; counter > 0; counter--) {

			g.fillArc(centerX - counter * radius, centerY - counter * radius, counter * radius * 2,
					counter * radius * 2, 0, 180);
		}
	}

}
