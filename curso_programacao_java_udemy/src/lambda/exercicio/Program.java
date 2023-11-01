package lambda.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import lambda.entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o caminho do arquivo de texto a ser lido (formato: nome,email,salário):");
		String path = in.nextLine();
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path))){
			
			String dado = bf.readLine();
			List<Employee> funcionarios = new ArrayList<>();
			while(dado != null){				
				String[] register =  dado.split(",");				
				Employee funcionario = new Employee(register[0], register[1], Double.parseDouble(register[2]));
				funcionarios.add(funcionario);
				
				dado = bf.readLine();
			}
			
			System.out.println("\nInforme o salário desejado:");
			Double salary = in.nextDouble();
			
			List<String> emails = funcionarios.stream()
					.filter(f -> f.getSalary() >= salary)
					.map(f -> f.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.printf("%nEmails de pessoas cujo salário são maior que '%.2f':%n", salary);
			emails.forEach(System.out::println);
			
			in.nextLine();
			
			System.out.println();
			System.out.println("Informe a primeira letra dos funcionários cujo salário se deseja somar:");
			String letra = in.nextLine();
			
			Double sum = funcionarios.stream()
					.filter(x -> x.getName().toUpperCase().charAt(0) == letra.toUpperCase().charAt(0))
					.map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.printf("%nSoma do salário dos funcionários cujo nome começa com a letra '%s': %.2f",letra, sum);
			
		}catch(Exception e) {
			System.out.println("Error: "+ e);
		}

	}

}
