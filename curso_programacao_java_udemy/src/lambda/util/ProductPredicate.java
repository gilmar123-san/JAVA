package lambda.util;

import java.util.function.Predicate;

import lambda.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		 return p.getPrice() >= 100;
	}
}
