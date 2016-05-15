package com.spring.collection.sample;

public class Account {
	private int accountNO;
	private String type;
	private String location;

	public Account() {
	}

	public Account(int accountNO, String type, String location) {
		this.accountNO = accountNO;
		this.type = type;
		this.location = location;
	}

	public int getAccountNO() {
		return accountNO;
	}

	public void setAccountNO(int accountNO) {
		this.accountNO = accountNO;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Account [accountNO=" + accountNO + ", type=" + type + ", location=" + location + "]";
	}
	

}
