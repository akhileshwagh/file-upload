package example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {

	private String name;
	private String category;

	

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Product(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}

}

public class GropingProductExample {
	public static void main(String[] args) {

		List<Product> products = Arrays.asList(

				new Product("television", "electronic"), 
				new Product("shirt", "clothing"),
				new Product("refrigerator", "electronic"),
				new Product("jeans", "clothing")

		);
		
		Stream<Product> stream = products.stream();
		
		Map<String,List<Product>> map = stream.collect(Collectors.groupingBy(p->p.getCategory()));
		
		
		//method reference
		//Map<String,List<Product>> map = stream.collect(Collectors.groupingBy(Product::getCategory));

		System.out.println(map);
	}

}
