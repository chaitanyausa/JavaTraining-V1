package com.spring.inject.datatypes;

import java.util.List;

public class Student {
	
	private int sno;
	
	private String name;
	
	private int age;
	
	private Address address;
	
	private List<Address> addList;
	
	private List<String> subjects;
	
	
	public void testInitMethod(){
		System.out.println("I have been called, I am from Student class, purpose init method");
	}
	
	public void testDestroyMethod(){
		System.out.println("I have been called, I am from Student class, purpose destroy method");
	}
	
	
	public String toString(){
		
		return "SNO ::"+sno+"; Name::"+name+"; Age::"+age+"\n"+address.toString()+"\n Subjects ::"+subjects+"\n Address List::"+addList;
	}
	
	public Student(){
		
	}	

	public Student(int sno, String name, int age, Address address,List<String> subjects) {	
		this.sno = sno;
		this.name = name;
		this.age = age;
		this.address = address;
		this.subjects = subjects;
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

	/**
	 * @return the subjects
	 */
	public List<String> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	/**
	 * @return the addList
	 */
	public List<Address> getAddList() {
		return addList;
	}

	/**
	 * @param addList the addList to set
	 */
	public void setAddList(List<Address> addList) {
		this.addList = addList;
	}
	
	

}
