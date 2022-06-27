import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DesenhoArcoiris extends JPanel {

	private final static Color VIOLETA = new Color(128, 0, 128);
	private final static Color INDIGO = new Color(75, 0, 130);

	private Color[] colors = { Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW,
			Color.ORANGE, Color.RED };

	public DesenhoArcoiris() {
		setBackground(Color.WHITE); // configura o fundo como branco
	}

	// desenha um arco-íris utilizando arcos concêntricos
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int radius = 20; // raio de um arco

		// desenha o arco-íris perto da parte central inferior
		int centerX = getWidth() / 2;
		int centerY = getHeight() - 10;

		// desenha arcos preenchidos com o mais externo
		for (int counter = colors.length; counter > 0; counter--) {
			// configura a cor para o arco atual
			g.setColor(colors[counter - 1]);

			// preenche o arco de 0 a 180 graus
			g.fillArc(centerX - counter * radius, centerY - counter * radius, counter * radius * 2,
					counter * radius * 2, 0, 180);

		}
	}
}
