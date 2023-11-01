package lambda.util;

import java.util.function.Function;

import lambda.entities.Product;

public class MyFunction implements Function<Product, String>{

	@Override
	public String apply(Product p) {	
		return p.getNome().toUpperCase();
	}

}
