package com.spring;

import java.util.Map;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private Set<String> hobbies;
	private Map<String, String> optedSubjects;
	
	public Student() {}

	public Student(int id, String name, Set<String> hobbies, Map<String, String> optedSubjects) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
		this.optedSubjects = optedSubjects;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Map<String, String> getOptedSubjects() {
		return optedSubjects;
	}

	public void setOptedSubjects(Map<String, String> optedSubjects) {
		this.optedSubjects = optedSubjects;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hobbies=" + hobbies + ", optedSubjects=" + optedSubjects
				+ "]";
	}
	
	
	
}
