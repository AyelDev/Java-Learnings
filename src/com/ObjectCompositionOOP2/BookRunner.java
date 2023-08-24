package com.ObjectCompositionOOP2;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book(123, "Object Oriented Programming with Java", "Ranga");
		book.addReview(new Review(10, "Greet Book", 5));
		book.addReview(new Review(101, "Awesome", 5));
		
		System.out.println(book);
	}

}
