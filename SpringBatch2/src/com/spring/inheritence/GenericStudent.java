package com.spring.inheritence;

public abstract class GenericStudent {
	
	public String schoolName;
	
	public String area;
	
	public GenericStudent(){
		
	}

	/**
	 * @return the scholName
	 */
	public String getSchoolName() {
		return schoolName;
	}

	/**
	 * @param scholName the scholName to set
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
