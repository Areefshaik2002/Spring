package com.scope;

public class Address {
	private Address address;
	public Address() {}
	public Address(Address address) {
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
