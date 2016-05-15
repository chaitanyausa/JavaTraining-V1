package com.hibernate.association.one2Many;

import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.association.one2Many.Employee;

public class ManageEmployeeList {

	private static SessionFactory factory;

	public static void main(String[] args) {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		ManageEmployeeList manageEmployeeList = new ManageEmployeeList();
		/* Employee and certifcate add 
		// Let us have a set of certificates for the first employee 
		Set<Certificate> certificateList1 = new HashSet<Certificate>();
		certificateList1.add(new Certificate("SCJP"));
		certificateList1.add(new Certificate("Hadoop"));
		certificateList1.add(new Certificate("MongoDB"));
		
		Integer empId1 = manageEmployeeList.addEmployee("Rajesh", "Reddy", 4000,certificateList1);

		 //Let us have a set of certificates for the first employee 
		Set<Certificate> certificateList2 = new HashSet<Certificate>();
		certificateList2.add(new Certificate("BSC"));
		certificateList2.add(new Certificate("MSC"));
		certificateList2.add(new Certificate("Phd"));
		
		Integer empId2 = manageEmployeeList.addEmployee("Sandeep", "Kumar", 7000,certificateList2);
		*/
		manageEmployeeList.deleteEmployee(7);
		//manageEmployeeList.listEmployees();
		//manageEmployeeList.searchByName(32);
		//manageEmployeeList.updateEmployee(32, 5000);

	   /* System.out.println("list before delete ");
		manageEmployeeList.listEmployees();
		System.out.println("*******************************");
		manageEmployeeList.deleteEmployee(32);
		System.out.println("list After delete");
		manageEmployeeList.listEmployees();*/
		

	}

	/* Method to add an employee record in the database */
	public Integer addEmployee(String fname, String lname, int salary, Set<Certificate> certificates) {

		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;

		try {
			tx = session.beginTransaction();
			Employee employee = new Employee(fname, lname, salary);
				employee.setCertificates(certificates);
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
			List<Employee> employees = session.createQuery("FROM Employee").list();

			for (Iterator<Employee> iterator1 = employees.iterator(); iterator1.hasNext();) {

				Employee employee = iterator1.next();
				System.out.print("First Name: " + employee.getFirstName());
				System.out.print(" Last Name: " + employee.getLastName());
				System.out.println(" Salary: " + employee.getSalary());

				Set<Certificate> certificates = employee.getCertificates();
				for (Iterator<Certificate> iterator2 = certificates.iterator(); iterator2.hasNext();) {
					Certificate certName = (Certificate) iterator2.next();
					System.out.println("Certificate: " + certName.getName());
				}

			}			
		} catch (HibernateException e) {
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
			Employee employee = (Employee) session.get(Employee.class, EmployeeID);
			employee.setSalary(salary);
			/*
			 * Certificate certificate = (Certificate)
			 * session.get(Certificate.class, 26); certificate.setName("OCJP");
			 * employee.getCertificates().add(certificate);
			 */

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
	/*  Method for Search*/
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
			Set<Certificate> certificates = employee.getCertificates();
			for (Iterator<Certificate> iterator2 = certificates.iterator(); iterator2.hasNext();) {
				Certificate certName = (Certificate) iterator2.next();
				System.out.println("Certificate: " + certName.getName());
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



}
