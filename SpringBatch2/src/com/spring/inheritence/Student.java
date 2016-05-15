package com.spring.inheritence;

public class Student {
	
	private int sno;
	
	private String name;
	
	private int age;
	
	private String schoolName;
	
	private String area;

	
	public void testInitMethod(){
		System.out.println("I have been called, I am from Student class, purpose init method");
	}
	
	public void testDestroyMethod(){
		System.out.println("I have been called, I am from Student class, purpose destroy method");
	}
	
	
	public String toString(){
		
		return "SNO ::"+sno+"; Name::"+name+"; Age::"+age+"\n"+"School Name::"+schoolName+"; Area::"+area;
	}
	
	public Student(){
		
	}	

	public Student(int sno, String name, int age) {		
		this.sno = sno;
		this.name = name;
		this.age = age;
		
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
	 * @return the schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}

	/**
	 * @param schoolName the schoolName to set
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	
	

}
