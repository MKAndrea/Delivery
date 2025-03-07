package it.esercitazione8.Models;

public class Product {
	private int id;
	private String pname;
	private String description;
	private double price;
	

	public Product(int id, String pname, String description, double price) {
		super();
		this.id = id;
		this.pname = pname;
		this.description = description;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[Product id:");
		builder.append(getId());
		builder.append(", Pname: ");
		builder.append(getPname());
		builder.append(", Description: ");
		builder.append(getDescription());
		builder.append(", Price: ");
		builder.append(getPrice());
		builder.append("]");
		return builder.toString();
	}
	
	
}
