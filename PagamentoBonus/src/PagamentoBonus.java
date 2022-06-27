import java.util.Scanner;

public class PagamentoBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int aprovados = 0;
		int reprovados = 0;
		int contadorEstudantes = 1;
		
		while(contadorEstudantes<=10) {
			
			System.out.println("Informe o resultado (1 - Aprovador, 2 - Reprovado:)");
			int put = entrada.nextInt();
			
			if(put == 1) {
				aprovados = aprovados+1;				
			}else {
				reprovados = reprovados+1;
			}
					
			contadorEstudantes = contadorEstudantes+1;
			
		}
		
		System.out.printf("Alunos aprovados: %d %n Alunos reprovados: %d%n",aprovados, reprovados );
		if(aprovados>8) {
			System.out.println("Bonus para o instrutor!!");
		}
		entrada.close();
	}

}
