import javax.swing.JOptionPane;

public class EmployeeTeste {

	public static void main(String[] args) {
		
		Employee employee01 = new Employee();
		Employee employee02 = new Employee();
		
		String nome01 = JOptionPane.showInputDialog("Informe seu nome:");
			employee01.setNome(nome01);
		
		String sobrenome01 = JOptionPane.showInputDialog("Informe seu sobrenome:");
			employee01.setSobrenome(sobrenome01);
		
		String salario01 = JOptionPane.showInputDialog("Informe seu sal�rio:");
			double conversao01 = Double.parseDouble(salario01);
			employee01.setSalario(conversao01);
					String mensagem01 = String.format("Nome: %s%n Sobrenome: %s%n Sal�rio anual: %.2f%n Aumento de 10 por cento: %s",employee01.getNome(), employee01.getSobrenome(), (employee01.getSalario()*12), ((employee01.getSalario()*12)+((employee01.getSalario()*12)*10/100)));
			
						JOptionPane.showMessageDialog(null, mensagem01);
			
		String nome02 = JOptionPane.showInputDialog("Informe seu nome:");
			employee02.setNome(nome02);
			
		String sobrenome02 = JOptionPane.showInputDialog("Informe seu sobrenome:");
			employee02.setSobrenome(sobrenome02);
			
		String salario02 = JOptionPane.showInputDialog("Informe seu sal�rio:");
			double conversao02 = Double.parseDouble(salario02);
			employee02.setSalario(conversao02);
					String mensagem02 = String.format("Nome: %s%n Sobrenome: %s%n Sal�rio anual: %.2f%n  Aumento de 10 por cento: %s", employee02.getNome(), employee02.getSobrenome(), (employee02.getSalario()*12), ((employee02.getSalario()*12)+((employee02.getSalario()*12)*10/100)));
				
						JOptionPane.showMessageDialog(null, mensagem02);	
		
		
	}

}
