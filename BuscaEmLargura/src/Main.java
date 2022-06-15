import java.util.Scanner;
import java.security.SecureRandom;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		SecureRandom randomNumbers = new SecureRandom();

		System.out.println("Informe a quantidade de nós:");
		int Linhas = in.nextInt();
		System.out.println("Informe a quantidade de filhos por nó:");
		int colunas = in.nextInt();
		int[][] aberto = new int[Linhas][colunas];
		int[][] fechado = new int[Linhas][colunas];
		popularFilaAberta(aberto, Linhas, colunas, randomNumbers);
		System.out.println("insira o valor que deseja encontrar entre 0 e " + Linhas);
		int valorDeBusca = in.nextInt();
		int retorno = processaFila(aberto, fechado, valorDeBusca);
		if (retorno == 0) {
			System.out.println("Que pena! O valor não foi encontrado!");
		} else if (retorno != 0) {
			System.out.println("Eba... encontramos o que você procurava: " + retorno);
		}
		in.close();
	}

	public static void popularFilaAberta(int[][] aberto, int Linhas, int colunas, SecureRandom randomNumbers) {

		int index = 0;
		while (index < Linhas) {// inserindo valores de forma aleatoria na fila
			int ind = 0;
			while (ind < colunas) {
				aberto[index][ind] = randomNumbers.nextInt(Linhas);
				ind++;
			}
			++index;
		}

	}

	public static int processaFila(int[][] aberto, int[][] fechado, int valorDeBusca) {

		int index = 0;

		System.out.println("Busca por largura...");
		while (index < aberto[index].length) {
			int ind = 0;
			while (ind < aberto.length) {
				System.out.println("Nó: "+ ind +" filho: "+index);
				System.out.println("Comparando com " + aberto[ind][index]);
				if (valorDeBusca == aberto[ind][index]) {
					return valorDeBusca;
				}
				ind++;
			}
			++index;
		}
		index++;
		return 0;

	}

}
