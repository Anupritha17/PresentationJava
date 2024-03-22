package com.test.staticdemo;

public class Counter {
	    // Static variable
	    static int count = 0;

	    public Counter() {
	        count++; // Incrementing the static variable in the constructor
	    }

	    public static void main(String[] args) {
	        // Creating instances of the Counter class
	        Counter obj1 = new Counter();
	        Counter obj2 = new Counter();
	        Counter obj3 = new Counter();

	        // Printing the value of the static variable
	        System.out.println("Print thenumber of instances created: " + Counter.count);
	    }
	}
