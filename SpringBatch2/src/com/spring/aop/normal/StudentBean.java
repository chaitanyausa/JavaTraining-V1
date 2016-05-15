package com.spring.aop.normal;

import java.util.Date;


public class StudentBean {
	
	private int id;
	
	private String name;
	
	private String age;
	
	private Date dob;
	
	public StudentBean(){
		System.out.println("Student bean constructor called");
	}
	
	public StudentBean(int id, String name, String age, Date dob){
		
		this.id = id;		
		this.name= name;
		this.age = age;
		this.dob = dob;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
}
