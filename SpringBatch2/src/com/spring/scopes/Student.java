package com.spring.scopes;

public class Student {
	
	private int sno;
	
	private String name;
	
	private int age;
	
	private Address address;
	
	public String toString(){
		
		return "SNO ::"+sno+"; Name::"+name+"; Age::"+age+"\n"+address.toString();
	}
	
	public Student(){
		
	}	

	public Student(int sno, String name, int age, Address address) {		
		this.sno = sno;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	




	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the sno
	 */
	public int getSno() {
		return sno;
	}

	/**
	 * @param sno the sno to set
	 */
	public void setSno(int sno) {
		this.sno = sno;
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
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
