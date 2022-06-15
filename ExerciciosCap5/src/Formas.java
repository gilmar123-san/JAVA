
import java.awt.Graphics;
import javax.swing.JPanel;

public class Formas extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int escolha;

	public Formas(int userEscolha) {		
		escolha = userEscolha;		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		for(int i=0; i<=10; i++) {
			switch(escolha) {		
				case 1:
					g.drawRect(10+i*10,10+i*10,50+i*10,50+i*10);
					break;
				
				case 2:
					g.drawOval(10+i*10,10+i*10,50+i*10,50+i*10);
					break;
				case 3:
					g.drawOval(10+i*10,10+i*10,50+i*10,50+i*10);
					g.drawRect(10+i*10,10+i*10,50+i*10,50+i*10);
					break;
			}
		}
	}
	
	
}
