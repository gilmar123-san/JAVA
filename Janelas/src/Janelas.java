
//importando classe JOptionPane
import javax.swing.JOptionPane;



public class Janelas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pede para o usu�rio informar um nome
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		
		//pede para o usu�rio informar um nome
		String idade = JOptionPane.showInputDialog("Qual a sua idade?");
		
		//convertendo a string em inteiro
		//formatando os dados recebidos anteriormene na vari�vel nome
		Integer.parseInt(idade);
		
		
		//formatando os dados recebidos anteriormene na vari�vel nome
		String mensagem = String.format(" %s voc� tem %s anos", nome,idade);
		
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

}
