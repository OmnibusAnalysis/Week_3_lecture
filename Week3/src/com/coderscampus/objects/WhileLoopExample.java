package com.coderscampus.objects;

import java.util.Date;

public class WhileLoopExample {
	void whileLoopExample1 () {
		System.out.println("Sandwich shop");
// this is exactly how a for loop. You don't neeed one=
		int i = 0;
		while (i < 10 ) {
			System.out.println("i");	{
				i =i + 1; 
			}
			System.out.println("Done"); 
			
		}
		}
	
	//for loop is a special type of while loop
	// you can create an entire appllication using while loops and no for loops 
		
		
	 void whileLoopExample () {
		 
		 Date now = new Date();
		 Date stopNow = new Date(123, 11, 1, 15, 01, 01);
		 int i = 0;
		 	while (now.before(stopNow)) {
		 		i = i + 1; 
		 		System.out.println(i + ": " + now);
		 	}	now = new Date();
		 
		 System.out.println(now);
		 System.out.println(stopNow);
		 
		
	}
}
