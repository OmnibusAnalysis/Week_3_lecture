package com.coderscampus.objects;

public class ForLoopExample {

	void forLoopExample () {
		
//three sections seperated by semi colins 
		//initialize; termination condition; increment
		for 
			(int i = 10; i <= 100; i = i + 1) {
				//most loops will start at zero, goes to some 
				//number and incriments by one. 
	
			System.out.println(i +": ");
			System.out.println(i*i);
		}
	
		System.out.println("Done");
				
	}
	
	void incrementExample1 () {
		System.out.println("Incrementinng Example");
		//j++ is tje same as j = j + 1
		for (int i=0; i<10; i++); {
		System.out.println();
	}  
		System.out.println("Decrementing Example");
		for (int i = 1; i >=0; i = i--) {
			
		}
}
	
	void incrementExample2 (int j) {
		System.out.println("Insifde increment example " + j);
		
	}
}
