import java.awt.Graphics;//classe que cria desenhos e gráficos
import javax.swing.JPanel;//classe que cria um painel para meu desenho

public class Desenhos extends JPanel{

	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		int X = getWidth();
		int X2 = getWidth();//pega a largura implicitamente do painel, com base no frame(janela) que exibe nosso painel.
		int Y = getHeight();//pega a altura implicitamente do painel, com base no frame(janela) que exibe nosso painel.
		int Y2 = getHeight();
		
		/*a) Crie o projeto na captura de tela esquerda da Figura 4.20. Esse projeto desenha linhas do canto superior esquerdo, estendendo-as até
			que cubram a metade superior esquerda do painel. Uma abordagem é dividir a largura e altura em um número igual de passos (descobrimos
			que 15 passos funcionam bem). A primeira extremidade de uma linha sempre estará no canto superior esquerdo (0, 0).
			A segunda extremidade pode ser encontrada iniciando no canto inferior esquerdo e movendo-se para cima em um passo vertical e para
			a direita em um passo horizontal. Desenhe uma linha entre as duas extremidades. Continue movendo-se para cima e para o passo à
			direita a fim de encontrar cada extremidade sucessiva. A figura deve ser dimensionada de maneira correspondente à medida que você
			redimensiona a janela.
		
		int i = 1;
		Height=0;
		
		while(i<=15) {
			
			g.drawLine(0, 0, X, Y);
			
			X-=100;
			Y+=50;
			i++;
		}
		
		/*b) Modifique sua resposta da parte (a) para que as linhas se estendam dos quatro cantos, como mostrado na captura de tela da direita na
		Figura 4.20. As linhas de cantos opostos devem se cruzar no meio.
		
		int i = 1;
		Y=0;
	
		while(i<=15) {
			
			g.drawLine(0, 0, X, Y);
			X-=97;//vai do máximo a zero de 97 em 97, ou seja, subtraindo
			Y+=50;//vai de zero ao máximo de 50 em 50
			i++;
		}	
		
		i = 1;
		Y2=0;
		X02=0;
		X=getWidth();
		
		while(i<=15) {
			
			g.drawLine(X, 0, X2, Y2);	
			X2+=97;//vai de zero ao máximo de 97 em 97
			Y2+=50;//Vai de zero ao máximo de 50 em 50 
			i++;
		}	
		
		i = 1;
		Y2 = getHeight();
		Y=0;
		X=0;
		
		while(i<=15) {
			g.drawLine(X, Y, 0, Y2);		
			X+=97; //vai do zero ao máximo de 97 em 97
			Y+=50;//Vai de zero ao máximo de 50 em 50 
			i++;
		}
		
		i = 1;
		Y2 = getHeight();
		X2 = getWidth();
		Y=0;
		X=getWidth();
		
		while(i<=15) {
			g.drawLine(X, Y, X2, Y2);		
			X-=97;//vai do máximo a zero de 97 em 97, ou seja, subtraindo
			Y+=50;//Vai de zero ao máximo de 50 em 50 
			i++;
		}
		
		
		4.2 A Figura 4.21 exibe dois projetos adicionais criados utilizando-se loops while e drawLine.
		a) Crie o projeto na captura de tela da esquerda na Figura 4.21. Comece dividindo cada borda em um número igual de incrementos (escolhemos
		15 novamente). A primeira linha inicia no canto superior esquerdo e termina um passo à direita na extremidade inferior. Para
		cada linha sucessiva, move-se para baixo um incremento na borda esquerda e um incremento para a direita na borda inferior. Continue
		desenhando linhas até alcançar o canto inferior direito. A figura deve ser dimensionada à medida que você redimensiona a janela, de
		modo que as extremidades sempre toquem as bordas.
		
		int contador = 1;
		Y=0;
		X2 = 0;
		
		while(contador<=15) {
			
			g.drawLine(0, Y, X2, Y2);
			
			X2 += 97;
			Y+=47;
			contador++;
		}
		
		b) Modifique sua resposta da parte (a) para espelhar o projeto em todos os quatro cantos, como mostrado na captura de tela da direita na
	Figura 4.21.
		
		int contador = 1;
		Y = 0;
		X2 = 0;
		
		while(contador<=15) {
			
			g.drawLine(0, Y, X2, Y2);
			
			X2 += 97;
			Y += 47;
			contador++;
		}
		
		contador = 1;
		Y= 0;
		X2 = getWidth();
		
		while(contador<=15) {
			
			g.drawLine( X, Y, X2, Y2);
			
			X2 -= 97;
			Y +=47;
			contador++;
		}
		
		contador = 1;
		X2 = getWidth();
		X = getWidth();;
		Y = 0;
		Y2 = getHeight();
		
		while(contador<=15) {
			
			g.drawLine(X, Y, X2, Y2);
			
			X -= 97;
			Y2 -= 47;			
			contador++;
		}
		
		contador = 1;
		X2 = 0;
		X = 0;
		Y = 0;
		Y2 = getHeight();
		
		while(contador<=15) {
			
			g.drawLine(X, Y, X2, Y2);
			
			X += 97;
			Y2 -= 47;			
			contador++;
		}*/
		
		
	}
	

}
