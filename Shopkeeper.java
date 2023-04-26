package com.tax;

public class Shopkeeper implements Tax {
private int shopno;
private String sname;
private double income;

//parameterized constructor
public Shopkeeper(int shopno,String sname,double income) {
	super();
	this.shopno=shopno;
	this.sname=sname;
	this.income=income;
	
}

	public void setIncome(double income) {
	this.income = income;
}

	public int getShopno() {
	return shopno;
}

public void setShopno(int shopno) {
	this.shopno = shopno;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	sname = sname;
}

public double getIncome() {
	return income;
}
public String toString() {
	return "Shopno="+shopno+" Sname="+sname+" Income="+income;
}


	@Override
	public void payTax() {
		System.out.println("Shopkeeper pay tax....");
		//double 	paytax=income*i/100;
	//System.out.println("Tax="+paytax);
		
	}

	@Override
	public double intrest(int i) {
		// TODO Auto-generated method stub
		return income*i/100;
	}

}
