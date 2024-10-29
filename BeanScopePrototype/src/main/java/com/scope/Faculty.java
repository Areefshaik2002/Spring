package com.scope;

public class Faculty {
	private Address address;
	public Faculty() {}
	public Faculty(Address address) {
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
