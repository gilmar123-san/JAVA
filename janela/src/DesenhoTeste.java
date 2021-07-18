import javax.swing.JFrame;

public class DesenhoTeste {

	public static void main(String[] args) {
		
		Desenhos painel = new Desenhos();
		
		JFrame janela = new JFrame();
		
		janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
		
		janela.add(painel);
		janela.setSize(400,400);
		janela.setVisible(true);
	}

}
