import java.awt.Graphics;//classe que cria desenhos e gráficos
import javax.swing.JPanel;//classe que cria um painel para meu desenho


public class Desenhos extends JPanel{
	
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		int width = getWidth();//pega a largura implicitamente do painel, com base no frame(janela) que exibe nosso painel.
		int Height = getHeight();//pega a altura implicitamente do painel, com base no frame(janela) que exibe nosso painel.
		
		g.drawLine(width/2,  Height/2, width, Height);//desenhando uma linha central
		g.drawLine(width/2+50,  Height/2, width, Height);//desenhando uma linha direita
		g.drawLine(width/2,  Height/2+50, width, Height);//desenhando uma linha esquerda
		
		g.drawLine(0,  0, width/2, Height/2);//desenhando uma linha central
		g.drawLine(0,  0, width/2+50, Height/2);//desenhando uma linha a diretira
		g.drawLine(0,  0, width/2, Height/2+50);//desenhando uma linha a esquerda
		
	}
	

}
