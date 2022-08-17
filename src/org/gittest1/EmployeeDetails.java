package org.gittest1;

public class EmployeeDetails {
	
	private void empName() {
		System.out.println("Anand");
	}
	
	private void empMobile() {
		System.out.println("8939278836");
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails e = new EmployeeDetails();
		e.empMobile();
		e.empName();
	}

}
