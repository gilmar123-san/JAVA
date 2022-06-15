
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class criandoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome= JOptionPane.showInputDialog("Informe seu nome:");		
		//int [] array = new int [10];
		
		ArrayList <String> lista = new ArrayList<String>();
		
		lista.add(nome);
		lista.add("Santana");		
		
	for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
