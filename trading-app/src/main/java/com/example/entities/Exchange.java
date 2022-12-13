package com.example.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Exchange {
	
	@Id
	private int exchangeId;
	
	private double feeLadder;
	
	private String sharecode;
	
	private int sellerOrderId;
	
	private int buyerOrderId;
	
	private double exchangePrice;
	
	private int exchangeQuantity;
	
	private LocalDateTime exchangeDate;
	
	private double currentDaysTotalTradedValue;
	
	public Exchange() {
		super();
	}

	public Exchange(int exchangeId, double feeLadder, String sharecode, int sellerOrderId, int buyerOrderId,
			double exchangePrice, int exchangeQuantity, LocalDateTime exchangeDate,
			double currentDaysTotalTradedValue) {
		super();
		this.exchangeId = exchangeId;
		this.feeLadder = feeLadder;
		this.sharecode = sharecode;
		this.sellerOrderId = sellerOrderId;
		this.buyerOrderId = buyerOrderId;
		this.exchangePrice = exchangePrice;
		this.exchangeQuantity = exchangeQuantity;
		this.exchangeDate = exchangeDate;
		this.currentDaysTotalTradedValue = currentDaysTotalTradedValue;
	}

	public int getExchangeId() {
		return exchangeId;
	}

	public void setExchangeId(int exchangeId) {
		this.exchangeId = exchangeId;
	}

	public double getFeeLadder() {
		return feeLadder;
	}

	public void setFeeLadder(double feeLadder) {
		this.feeLadder = feeLadder;
	}

	public String getSharecode() {
		return sharecode;
	}

	public void setSharecode(String sharecode) {
		this.sharecode = sharecode;
	}

	public int getSellerOrderId() {
		return sellerOrderId;
	}

	public void setSellerOrderId(int sellerOrderId) {
		this.sellerOrderId = sellerOrderId;
	}

	public int getBuyerOrderId() {
		return buyerOrderId;
	}

	public void setBuyerOrderId(int buyerOrderId) {
		this.buyerOrderId = buyerOrderId;
	}

	public double getExchangePrice() {
		return exchangePrice;
	}

	public void setExchangePrice(double exchangePrice) {
		this.exchangePrice = exchangePrice;
	}

	public int getExchangeQuantity() {
		return exchangeQuantity;
	}

	public void setExchangeQuantity(int exchangeQuantity) {
		this.exchangeQuantity = exchangeQuantity;
	}

	public LocalDateTime getExchangeDate() {
		return exchangeDate;
	}

	public void setExchangeDate(LocalDateTime exchangeDate) {
		this.exchangeDate = exchangeDate;
	}

	public double getCurrentDaysTotalTradedValue() {
		return currentDaysTotalTradedValue;
	}

	public void setCurrentDaysTotalTradedValue(double currentDaysTotalTradedValue) {
		this.currentDaysTotalTradedValue = currentDaysTotalTradedValue;
	}
	

}
