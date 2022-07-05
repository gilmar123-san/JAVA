import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DesenhoCap6 extends JPanel {

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
		
		

	}

}
