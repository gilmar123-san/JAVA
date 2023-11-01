package Interface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.println("Insira os dados do contrato:");
			System.out.print("Número: ");
			int numero = sc.nextInt();
			System.out.print("Data (dd/MM/yyyy): ");
			Date data = sdf.parse(sc.next());
			System.out.print("Valor do contrato: ");
			double valor = sc.nextDouble();

			Contrato con = new Contrato(numero, data, valor);

			System.out.print("Insira o número de parcelas: ");
			int parcelas = sc.nextInt();
			
			GeraParcelaService gps = new GeraParcelaService(new PaypalService() );
			gps.processaContrato(con, parcelas);
			
			System.out.println("Parcelas:");
			for (Parcela x : con.getParcelas()) {
				System.out.println(x);
			}
			
			sc.close();
			
		} catch (ParseException e) {
			System.out.println("Error: " + e);
		}catch(Exception e) {
			System.out.println("Error: " + e);
		}

	}
}
