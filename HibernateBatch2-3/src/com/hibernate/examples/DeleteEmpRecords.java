package com.hibernate.examples;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.hibernate.association.One2One.Address;
import com.hibernate.association.One2One.Employee;

public class DeleteEmpRecords {
	private static SessionFactory factory;

	public static void main(String[] args){
          try {
			
			Configuration configuration = new Configuration();
			factory = configuration.configure().buildSessionFactory();
	      } catch (Throwable ex) {
				System.err.println("Failed to create sessionFactory object." + ex);			
			}
          DeleteEmpRecords empRecords = new DeleteEmpRecords();
          empRecords.deleteEmployee(16);
	}
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

		public void deleteAddress(Integer AddressID) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Address address = (Address) session.get(Address.class, AddressID);
			session.delete(address);
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
