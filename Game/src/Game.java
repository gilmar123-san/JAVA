import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int WIDTH = 640, HEIGHT = 480;
	
	public int contador = 100;
	
	public Game() {
		Dimension dimension = new Dimension(WIDTH, HEIGHT);
		this.setPreferredSize(dimension);
	}
	
	public void update() {
		//contador--;
		
		if(contador <= 0) {
			contador=100;
		}
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		
		if(bs ==null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0,0,WIDTH,  HEIGHT);
		
//		g.setColor(Color.white);
//		g.setFont(new Font("Arial", Font.BOLD, 23));
//		g.drawString("Pontos: "+contador, WIDTH/2-60, 20);
		
		g.setColor(Color.green);
		g.fillRect(Game.WIDTH/2 - 100-70,20,contador*3,20);
		g.setColor(Color.white);
		g.drawRect(this.WIDTH/2 - 100-70,20,300,20);
		bs.show();
	}
	
	public static void main (String[] args) {
		
		Game game = new Game();
		JFrame jframe = new JFrame("Meu jogo");
		jframe.add(game);
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.pack();
		
		jframe.setVisible(true);
		
		new Thread(game).start();
	}
	
	@Override
	public void run() {
		while(true) {
			update();
			render();
			try {
				Thread.sleep(1000/60);
				System.out.println("Executando");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
