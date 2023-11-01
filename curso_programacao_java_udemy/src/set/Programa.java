package set;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Set set = new HashSet<>();

		System.out.print("Existem quantos alunos no curso A? ");
		int qtd = sc.nextInt();
		for (int i = 1; i <= qtd; i++) {
			set.add(sc.next());
		}
		
		System.out.print("Existem quantos alunos no curso B? ");
		qtd = sc.nextInt();
		for (int i = 1; i <= qtd; i++) {
			set.add(sc.next());
		}
		
		System.out.print("Existem quantos alunos no curso C? ");
		qtd = sc.nextInt();
		for (int i = 1; i <= qtd; i++) {
			set.add(sc.next());
		}
		System.out.println("Total de alunos: " + set.size());
		sc.close();
	}
}
