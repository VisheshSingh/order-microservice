package com.vishesh.mcs.orderms.domain;

import java.util.Date;

public class Order {
	private int id;
	private int price;
	private Date dateOrder;
	private Customer customer;
	private Car car;

	public Order() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", price=" + price + ", dateOrder=" + dateOrder + ", customer=" + customer + ", car="
				+ car + "]";
	}

}
