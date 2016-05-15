package com.spring.jsr250annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

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
	
	@Resource(name="circle")	
	public void setShape(Shape shape) {
		this.shape = shape;
	}


	/**
	 * @return the shape
	 */
	public Shape getShape() {
		return shape;
	}
	
	@PostConstruct
	public void postConstrMthd(){
		System.out.println("I am in post consrtuctor method, the inject class is ::"+this.shape);
	}
	
	@PreDestroy
	public void preDestrMethod(){
		System.out.println("I am in pre destroy method so after this no obejct will be available");
	}

}
