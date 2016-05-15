package com.spring.autowire;

public class Square implements Shape {
	
	private float side;
	
	
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


	@Override
	public void calArea() {
		double areaVal = (this.side)*(this.side);
		System.out.println("I am printing the Square Area ::"+areaVal);
		
	}

	
}
