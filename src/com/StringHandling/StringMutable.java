package com.StringHandling;

public class StringMutable {

	public static void main(String[] args) {
		// Using StringBuffer and StringBuilder

		StringBuffer stringBuff = new StringBuffer("Cindy");
		stringBuff.append(" is girl");
		System.out.println(stringBuff);
		
		//Same ra siya sa String Buider pero ang differences niya kay
//		Synchronization:
//			StringBuffer: It is synchronized, which means it is thread-safe. This means that 
//			multiple threads can safely access and modify a StringBuffer object without causing
//			data inconsistency or corruption. The methods in StringBuffer are synchronized, 
//			which adds a performance overhead.
//			
//			StringBuilder: It is not synchronized, making it not thread-safe. Because it lacks 
//			synchronization, it is faster than StringBuffer. However, if multiple threads need to 
//			access a StringBuilder object simultaneously, proper external synchronization must 
//			be implemented to ensure data integrity.
		
	}

}
