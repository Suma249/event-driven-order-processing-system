package com.learning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	
	private Long productId;
	private int quantity;
	private Double price;
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
	public Order(Long id, Long productId, int quantity, Double price, OrderStatus status) {
		super();
		this.id = id;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Order() {
	}

	
}
