package com.learning.event;

import java.time.LocalDateTime;

public class PaymentCompletedEvent {
	
	private Long orderId;
	private String paymentStatus;
	private LocalDateTime processedAt;
	private String userEmail;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public LocalDateTime getProcessedAt() {
		return processedAt;
	}
	public void setProcessedAt(LocalDateTime processedAt) {
		this.processedAt = processedAt;
	}
	public PaymentCompletedEvent(Long orderId, String paymentStatus, LocalDateTime processedAt, String userEmail) {
		super();
		this.orderId = orderId;
		this.paymentStatus = paymentStatus;
		this.processedAt = processedAt;
		this.userEmail=userEmail;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public PaymentCompletedEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
