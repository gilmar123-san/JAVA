import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuestionarioAquecimentoGlobal {

	private int pontuacao = 10;

	private final String PRIMEIRA_QUESTAO = "Os céticos que não acreditam de vez em aquecimento global são:";
	private final String SEGUNDA_QUESTAO = "A que as principais causas do aquecimento global estão relacionadas, para a maioria dos cientistas?";
	private final String TERCEIRA_QUESTAO = "Os céticos quanto ao aquecimento global afirmam que...";
	private final String QUARTA_QUESTAO = "Os efeitos do aquecimento global são diversos e podem estar relacionados com a atmosfera...,";
	private final String QUINTA_QUESTAO = "O efeito estufa é um?";

	private final String PRIMEIRA_RESPOSTA = "Os que atacam os dados climáticos, as análises dos climatologistas e as previsões baseadas nos modelos de computador com maior veemência.";
	private final String SEGUNDA_RESPOSTA = "Com as práticas humanas realizadas de maneira não sustentável, ou seja, sem garantir a existência dos recursos e do meio ambiente para as gerações futuras.";
	private final String TERCEIRA_RESPOSTA = "A posição de algumas estações climáticas em áreas urbanas pode resultar em mensurações imprecisas. De acordo com eles, os dados estão sendo corrompidos pela ilha de calor urbana, um efeito produzido pelos sistemas de transporte urbano, grandes volumes de asfalto com alta capacidade de absorção de calor e altas concentrações de dióxido de carbono gerado por grande número de residências e empresas em áreas densamente povoadas.";
	private final String QUARTA_RESPOSTA = "Hidrosfera e também com a biosfera. Podemos citar como consequência o desegelo, elevação do nível dos oceanos, aumento das temperaturas, pode gerar ainda a maior incidência de tufões e furacões ou a presença deles em áreas onde não eram comuns e entre outros.";
	private final String QUINTA_RESPOSTA = "Fenômeno de ordem natural capaz de garantir que a Terra seja habitável.";
	HashMap<Integer, String> respostas = new HashMap<>();
	HashMap<Integer, String> pergunta = new HashMap<>();

	public void gerarPerguntas() {

		SecureRandom randomNumbers = new SecureRandom();

		int valor = 1 + randomNumbers.nextInt(5);

		switch (valor) {
		case 1:
			pergunta.put(1, PRIMEIRA_QUESTAO);
			System.out.println(PRIMEIRA_QUESTAO);
			break;
		case 2:
			pergunta.put(2, PRIMEIRA_QUESTAO);
			System.out.println(SEGUNDA_QUESTAO);
			break;
		case 3:
			pergunta.put(3, PRIMEIRA_QUESTAO);
			System.out.println(TERCEIRA_QUESTAO);
			break;
		case 4:
			pergunta.put(4, PRIMEIRA_QUESTAO);
			System.out.println(QUARTA_QUESTAO);
			break;
		case 5:
			pergunta.put(5, PRIMEIRA_QUESTAO);
			System.out.println(QUINTA_QUESTAO);
			break;
		default:
			System.out.println("Nenhum valor encontrado!");
		}

	}

	public void gerarRespostas() {

		SecureRandom randomNumbers = new SecureRandom();
		ArrayList<Integer> aux = new ArrayList<>();
		int cont = 1;
		int valor = 0;

		while (cont <= 4) {
			System.out.println("\n-----------------------------------------------------------------------------\n");
			valor = gerarValor(randomNumbers, aux);
			aux.add(valor);
			switch (valor) {
			case 1:
				respostas.put(cont, PRIMEIRA_RESPOSTA);
				System.out.println(cont + " - " + PRIMEIRA_RESPOSTA);
				break;
			case 2:
				respostas.put(cont, SEGUNDA_RESPOSTA);
				System.out.println(cont + " - " + SEGUNDA_RESPOSTA);
				break;
			case 3:
				respostas.put(cont, TERCEIRA_RESPOSTA);
				System.out.println(cont + " - " + TERCEIRA_RESPOSTA);
				break;
			case 4:
				respostas.put(cont, QUARTA_RESPOSTA);
				System.out.println(cont + " - " + QUARTA_RESPOSTA);
				break;
			case 5:
				respostas.put(cont, QUINTA_RESPOSTA);
				System.out.println(cont + " - " + QUINTA_RESPOSTA);
				break;
			default:
				System.out.println("Nenhum valor encontrado!");
			}

			cont++;
		}

		receberVerificarResposta();
	}

	private int gerarValor(SecureRandom randomNumbers, ArrayList<Integer> aux) {
		int valor;
		do {
			valor = 1 + randomNumbers.nextInt(5);
		} while (aux.contains(valor));
		return valor;
	}

	public void receberVerificarResposta() {
		Scanner entrada = new Scanner(System.in);
		int resposta = 0;
		System.out.println("\nPontuação: " + pontuacao);
		do {
			System.out.println("\nSua resposta:");
			resposta = entrada.nextInt();
		} while (!respostas.containsKey(resposta));

		if (pergunta.containsKey(resposta)) {
			pontuacao++;
		} else {
			pontuacao--;
		}

		System.out.println("Pontuação: " + pontuacao);
		String finalizar;

		do {
			System.out.println("Deseja repetir? S/N");
			finalizar = entrada.next();
		} while (!finalizar.equals("N") && !finalizar.equals("S"));

		if (finalizar.equals("S")) {
			gerarPerguntas();
			gerarRespostas();
		} else {
			System.out.println("Fim do sistema!");
		}
	}

}
