package com.coderscampus.objects;

import java.util.Random; 

public class RunnableClass {

	public static void main(String[] args) {
		
//		
//		Random random = new Random();
//		
//		for (int i= 0; i<20; i = i + 1) {
//			System.out.println("Random number is " + random.nextInt(10));
//		}
	
		Human caseyMichael = new Human ("Starburst", "Male", "5'9\"", "240");
		
//		caseyMichael.setProperties("Starburst", null, null, null);
//		caseyMichael.eyeColor = "Starburst";
//		caseyMichael.gender = "Male";
//		caseyMichael.height = "5'9\"";
//		caseyMichael.weight = "240";
		
		System.out.println(caseyMichael.getInfo());
		
		Human clintDietz = new Human ("Clear", "They", "Small and shockingly powerful", "400");
//		
//		clintDietz.setProperties(null, null, null, nu ll);
//		clintDietz.eyeColor = "Clear";
//		clintDietz.gender = "They";
//		clintDietz.height = "Small and shockingly powerful";
//		clintDietz.weight = "400";
		
		System.out.println(clintDietz.getInfo());	
		   
		Human megTap = new Human ("Hot Brown", "HER", "SMOL", "6");
		
		
//		megTap.setProperties(null, null, null, null);
//		megTap.eyeColor = "hot brown";
//		megTap.gender = "HER";
//		megTap.height = "SMOL";
//		megTap.weight = "6";
		
		System.out.println(megTap.getInfo());
		
		Human christianChicken = new Human ("Horse Shoe", "Blood shot", "Fuck it,I would. My dad taught me that", "I weight anything from 125 to 225");
		
		
//		christianChicken.gender = "Horse Shoe";
//		christianChicken.eyeColor ="Blood Shot";
//		christianChicken.height = "Fuck it, I would";
//		christianChicken.weight = "I weigh anything from 120 to 225";
		
		System.out.println(christianChicken.getInfo());
		
		Human itsNathan = new Human ("Laughable", "Cold as Ice", "4.5 inches...oh...wait...", "I'm 27"); 
		
//		itsNathan.gender = "laughable";
//		itsNathan.eyeColor = "Cold as Ice";
//		itsNathan.height = "4,5 inches...oh, wait...";
//		itsNathan.weight = "I'm 27";
		
		System.out.println(itsNathan.getInfo());
		
		
	}

}
