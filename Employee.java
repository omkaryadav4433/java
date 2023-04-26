package com.tax;

public class Employee implements Tax {
	private int empid;
	private String ename;
	private double income;
private static int count;
static {
	count=100;
}
	public Employee(String n,double i) {
	
		this.empid=count++;
		this.ename=n;
		this.income=i;
	
		
		
		
		
	}
	
	
	

	public String getEname() {
		return ename;
	}




	public void setEname(String ename) {
		this.ename = ename;
	}




	public int getEmpid() {
		return empid;
	}




	public double getIncome() {
		return income;
	}




	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", income=" + income + "]";
	}




	@Override
	public void payTax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double intrest(int i) {
		// TODO Auto-generated method stub
		return  income*i/100;
		
	}

}
