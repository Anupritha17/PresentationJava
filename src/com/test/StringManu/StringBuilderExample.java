package com.test.StringManu;

public class StringBuilderExample {
	    public static void main(String[] args) {
	        // Create a StringBuilder object
	        StringBuilder builder = new StringBuilder();

	        // Append strings
	        builder.append("Friday");
	        builder.append(" ");
	        builder.append("March");

	        // Insert at specific index
	        builder.insert(7, "22 "); 

	        // Replace substring
	        builder.replace(10, 15, "MARCH"); 

	        // Delete substring
	        builder.delete(0, 6);

	        // Reverse the string
	        builder.reverse();

	        // Convert StringBuilder to String
	        String result = builder.toString();

	        // Print the result
	        System.out.println("Result: " + result);
	    }
	}


