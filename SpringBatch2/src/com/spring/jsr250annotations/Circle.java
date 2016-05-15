package com.spring.jsr250annotations;

public class Circle implements Shape {

	
	private float side;
	
	
	@Override
	public void calArea() {
		double areaVal = 3.14*(this.side)*(this.side);
		System.out.println("I am printing the Circle Area ::"+areaVal);
		
	}
	
	/**
	 * @return the side
	 */
	public float getSide() {
		return side;
	}


	/**
	 * @param side the side to set
	 */
	public void setSide(float side) {
		this.side = side;
	}
	
	

}
