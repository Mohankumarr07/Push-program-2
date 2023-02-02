package org.emp;

public class Employee {

	private void empId() {
		System.out.println("empId=001");
	}
	private void empName() {
		System.out.println("empName=Mohan");
	}
	private void empDob() {
		System.out.println("empDob=12.06.1990");
	}
	private void empPhone() {
		System.out.println("empPhone=9600430921");
	}
	private void empEmail() {
		System.out.println("empEmail=Mohankumarr07@gmail.com");
	}
	private void empAddress() {
		System.out.println("empAddress=4/20 salem");
	}
	private void empAddress1() {
		System.out.println("empAddress=1/128 mullukurichi");	
	}
	public static void main(String args[]) {
		
		Employee E=new Employee();
		
		E.empId ();
		E.empName();
		E.empDob();
		E.empPhone();
		E.empEmail();
		E.empAddress();
		E.empAddress1();
		
		
		
	}
	
	
	
	
	
}
