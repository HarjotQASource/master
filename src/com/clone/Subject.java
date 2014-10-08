package com.clone;
/**
 * 
 * @author hasingh
 *
 */
public class Subject {

	private String newName;

	public String getName() {
		return newName;
	}

	public void setName(String s) {
		newName = s;
	}

	public Subject(String s) {
		newName = s;
	}
}
