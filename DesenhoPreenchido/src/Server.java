import javax.swing.JFrame;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame aplicacao = new JFrame();
		janela janela = new janela();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(janela);
		aplicacao.setSize(230,250);
		aplicacao.setVisible(true);
		
	}

}
