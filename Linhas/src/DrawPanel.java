import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Desenha um X a partir dos cantos do paniel
	public void paintComponent(Graphics g) {
		
		//chama paintComponent para assegurar que o paniel � exibido corretamente
		//super.paintComponent(g);
		
		int width= getWidth();//largura total
		int height = getHeight();//Altura total
		
		//desenha uma linha a partir do canto superior esquerdo at� o inferior direito
		g.drawLine(0, 0, width, height);
		
		//desenha uma linha a partir do canto inferior esquerdo at� o superior direito
		g.drawLine(0, height, width, 0);
		
		
	}
	
}
