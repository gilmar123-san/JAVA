import javax.swing.JOptionPane;

public class Employee {
	private String nome;
	private String sobrenome;
	private double salario;
	
	public Employee() {
		this.nome = "";
		this.sobrenome = "";
		this.salario = 0.0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if(salario > 0.0) {
		this.salario = salario;
		}else {
			JOptionPane.showMessageDialog(null,"Sal�rios negativos n�o ser�o inseridos");
		}
	}
	
	
	
}
