package com.spring.collection.sample;

import java.util.List;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private List<Address> address;
	private Set<Account> account;

	/**
	 * @return the account
	 */
	public Employee() {
		System.out.println("empty const");
	}

	
	public Employee(int id, String name, List<Address> address, Set<Account> account) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.account = account;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Set<Account> getAccount() {
		return account;
	}

	public void setAccount(Set<Account> account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", account=" + account + "]";
	}

}