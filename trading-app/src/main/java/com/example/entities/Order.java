package com.example.entities;

import java.time.LocalDateTime;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Order {
	
	int orderId;

	@ManyToOne
	@JoinColumn(name="username")
	private User username;

	String buyOrSell;
	
	@ManyToOne
	@JoinColumn(name="sharecode")
	private OrderBook sharecode;
	
	int orderQuantity;
	
	double minPrice;
	
	double maxPrice;
	
	String status;
	
	LocalDateTime orderDate;

	public Order(int orderId, User username, String buyOrSell, OrderBook sharecode, int orderQuantity, double minPrice,
			double maxPrice, String status, LocalDateTime orderDate) {
		super();
		this.orderId = orderId;
		this.username = username;
		this.buyOrSell = buyOrSell;
		this.sharecode = sharecode;
		this.orderQuantity = orderQuantity;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.status = status;
		this.orderDate = orderDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public User getUsername() {
		return username;
	}

	public void setUsername(User username) {
		this.username = username;
	}

	public String getBuyOrSell() {
		return buyOrSell;
	}

	public void setBuyOrSell(String buyOrSell) {
		this.buyOrSell = buyOrSell;
	}

	public OrderBook getSharecode() {
		return sharecode;
	}

	public void setSharecode(OrderBook sharecode) {
		this.sharecode = sharecode;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}

	public double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	
	
}
