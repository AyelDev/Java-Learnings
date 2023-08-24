package com.OOPlvl2Inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//student is a subclass
		//person is a superclass
		
//		Student student = new Student();
//		student.setName("Ariel");
//		student.setEmail("aarielabelgas123@gmail.com");
		
		Person person = new Person();
		person.setName("Cindy");
		person.setEmail("Cindy@gmail.com");
		person.setPhoneNumber("09666074");
		
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
	}

}
