import javax.swing.JOptionPane;

public class DateTeste {

	public static void main(String[] args) {
		
		Date encontro = new Date();
		
		String dia = JOptionPane.showInputDialog("Dia: ");
		encontro.setDia(dia);
		String mes = JOptionPane.showInputDialog("Mes: ");
		encontro.setMes(mes);
		String ano = JOptionPane.showInputDialog("Ano: ");
		encontro.setAno(ano);
		
		String mensagem = String.format("Data: %s/%s/%s", encontro.getDia(), encontro.getMes(), encontro.getAno());
		
		JOptionPane.showMessageDialog(null,mensagem);
		
		
		

	}

}
