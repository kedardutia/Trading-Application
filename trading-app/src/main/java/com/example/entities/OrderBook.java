package com.example.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderBook {
	
	@Id
	private String sharecode;
	
	private double openPrice;
	
	private double sharePrice;
	
	private int quantityAvailable;
	
	private List<Order> orderList;
	
	public OrderBook() {
		super();
	}

	public OrderBook(String sharecode, double openPrice, double sharePrice, int quantityAvailable,
			List<Order> orderList) {
		super();
		this.sharecode = sharecode;
		this.openPrice = openPrice;
		this.sharePrice = sharePrice;
		this.quantityAvailable = quantityAvailable;
		this.orderList = orderList;
	}

	public String getSharecode() {
		return sharecode;
	}

	public void setSharecode(String sharecode) {
		this.sharecode = sharecode;
	}

	public double getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(double openPrice) {
		this.openPrice = openPrice;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	
}
