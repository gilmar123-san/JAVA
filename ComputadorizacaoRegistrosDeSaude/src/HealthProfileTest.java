
import javax.swing.JOptionPane;

public class HealthProfileTest {

	public static void main(String[] args) {
		
		HeartProfile controle = new HeartProfile();
		
		String nome = JOptionPane.showInputDialog("Informe seu nome:");
			controle.setNome(nome);
		
		String sobrenome = JOptionPane.showInputDialog("Informe seu sobrenome:");
			controle.setSobrenome(sobrenome);
		
		String sexo = JOptionPane.showInputDialog("Informe seu sexo");
			controle.setSexo(sexo);
		
		String anoAtual = JOptionPane.showInputDialog("Informe o ano atual:");
			int formataAnoAtual = Integer.parseInt(anoAtual);
				controle.setAnoAtual(formataAnoAtual);
		
		String dia = JOptionPane.showInputDialog("Informe o dia do seu nacimento:");
			int diaNasc = Integer.parseInt(dia);
				controle.setDiaNasc(diaNasc);
		
		String mes = JOptionPane.showInputDialog("Informe o mes do seu nacimento:");
			int mesNasc = Integer.parseInt(mes);
				controle.setMesNasc(mesNasc);
		
		String ano = JOptionPane.showInputDialog("Informe o ano do seu nacimento:");
			int anoNasc = Integer.parseInt(ano);
				controle.setAnoNasc(anoNasc);
			
		String peso  = JOptionPane.showInputDialog("Informe seu peso:");
			double pesoPessoa = Double.parseDouble(peso);
				controle.setPeso(pesoPessoa);
		
		String altura  = JOptionPane.showInputDialog("Informe sua altura:");
			double alturaPessoa = Double.parseDouble(altura);
				controle.setAltura(alturaPessoa);
		
		String retorno = String.format("Nome: %s %s%n Sexo: %s%n Data de nascimento: %d/%d/%d%n Altura: %.2f%n Peso: %.2f%n %s%n %s%n %s%n %s%n",
				controle.getNome(), controle.getSobrenome(), controle.getSexo(), controle.getDiaNasc(),controle.getMesNasc(), controle.getAnoNasc(), controle.getAltura(), controle.getPeso(), controle.calcularIdade(),
				controle.calculaImc(), controle.calculaFrequenciaMaxima(), controle.calculaFrequenciaCardiacaAlvo());
	
	
		JOptionPane.showMessageDialog(null,retorno);

	}

}
