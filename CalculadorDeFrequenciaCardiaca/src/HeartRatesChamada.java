
import javax.swing.JOptionPane;

public class HeartRatesChamada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HeartRates controle = new HeartRates("","",0,0,0,0,0,0);
		
		String anoAtual = JOptionPane.showInputDialog("Informe o ano atual:");
		int anoAtualInt = Integer.parseInt(anoAtual);
		controle.setAnoAtual(anoAtualInt);
		
		String Idade = JOptionPane.showInputDialog("Informe o ano do seu nascimento:");
		int anoNasc = Integer.parseInt(Idade);
		controle.setAnoNsc(anoNasc);
		
		JOptionPane.showMessageDialog(null,controle.calcularIdade());
		JOptionPane.showMessageDialog(null,controle.calculaFrequenciaMaxima());
		
	}

}
