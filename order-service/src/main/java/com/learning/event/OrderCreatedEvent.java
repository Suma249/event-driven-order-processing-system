package com.learning.event;

import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class OrderCreatedEvent {

	private Long orderId;
	private Long productId;
	private Integer quantity;
	private Double price;
	private String userEmail;
	private Double accountBalance;
	private LocalDateTime createdAt;
	
	public OrderCreatedEvent(Long orderId, Long productId, Integer quantity, Double price, String userEmail, Double accountBalance,LocalDateTime createdAt) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
		this.userEmail=userEmail;
		this.accountBalance=accountBalance;
		this.createdAt = createdAt;
	}

	
	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public Double getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}


	public OrderCreatedEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
}
