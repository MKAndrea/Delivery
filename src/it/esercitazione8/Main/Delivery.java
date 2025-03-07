package it.esercitazione8.Main;

import java.util.ArrayList;

import it.esercitazione8.Models.*;
import it.esercitazione8.Service.*;

public class Delivery {

	public static void main(String[] args) {
		ArrayList<Product> products=new ArrayList<Product>();
		ProductService.AddProduct(products,new Product( 1,"Nome Prodotto","DescrizioneProdotto",2.50));
		ArrayList<User> users=new ArrayList<User>();
		ArrayList<Order> orders=new ArrayList<Order>();
		UserService.RegisterUser(users,new User(1,"NomeUtente","Password","Email","firstName","Lastname","phoneNumber",orders));
		

	}

}
