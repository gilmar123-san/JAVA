import java.util.Scanner;

public class ContadorSentinela {
	
	public static void main(String[] args) {
		
		Scanner entra = new Scanner(System.in);
		
		int total = 0;
		int contador = 0;
		int nota = 0;
		
		System.out.println("Informe uma nota ou -1 para sair");
		nota = entra.nextInt();		
		
		while(nota!=-1) {
			
			System.out.println("Informe uma nota ou -1 para sair");
			nota = entra.nextInt();			
			
			total = total + nota;
			contador = contador+1;			
		}
		
		if(contador!=0) {
			
			double media = (double) total/contador;	
			System.out.println("Média: "+media);
		}else {
			System.out.println("Nenhum valor informado!");
		}
		
		
		
	}

}
