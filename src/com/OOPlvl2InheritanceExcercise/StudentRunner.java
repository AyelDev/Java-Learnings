package com.OOPlvl2InheritanceExcercise;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//student is a subclass
		//person is a superclass
		
		Employee employee = new Employee("Ariel", "Programmer Analyst");
		//employee.setName("Ariel");
		employee.setEmail("aarielabelgas23@gmail.com");
		employee.setPhoneNumber("09666170733");
		employee.setEmployeeGrade('A');
		//employee.setTitle("Programmer Analyst");
		employee.setEmployerName("Cindy");
		
		
		System.out.println(employee);
	}

}
