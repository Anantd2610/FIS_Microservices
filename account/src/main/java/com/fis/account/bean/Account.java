package com.fis.account.bean;

public class Account {
	private long number;
	private String type;
	private double balance;
	
	public Account()
	{
		super();
	}
		public Account(long number, String type, double balance)
		{
			super();
			this.number = number;
			this.type = type;
			this.balance = balance;
		}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", type=" + type + ", balance=" + balance + "]";
	}
	

}
