
import javax.swing.JOptionPane;

public class HeartRatesChamada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HeartRates controle = new HeartRates("","",0,0,0,0,0,0,0.0,0.0);
		
		String nome = JOptionPane.showInputDialog("Informe seu nome:");
		controle.setNome(nome);
		
		String sobrenome = JOptionPane.showInputDialog("Informe seu sobrenome:");
		controle.setSobrenome(sobrenome);
		
		String anoAtual = JOptionPane.showInputDialog("Informe o ano atual:");
		int anoAtualInt = Integer.parseInt(anoAtual);
		controle.setAnoAtual(anoAtualInt);
		
		String dia = JOptionPane.showInputDialog("Informe o dia do seu nascimento:");
		int diaDia = Integer.parseInt(dia);
		controle.setDia(diaDia);
		
		String mes = JOptionPane.showInputDialog("Informe o mes do seu nascimento");
		int mesMes = Integer.parseInt(mes);
		controle.setMes(mesMes);
				
		String Idade = JOptionPane.showInputDialog("Informe o ano do seu nascimento:");
		int anoAno = Integer.parseInt(Idade);
		controle.setAnoNsc(anoAno);
		
		String dadosFormatados = String.format("Nome: %s %s %n Nascimento: %d/%d/%d %n %s %n %s %n %s", controle.getNome(), controle.getSobrenome(), controle.getDia(),controle.getMes(),controle.getAnoNsc(), controle.calcularIdade(),controle.calculaFrequenciaMaxima(),	controle.calculaFrequenciaCardiacaAlvo());
				JOptionPane.showMessageDialog(null,dadosFormatados);
	}

}

