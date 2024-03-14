package com.coderscampus.objects;

public class Human {
	String gender; 
	String height;
	String eyeColor; 
	String weight; 
	
//constructors: a special method that gets called when an object is first created.
	// There is no return type with a constructor. the point is to be executed when the object is created
		//not to return anything 
	
	Human () {
		System.out.println("A human is being created");
	}
	
	Human (String gender, String height, String weight, String eyeColor) {
		
		this.gender = gender; 
		this.eyeColor = eyeColor; 
		this.height = height;
		this.weight = weight;  
		
	}
	
	// visibility modifier, return type, method name, paramaters 
	String getInfo () {		
		return "Gender: " + gender + "Height: " + height + 
				"Eye Color: " +  eyeColor + "Weight: " + weight; 

	}
	
//	void setProperties (String gender, String height, 
//			String weight, String eyeColor) {
//		this.gender = gender; 
//		this.eyeColor = eyeColor; 
//		this.height = height;
//		this.weight = weight;                         
		// when using "this" think about the objectrather than the class
		// human can't be used as human is a class or a bluepriht for an object. instead we have to use megTap
		
	}

