package lambda.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import lambda.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		/*
		List<Product> lista = new ArrayList<>();		
		lista.add(new Product("TV", 1200.00));
		lista.add(new Product("Notebook", 5300.00));
		lista.add(new Product("Sofá", 1256.00));
		
		
		Comparator<Product> comp = new Comparator<Product>() {//2 - forma de passar um comparator dentro do list.sort(comparator)  usando classe anônima

			@Override
			public int compare(Product p1, Product p2) {		
				return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
			}
			
		};
			
		Comparator<Product> comp = (p1, p2) -> {//3 - forma de passar um comparator dentro do list.sort(comparator) usando função anônima 
			return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		};
		
		ou
		
		Comparator<Product> comp = (p1, p2) -> (p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));//4 - forma de passar um comparator dentro do list.sort(comparator) usando função anônima 		
		
		ou
		
		
		lista.sort((p1, p2) -> (p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase())));//new MyComparator() 1 - forma, criando uma classe a parte que implementa compare(arg01, arg02)
		
		
		#trabalhando com Predicate
		
		lista.add(new Product("Peixe", 20.00));
		lista.add(new Product("Frango", 20.00));
		lista.add(new Product("Cordeiro", 70.00));
		lista.add(new Product("Boi", 100.00));
		
		
		lista.removeIf(x -> x.getPrice() >= 100);
		lista.removeIf(new ProductPredicate());
		lista.removeIf(Product::nonStaticProductPredicate);
		lista.removeIf(Product::StaticProductPredicate);
		Predicate<Product> pred = p -> p.getPrice() >= 100;
			
		
		lista.removeIf(p -> p.getPrice() >= 100);
		for (Product product : lista) {
			System.out.print(product);
		}
			
		
		#trabalhando com Consumer
				
		lista.add(new Product("Fiat", 80.000));
		lista.add(new Product("Volkswagen", 60.000));
		lista.add(new Product("BMW", 100.000));
		lista.add(new Product("Toiota", 100.00));		
		
		//lista.forEach(new MyConsumer());
		//lista.forEach(Product::consumer);
		//lista.forEach(Product::nonStaticConsumer);
		
		//Consumer<Product> con = p -> {
		//	p.setPrice(p.getPrice() * 1.1);
		//};
		
		
		#Consumer<Product> con = p -> p.setPrice(p.getPrice() * 1.1);
				
		lista.forEach(con);
		
		lista.forEach(p -> p.setPrice(p.getPrice() * 1.1));					
		lista.forEach(System.out::println);
		
		#trabalhando com Function
		
		lista.add(new Product("Fiat", 80.000));
		lista.add(new Product("Volkswagen", 60.000));
		lista.add(new Product("BMW", 100.000));
		lista.add(new Product("Toiota", 100.00));
		
		List<String> listaString = lista.stream().map(new MyFunction()).collect(Collectors.toList());
		List<String> listaString = lista.stream().map(Product::staticFunctionUpperCaseName).collect(Collectors.toList());
		List<String> listaString = lista.stream().map(Product::nonStaticFunctionUpperCaseName).collect(Collectors.toList());		
		Function<Product, String> fun = p -> p.getNome().toUpperCase();		
		List<String> listaString = lista.stream().map(fun).collect(Collectors.toList());
		List<String> listaString = lista.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());	
		listaString.forEach(System.out::println);
		
		ProductService ps = new ProductService();
		
		lista.add(new Product("Tiat", 80.000));
		lista.add(new Product("Volkswagen", 60.000));
		lista.add(new Product("BMW", 100.000));
		lista.add(new Product("Toiota", 100.00));
		
		
		
		Double sum = ps.filteredSum(lista, p -> p.getNome().charAt(0) == 'T');
		
		System.out.printf("Sum = %.2f", sum);
		
		#trabalhando com Stream
		
		List<Integer> list = Arrays.asList(3,4,5,9,10);
		
		Stream<Integer> st1 = list.stream().map(i -> i * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, i -> i+1).limit(10);
		System.out.println(Arrays.toString(st3.toArray()));
		
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]).limit(10);
		System.out.println(Arrays.toString(st4.toArray()));
		
		#trabalhando com Stream
		
		List<Integer> list = Arrays.asList(3,4,5,9,10);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.printf("Sum: %d%n", sum);
		
		List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
		
		#Exercício resolvido
		*/
		
		System.out.println("Informe o caminho do arquivo:");
		String path = in.nextLine();
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path))){
					
			List<Product> listaProdutos = new ArrayList<>();
			
			String line = bf.readLine();
			while(line != null) {				
				String [] fields = line.split(",");
				listaProdutos.add(new Product(fields[0], Double.parseDouble(fields[1])));				
				line = bf.readLine();
			}
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			Double avg = listaProdutos.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / listaProdutos.size();
			System.out.printf("Média de preços: %.2f%n", avg);
			
			List<String> nomes = listaProdutos.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getNome())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			
			//System.out.println(Arrays.toString(nomes.toArray()));
			nomes.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		in.close();
	}
}
