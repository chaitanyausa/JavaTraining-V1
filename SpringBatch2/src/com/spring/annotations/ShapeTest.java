package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class ShapeTest {
	
	@Autowired(required=true)
	@Qualifier("square")
	private Shape shape;
	
	public ShapeTest(){
		
	}
	
	public ShapeTest(Shape shape) {
		
		//this.shape = shape;
	}
	
	
	public void claShapeArea(){
		shape.calArea();
	}



	/**
	 * @param shape the shape to set
	 */
	//@Required
	public void setShape(Shape shape) {
		this.shape = shape;
	}


	/**
	 * @return the shape
	 */
	public Shape getShape() {
		return shape;
	}

}
