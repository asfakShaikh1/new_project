package com.soft.test;

import com.soft.entities.Account;
import com.soft.entities.Employee;
public class Test {
  public static void main(String [] args) {
	  Account acc= new Account();
	  acc.setAccNo("abc123");
	  acc.setAccHoldeName("soft");
	  acc.setAccType("Saving");
	  acc.setBalance(5000000);
	  
	  Employee emp = new Employee();
	  emp.setEno(111);
	  emp.setEname("dugra");
	  emp.setEsal(30000);
	  emp.setEaddr("ben");
	  emp.setAcc(acc);   
	  emp.getEmpDetails();
  }
}
