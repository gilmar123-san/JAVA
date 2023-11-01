package polimosrfismo;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<ProdutoPolimorfisco> listaProduto = new ArrayList<>();

		System.out.print("Insira o número de produtos: ");
		int qtdProd = sc.nextInt();
		for (int i = 1; i <= qtdProd; i++) {
			
			System.out.println("Dados #" + i + " produto");
			System.out.print("Comum, usado ou importado (c/u/i)?");
			char tipoProduto = sc.next().charAt(0);
			System.out.print("Nome:");
			String nome = sc.next();
			System.out.print("Preco:");
			double preco = sc.nextDouble();
			if (tipoProduto == 'i') {
				System.out.print("Taxa alfandegária:");
				double taxaAlfandega = sc.nextDouble();
				ProdutoPolimorfisco prod = new ProdutoImportadoPolimorfismo(nome, preco, taxaAlfandega);
				listaProduto.add(prod);
			} else if (tipoProduto == 'u') {
				System.out.print("Data de Fabricação (DD/MM/YYYY):");
				String data = sc.next();
				ProdutoPolimorfisco prod = new ProdutoUsadoPolimorfismo(nome, preco, data);
				listaProduto.add(prod);
			}else {
				ProdutoPolimorfisco prod = new ProdutoPolimorfisco(nome, preco);
				listaProduto.add(prod);
			}
		}
		
		System.out.println();
		System.out.println("Tags de preco:");
		for (ProdutoPolimorfisco produto : listaProduto) {
			System.out.println(produto.precoTag());
		}

		sc.close();
	}

}
