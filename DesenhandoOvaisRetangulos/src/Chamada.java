import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Chamada {

	public static void main(String[] args) {
		
		/*String escolha = JOptionPane.showInputDialog("Informe 1 para desenhar retangulos\nInforme 2 para desenhar ovais\nInforme 3 para desenhar tudo junto.");		
		int decisao = Integer.parseInt(escolha);*/
		
		int [] retornoCliente = new int [5];
		int contador=0;
		do {
		String escolha = JOptionPane.showInputDialog("Informe 5 números entre 1 e 30:");
		int decisao = Integer.parseInt(escolha);
		retornoCliente[contador] = decisao;
		}while(++contador < 5);
				
		Exercicio5_1 painel = new Exercicio5_1(retornoCliente);
		
		JFrame tela = new JFrame();
		
		tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE);
		tela.add(painel);
		tela.setSize(300, 300);
		tela.setVisible(true);
		
	}

}
