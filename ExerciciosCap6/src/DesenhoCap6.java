import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DesenhoCap6 extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int widht = getWidth();
		int height = getHeight();
		int lado = 1;// os lados vão de 1 - 4
		for (int i = 0; i <= 50; i += 10) {
			switch (lado) {
			case 1:
				g.drawLine(widht / 2, height / 2, widht / 2, (height / 2) + i);
				break;
			case 2:
				// g.drawLine((widht / 2)-i, (height / 2) + i, widht / 2, (height / 2) + i);
				break;
			case 3:
				g.drawLine((widht / 2) - i, (height / 2) + i, (widht / 2) - i, (height / 2) + i);
				break;
			case 4:
				// g.drawLine(widht / 2, height / 2, widht / 2, (height / 2) + i);
				break;
			}

			if (lado == 4) {
				lado = 0;
			}
			lado++;
		}

	}

}
