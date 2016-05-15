package com.spring.inject.datatypes;

public class Address {

	private String drno;
	
	private String streetName;
	
	private String cityName;
	
	private String state;
	
	private String country;
	
	public String toString(){
		return "Dr No::"+drno+"; StreetName ::"+streetName+"; City Name::"+cityName+"; State::"+state+"; Country::"+country;
	}
	
	public Address(){
		
	}

	public Address(String drno, String streetName, String cityName,String state, String country) {
		
		this.drno = drno;
		this.streetName = streetName;
		this.cityName = cityName;
		this.state = state;
		this.country = country;
	}



	/**
	 * @return the drno
	 */
	public String getDrno() {
		return drno;
	}

	/**
	 * @param drno the drno to set
	 */
	public void setDrno(String drno) {
		this.drno = drno;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
