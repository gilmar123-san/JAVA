import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	//Desenha um X a partir dos cantos do paniel
	public void paintComponent(Graphics g) {
		
		//chama paintComponent para assegurar que o paniel é exibido corretamente
		//super.paintComponent(g);
		
		int width= getWidth();//largura total
		int height = getHeight();//Altura total
		
		//desenha uma linha a partir do canto superior esquerdo até o inferior direito
		g.drawLine(0, 0, width, height);
		
		//desenha uma linha a partir do canto inferior esquerdo até o superior direito
		g.drawLine(0, height, width, 0);
		
		
	}
	
}
