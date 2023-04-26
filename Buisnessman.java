package com.tax;

public class Buisnessman implements Tax {
	private int bid;
	private String bname;
	private double income;
	
	
	//parameterised constr
	
	public Buisnessman(int bid,String bname,double income) {
		this.bid=bid;
		this.bname=bname;
		this.income=income;
		
		
		
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getBid() {
		return bid;
	}

	public double getIncome() {
		return income;
	}
	public String toString() {
		return "buisnessid="+bid+" bname=Bname"+" Income="+income;
	}

	@Override
	public void payTax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double intrest(int i) {
		// TODO Auto-generated method stub
		return income*i/100;
	}

}
