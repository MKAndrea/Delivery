package it.esercitazione8.Service;

import java.util.ArrayList;

import it.esercitazione8.Models.Product;

public class ProductService {
	
	
	public static void AddProduct(ArrayList<Product> products,Product product) {
		if(product!=null) {
			products.add(product);
			System.out.println(product.toString());
	    } 
	}
}
