package it.esercitazione8.Models;

import java.util.List;
public class User {
	private int id;
	private String userName;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String phonenumber;
	private List<Order> orders;

	public User(int id, String userName, String password, String email, String firstName, String lastName,
			String phonenumber, List<Order> orders) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phonenumber = phonenumber;
		this.orders = orders;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Userid: ");
		builder.append(getId());
		builder.append(", UserName: ");
		builder.append(getUserName());
		builder.append(", Password: ");
		builder.append(getPassword());
		builder.append(", Email: ");
		builder.append(getEmail());
		builder.append(", FirstName:");
		builder.append(getFirstName());
		builder.append(", LastName:");
		builder.append(getLastName());
		builder.append(", Phonenumber:");
		builder.append(getPhonenumber());
		builder.append(", Orders: ");
		builder.append(getOrders());
		builder.append("] \n");
		return builder.toString();
	}


}
