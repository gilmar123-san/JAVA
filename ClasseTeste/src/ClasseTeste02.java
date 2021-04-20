import javax.swing.JOptionPane;

public class ClasseTeste02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClasseTeste objeto01 = new ClasseTeste(1);
		
		String numero01 = JOptionPane.showInputDialog("Informe um valor");
		int numero001 = Integer.parseInt(numero01);
		String numero02 = JOptionPane.showInputDialog("Informe um valor");
		int numero002 = Integer.parseInt(numero02);
		
		objeto01.realizaSoma(numero001, numero002);
		
		String message01 = String.format("Soma: %d", objeto01.getSoma());		
		
		JOptionPane.showMessageDialog(null, message01);
	}

}
