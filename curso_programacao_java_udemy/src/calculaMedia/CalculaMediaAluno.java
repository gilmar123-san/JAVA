package calculaMedia;

import java.util.Locale;
import java.util.Scanner;

public class CalculaMediaAluno {

	private static boolean podeInserirNota;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		
		System.out.println("Sistema iniciado!");
		
		inserirDadosDoAluno(in);
		
		System.out.println("Fim do programa!");

	}

	public static boolean inserirNovoAluno(Scanner in) {
		String respostaUser;

		do {
			System.out.println("Deseja inserir um novo aluno? S - Sim, N - Não");
			respostaUser = in.next();
		} while (respostaUser.length() < 1 || //
				respostaUser.length() > 1 || //
				!respostaUser.equals("S") && //
						!respostaUser.equals("N"));

		return respostaUser != null && respostaUser.equals("S") ? true : false;
	}

	public static void inserirDadosDoAluno(Scanner in) {

		Exercicio03 aluno = new Exercicio03();

		do{
			System.out.println("Informe o nome do Aluno:");
			String nome = in.next();

			aluno.setNome(nome);

			int cont = 1;
			do {

				System.out.println("Informe a " + cont + "° nota do aluno:");
				Double nota = in.nextDouble();
				validarNota(cont, nota);
				if (podeInserirNota) {
					aluno.setNota(cont, nota);
					cont++;
				}
			} while (cont <= 3);

			System.out.println(aluno.verificarSePassou());

		}while (inserirNovoAluno(in)) ;
	}

	public static void validarNota(int cont, double nota) {

		switch (cont) {
		case 1:
			if (nota > 30) {
				System.out.println("Valor inválido! O primeiro trimestre vale 30.");
				podeInserirNota = false;
			} else {
				podeInserirNota = true;
			}
			break;
		case 2:
		case 3:
			if (nota > 35) {
				System.out.println("Valor inválido! O segundo e terceiro trimestre valem 35 pontos cada.");
				podeInserirNota = false;
			} else {
				podeInserirNota = true;
			}
			break;
		default:
			System.out.println("Nenhum valor informado!");
		}
	}

}
