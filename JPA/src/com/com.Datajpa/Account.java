package com.Datajpa;
public class Account 
{
	private int accountNumber;
	private String accountholder;
	private double balance;
	
	public Account(){}
	
	public Account(int accountNumber, String accountholder, double balance)
	{
		this.accountNumber = accountNumber;
		this.accountholder = accountholder;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountholder() {
		return owner;
	}
	public void setAccountholder(String accountholder) {
		this.accountholder = Accountholder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
