import javax.swing.JOptionPane;

public class StudentTeste {

	public static void main(String[] args) {
		
		Student aluno = new Student("", 0.0);
		Student aluno01 = new Student("",0.0);
		
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno:");
		aluno.setNome(nome);
		
		String nota = JOptionPane.showInputDialog("Informe a nota do aluno:");
		double notaDoub = Double.parseDouble(nota);
		aluno.setMedia(notaDoub);
		
		String nome01 = JOptionPane.showInputDialog("Informe o nome do aluno:");
		aluno01.setNome(nome01);
		
		String nota01 = JOptionPane.showInputDialog("Informe a nota do aluno:");
		double notaDoub01 = Double.parseDouble(nota01);
		aluno01.setMedia(notaDoub01);
		
		String mensagem = String.format("Nome: %s Nota: %s %n Nome: %s Nota: %s", aluno.getNome(), aluno.getGral(), aluno01.getNome(), aluno01.getGral());
		
		JOptionPane.showMessageDialog(null,mensagem);
	}

}
