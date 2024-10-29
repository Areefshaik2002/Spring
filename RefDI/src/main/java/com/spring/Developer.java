package com.spring;

public class Developer {
	private Desktop desktop; 
	
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	
	public Developer(Desktop desktop) {
		super();
		this.desktop = desktop;
	}
	
	public Desktop getDesktop() {
		return desktop;
	}

	public void setDesktop(Desktop desktop) {
		this.desktop = desktop;
	}

	public void startCoding() {
		desktop.Code();
	}

//	@Override
//	public String toString() {
//		return "Developer [laptop=" + laptop + "]";
//	}
	
}
