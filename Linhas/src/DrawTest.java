import javax.swing.JFrame;

public class DrawTest {

	public static void main(String[] args) {
		
		//Criando um painel que contém nosso desenho
		DrawPanel painel = new DrawPanel();
		
		//criando um novo quadro para armazenar o painel
		JFrame aplicacao = new JFrame();
		
		//configurando o frame para ser encerrado quando ele é fechado
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		aplicacao.add(painel);//adicionao painel ao frame
		aplicacao.setSize(1000,650);//configura o tamanho do frame com (largura,altura)
		aplicacao.setVisible(true);//torna o frame visivel

	}

}
