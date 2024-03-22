package com.test.staticdemo;

public class Square {
	    // Static method to calculate the square of a number
	    public static int square(int num) {
	        return num * num;
	    }

	    public static void main(String[] args) {
	        // Calling the static method without creating an instance of the class
	        int result = Square.square(5);
	        System.out.println("Square of 5 is: " + result);
	    }
	}
