package com.clone;

class Student implements Cloneable {
	// Contained object
	private Subject subj;

	private String nameNew;

	public Subject getSubj() {
		return subj;
	}

	public String getName() {
		return nameNew;
	}

	public void setName(String s) {
		nameNew = s;
	}

	public Student(String s, String sub) {
		nameNew = s;
		subj = new Subject(sub);
	}

	public Object clone() {
		// shallow copy
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
