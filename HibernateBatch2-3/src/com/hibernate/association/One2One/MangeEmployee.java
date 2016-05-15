package com.hibernate.association.One2One;

import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.association.One2One.Employee;

public class MangeEmployee {
	private static SessionFactory factory;

	public static void main(String[] args) {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		MangeEmployee mangeEmployee = new MangeEmployee();
		 mangeEmployee.listEmployees();
		
		/* Address address1 = new Address("1234-56-78", "Miyapur", "Hyderabad");
		 int addId1 = mangeEmployee.addAddress(address1);
		  address1.setAddId(addId1);
		  
		  Employee employee1 = new Employee("ManiChanged", "Deepchanged", 8000,address1);
		  int empId1 = mangeEmployee.addEmployee(employee1);
		  System.out.println("This employee with ID " + empId1 + " inserted");*/
		  
		  /*Address address2 = new Address("56-76-987", "JNTU", "Hyderabad"); int
		 addId2 = mangeEmployee.addAddress(address2);
		  address2.setAddId(addId2);
		  
		  Employee employee2 = new Employee("Srinuchanged", "Reddychanged",
		  70000, address2); int empId2 = mangeEmployee.addEmployee(employee2);
		  System.out.println("\nThis employee with ID " + empId2 + " inserted");*/
		 
		 
		/*
		 * // Update starts System.out.println("Before update ");
		 * mangeEmployee.listEmployees();
		 * 
		 * Address address = new Address("apt 152", "NAD", "Vizag");
		 * 
		 * Employee employee = new Employee(7,"Raghu", "Kumar", 100000,
		 * address);
		 * 
		 * mangeEmployee.updateEmployee(employee);
		 * System.out.println("********************** After update ****************** ");
		 * mangeEmployee.listEmployees();
		 */

		/* delete */
		/*
		 * System.out.println("Before delete"); mangeEmployee.listEmployees();
		 * mangeEmployee.deleteEmployee(14); System.out.println("After delete");
		 * mangeEmployee.listEmployees();
		 */
		/* search method */
		// mangeEmployee.searchByName(15);
		//mangeEmployee.deleteEmployee(33);

	}
	public int addAddress(Address address) {

		Session session = factory.openSession();
		Transaction tx = null;
		Integer addId = null;
		try {
			tx = session.beginTransaction();

			addId = (Integer) session.save(address);

			tx.commit();

		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return addId;
	}
	/* Method to add an employee record in the database */

	public Integer addEmployee(Employee employee) {

		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;
		try {
			tx = session.beginTransaction();

			employeeID = (Integer) session.save(employee);

			tx.commit();

		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return employeeID;
	}

	/* Method to list all the employees detail */
	public void listEmployees() {

		Session session = factory.openSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			List employees = session.createQuery("FROM Employee").list();

			for (Iterator iterator1 = employees.iterator(); iterator1.hasNext();) {
				Employee employee = (Employee) iterator1.next();
				System.out.print("First Name: " + employee.getFirstName());
				System.out.print(" Last Name: " + employee.getLastName());
				System.out.println(" Salary: " + employee.getSalary());
				Address address = employee.getAddress();
				if(address!=null){
					System.out.print("Dr No : " + address.getDrNo());
					System.out.print(" Street No: " + address.getStreet());
					System.out.println(" City: " + address.getCity());
				}
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to update salary for an employee */
	public void updateEmployee(Integer EmployeeID, int salary) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			tx = session.beginTransaction();
			Employee employee = (Employee) session.get(Employee.class, EmployeeID);
			employee.setSalary(salary);
			session.update(employee);

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void updateEmployee(Employee emp) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			Employee employee = (Employee) session.get(Employee.class, emp.getId());

			employee.setFirstName(emp.getFirstName());
			employee.setLastName(emp.getLastName());
			employee.setSalary(emp.getSalary());
			// the below address object is from Database for the given id from
			// where the method called.
			Address srcAddress = employee.getAddress();

			// This address object is containing the values which we have to
			// change for the respective employee
			Address trgAddress = emp.getAddress();
			srcAddress.setDrNo(trgAddress.getDrNo());
			srcAddress.setStreet(trgAddress.getStreet());
			srcAddress.setCity(trgAddress.getCity());

			// So now we have modified the address object with required values,
			// so now keeping this object in employee object
			// so that it will get updated along with employee table.
			employee.setAddress(srcAddress);

			session.update(employee);

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void searchByName(Integer EmployeeID) {
		System.out.println("Search method");
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Employee employee = (Employee) session.get(Employee.class, EmployeeID);
			System.out.print("First Name: " + employee.getFirstName());
			System.out.print(" Last Name: " + employee.getLastName());
			System.out.println(" Salary: " + employee.getSalary());
			Address address = employee.getAddress();
			System.out.print("Dr No : " + address.getDrNo());
			System.out.print(" Street No: " + address.getStreet());
			System.out.println(" City: " + address.getCity());
			tx.commit();

		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	/* Method to delete an employee from the records */
	public void deleteEmployee(Integer EmployeeID) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Employee employee = (Employee) session.get(Employee.class, EmployeeID);
			session.delete(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
