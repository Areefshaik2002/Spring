package com.scope;

public class Worker {
	private Address address;
	public Worker() {}
	public Worker(Address address) {
		super();
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
