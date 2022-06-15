package Modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.Timer;

public class Fase extends JPanel implements ActionListener{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image fundo;
	private Player player;
	private Timer timer;
	
	public Fase() {		
		setFocusable(true);
		setDoubleBuffered(true);
		
		ImageIcon referencia = new ImageIcon("res\\fundo_preto.jpg");
		fundo = referencia.getImage();
		
		player = new Player();
		player.load();
		
		timer = new Timer(5, null);
		timer.start();
		
		addKeyListener(new TecladoAdapter());
	}	
	
	public void paint(Graphics g) {
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo,0,0,null);
		graficos.drawImage(player.getImagem(),player.getX(),player.getY(),this);
		g.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		player.update();
		repaint();
	}
	
	private class TecladoAdapter extends KeyAdapter {
		
		@Override
		public void keyPressed(KeyEvent e) {
			player.keyPressed(e);
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			player.keyReleased(e);
		}
	}
}
