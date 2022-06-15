package Modelo;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;

public class Player {
	private int x, y;
	private int dx, dy;
	private int largura, altura;
	private Image imagem;

	public Player() {
		this.x = 50;
		this.y = 50;
	}

	public void load() {
		ImageIcon referencia = new ImageIcon("res\\space.png");
		imagem = referencia.getImage();

		this.altura = imagem.getHeight(null);
		this.largura = imagem.getWidth(null);
	}

	public void update() {
		x += dx;
		y += dy;
	}

	public void keyPressed(KeyEvent tecla) {

		int codigo = tecla.getKeyCode();

		switch (codigo) {
		case KeyEvent.VK_UP:
			dy = -3;
			break;
		case KeyEvent.VK_DOWN:
			dy = 3;
			break;
		case KeyEvent.VK_LEFT:
			dx = -3;
			break;
		case KeyEvent.VK_RIGHT:
			dx = 3;
			break;
		}

	}

	public void keyReleased(KeyEvent tecla) {

		int codigo = tecla.getKeyCode();

		switch (codigo) {
		case KeyEvent.VK_UP:
			dy = 0;
			break;
		case KeyEvent.VK_DOWN:
			dy = 0;
			break;
		case KeyEvent.VK_LEFT:
			dx = 0;
			break;
		case KeyEvent.VK_RIGHT:
			dx = 0;
			break;
		}

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}

}
