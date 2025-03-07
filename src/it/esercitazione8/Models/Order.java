package it.esercitazione8.Models;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
	private Long id;
	private User user;
	private LocalDateTime created_at;
	private Boolean paid;
	private LocalDateTime payment_at;
	private String payment_code;
	private Boolean closed;
	private List<OrderDetail> orderDetails;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	public Boolean getPaid() {
		return paid;
	}
	public void setPaid(Boolean paid) {
		this.paid = paid;
	}
	public LocalDateTime getPayment_at() {
		return payment_at;
	}
	public void setPayment_at(LocalDateTime payment_at) {
		this.payment_at = payment_at;
	}
	public String getPayment_code() {
		return payment_code;
	}
	public void setPayment_code(String payment_code) {
		this.payment_code = payment_code;
	}
	public Boolean getClosed() {
		return closed;
	}
	public void setClosed(Boolean closed) {
		this.closed = closed;
	}


}
