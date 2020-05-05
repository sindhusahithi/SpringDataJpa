package com.Jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Accountnumber;
	private String Accountholder;
	private double Balence;
	
	protected Account() {
		
	}
	
	public int getAccountnumber() {
		return Accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		Accountnumber = accountnumber;
	}

	public String getAccountholder() {
		return Accountholder;
	}

	public void setAccountholder(String accountholder) {
		Accountholder = accountholder;
	}

	public double getBalence() {
		return Balence;
	}

	public void setBalence(double balence) {
		Balence = balence;
	}

	@Override
	public String toString() {
		return "Account [Accountnumber=" +Accountnumber +", Accountholder=" + Accountholder + "]";
	}
	

}
