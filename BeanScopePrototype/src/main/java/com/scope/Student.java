package com.scope;

public class Student {
	private Address address;
	public Student() {}
	public Student(Address address) {
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
