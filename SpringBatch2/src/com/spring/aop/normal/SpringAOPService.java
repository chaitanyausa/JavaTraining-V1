package com.spring.aop.normal;

public class SpringAOPService {
	
	private StudentBean studentBean;
	
	public SpringAOPService(){
		
	}
	
	public SpringAOPService( StudentBean studentBean){
		this.studentBean = studentBean;
	}
	
	//public void startProcess() throws Exception{		
	public Object startProcess(){	
		System.out.println("Student details below ::");
		System.out.println("ID ::" + studentBean.getId() +"\n Name ::"+ studentBean.getName() + "\n Age ::" + 
				studentBean.getAge() + "\n DOB ::"+ studentBean.getDob());
		//throw (new Exception("This is done intentionally"));
		//this.method2();
	return "Return test msg";
	}
	
	
	public void method2(){
		System.out.println("I am method 2 from Spring AOP service class");
	}

	/**
	 * @return the studentBean
	 */
	public StudentBean getStudentBean() {
		return studentBean;
	}

	/**
	 * @param studentBean the studentBean to set
	 */
	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
	
	/**
	 * This method will be called based on config of individual bean destroy tag
	 
	public void customDestroy()  {
		System.out.println("SpringLifeCycleService bean cutom destroy method like afterPropertiesSet method");
	}
	*/
}
