package com.design.factory;

public class ObjectFactory {
	
	
	public <T extends Object> T  getObject(Class clazz, String type){
		Object object=null;
		if(clazz == Employee.class){
			
			object  = new Employee(); 
		}
		return (T) object;
	}
	


}
