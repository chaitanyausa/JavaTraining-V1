package com.spring.autowire;

public class ShapeTest {
	
	private Shape shape;
	
	private Circle circle;
	
	private Square square;
	
	public ShapeTest(Circle circle,Square square ) {
		this.circle = circle;
		this.square = square;
	}
	
	
	public void claShapeArea(){
		circle.calArea();
		square.calArea();
		/*
		circle = new Circle();
			circle.setSide(10);
		
		circle.calArea();
		//square.calArea();
		 * */
		//shape.calArea();
	}



	/**
	 * @return the shape
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * @param shape the shape to set
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	 */
	

	/**
	 * @return the square
	
	public Square getSquare() {
		return square;
	}
 */


	/**
	 * @param square the square to set
	
	public void setSquare(Square square) {
		this.square = square;
	}

 */

	/**
	 * @return the circle
	
	public Circle getCircle() {
		return circle;
	}
 */
	/**
	 * @param circle the circle to set
	
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	 */
	
	

}
