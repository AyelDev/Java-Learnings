package com.ReferenceTypes;
import java.util.Scanner;
public class ReferenceTypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 5;
		int b = sc.nextInt();
		Animal c;
		Animal dog = new Animal(12);
		Animal cat = new Animal(b);
		c = dog;
		
		
		//System.out.println(a == b);
		System.out.println(dog);
		System.out.println(cat.getId());
		System.out.println(c == dog);
		
		sc.close();
	}

}
