package lambda.entities;

import java.util.Objects;

public class Product{

	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
//	public static boolean staticProductPredicate(Product p) {
//		return p.getPrice() >= 100;
//	}
	
	public boolean nonStaticProductPredicate() {
		return this.getPrice() >= 100;
	}
	
//	public static void staticConsumer(Product p) {
//		p.setPrice(p.getPrice() * 1.1);
//	}

	public void nonStaticConsumer() {
		this.setPrice(this.getPrice() * 1.1);
	}
	
//	public static String staticFunctionUpperCaseName(Product p) {
//		return p.getNome().toUpperCase();
//	}
	
	public String nonStaticFunctionUpperCaseName() {
		return this.getNome().toUpperCase();
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]\n";
	}	
}
