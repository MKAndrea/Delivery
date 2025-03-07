package it.esercitazione8.Models;


public class OrderDetail {
	private Long id;
	private Order order;
	private Product product;
	private Integer qnty;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getQnty() {
		return qnty;
	}
	public void setQnty(Integer qnty) {
		this.qnty = qnty;
	}


}
