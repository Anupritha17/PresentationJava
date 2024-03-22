package com.test.constructor;

public class ConOverload {
	String name;
	int id;
	
	ConOverload(){
    System.out.println("Default values can print here ");
	}
	
	ConOverload(String n,int i){
		this.name=n;
		this.id=i;
	}
	
	// Copy constructor
	ConOverload(ConOverload other) {
        this.name = other.name;
        this.id = other.id;
    }
	
		public  static void main(String[] args) {
			ConOverload conv=new ConOverload();
			System.out.println("NAME :"+conv.name+" id: "+conv.id);
			ConOverload con=new ConOverload("LYAN", 20101);
			System.out.println("Parameterized Constructor value");
			System.out.println("NAME: "+con.name+" id: "+con.id);
			
			ConOverload copycon=new ConOverload("SIRAN", 21201);//copy is created using a parameterized constructor that initializes x and y
			System.out.println("NAME: "+copycon.name+" id: "+copycon.id);// Creating an object with parameters
			ConOverload copyconcalled = new ConOverload(copycon); // Copy constructor called
			System.out.println("NAME: "+copyconcalled.name+" id: "+copyconcalled.id);
		}
		
	
	

}
