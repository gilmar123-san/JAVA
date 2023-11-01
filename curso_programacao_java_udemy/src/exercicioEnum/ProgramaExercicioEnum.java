package exercicioEnum;
import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ProgramaExercicioEnum {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		//SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");

		System.out.println("Insira os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de aniversário (DD/MM/YYYY):");
		String data = sc.nextLine();
		Cliente cliente = new Cliente(nome, email, sdf.parse(data));
		System.out.println("Insira os dados do pedido: ");
		System.out.print("Status: ");
		PedidoStatus status = PedidoStatus.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.println("Quantos itens existem nesse pedido?");
		int qtdItens = sc.nextInt();
		for (int i = 1; i <= qtdItens; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.next();
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			
			Produto produto = new Produto(nomeProduto, preco);
			
			System.out.print("Quantidade: ");
			int qtd = sc.nextInt();
			PedidoItem item = new PedidoItem(qtd, preco, produto);
			
			pedido.addItens(item);
		}

		System.out.println();
		System.out.println("Resumo do pedido: ");
		System.out.print(pedido);

	}

}
