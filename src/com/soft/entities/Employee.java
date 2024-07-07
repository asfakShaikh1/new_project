package com.soft.entities;

public class Employee {

	
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	private Account acc;
	
//	public Employee(int eno,String ename,float esal,String eaddr,Account acc) {
//		this.eno = eno;
//		this.ename = ename ;
//		this.esal = esal;
//		this.eaddr = eaddr;
//		this.acc = acc;
//	}
	
	public void getEmpDetails() {
		System.out.println("Employee Details");
		System.out.println("-------------------");
		System.out.println("Employee Number   :"+eno);
		System.out.println("Employee Name     :"+ename);
		System.out.println("Employee Salary   :"+esal);
		System.out.println("Employee Address  :"+eaddr);
	     System.out.println();
	     System.out.println("Account  Details");
	    System.out.println("-------------------");
	    System.out.println("Account Number       :"+acc.getAccNo());
	    System.out.println("Account Holder  Name :"+acc.getAccHoldeName());
	    System.out.println("Account Type         :"+acc.getAccType());
	    System.out.println("Account  Balance     :"+acc.getBalance());
	    
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

	public String getEaddr() {
		return eaddr;
	}

	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
}
