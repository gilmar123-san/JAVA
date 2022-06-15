import javax.swing.JFrame;

import Modelo.Fase;


public class Container extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Container() {
		setTitle("Meu Jogo");
		add(new Fase());
		setSize(640, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
		
	}
	
	public static void main(String []args) {
		new Container();
	}

	
}
