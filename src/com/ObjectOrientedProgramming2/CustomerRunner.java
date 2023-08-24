package com.ObjectOrientedProgramming2;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object composition
		Address homeAddress = new Address("line 1" , "Hydrabad", "6000");
		Customer customer = new Customer("Ariel", homeAddress);
		
		Address workAddress = new Address("line 1 for work", "Jakosalem", "6000");
		customer.setWorkaddress(workAddress);
		
		System.out.println(customer);

	}

}
