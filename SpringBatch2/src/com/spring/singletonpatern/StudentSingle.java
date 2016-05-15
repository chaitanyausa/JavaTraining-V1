package com.spring.singletonpatern;

public class StudentSingle implements Cloneable {

	private static StudentSingle studentSingle = null;

	private StudentSingle() {

	}

	public Object clone() throws CloneNotSupportedException {
		return null;

	}

	public static StudentSingle getBean() {

		if (studentSingle == null) {
			studentSingle = new StudentSingle();
		}

		return studentSingle;
	}
}
