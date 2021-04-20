
import javax.swing.JOptionPane;

public class Janelas_01 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int soma;
		
		//Saudação
		String message = String.format("Olá Seja bem-vindo à calculadora");
		//Mostrando a primeira mensagem	
		JOptionPane.showMessageDialog(null, message);
		
		//aqui recebems o primeiro valor
		String numero1 = JOptionPane.showInputDialog("Informe o primeiro valor:");
		
		//aqui recebems o segundo valor
		String numero2 = JOptionPane.showInputDialog("Informe o segundo valor:"); 
		
		//convertendo os valores de String para inteiro
		int valor1 = Integer.parseInt(numero1);
		int valor2 = Integer.parseInt(numero2);
		
		
		String message1 = String.format("%d Soma: ",valor1+valor2);
		
		JOptionPane.showMessageDialog(null, message1);
		
		
	}

}
