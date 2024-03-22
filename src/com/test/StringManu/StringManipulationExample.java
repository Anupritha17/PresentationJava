package com.test.StringManu;

public class StringManipulationExample {
	    public static void main(String[] args) {
	        // Concatenation
	        String str1 = "Anu";
	        String str2 = "Pritha";
	        String concatenated = str1 + ", " + str2 + "!";
	        System.out.println("Concatenation: " + concatenated);

	        // Comparison
	        String str3 = "apple";
	        String str4 = "banana";
	        int comparisonResult = str3.compareTo(str4);
	        System.out.println("Comparison:");
	        if (comparisonResult < 0) {
	            System.out.println("str3 comes before str4");
	        } else if (comparisonResult > 0) {
	            System.out.println("str4 comes before str3");
	        } else {
	            System.out.println("str3 and str4 are equal");
	        }

	        // Substring Extraction
	        String str5 = "Sample Word";
	        String extractedSubstring = str5.substring(7); // Extract substring from index 6 to end
	        System.out.println("Substring Extraction: " + extractedSubstring);

	        // Searching
	        String str6 = "Searching Word";
	        int index = str6.indexOf("Word"); // Search for "Word" in str6
	        System.out.println("Searching:");
	        if (index != -1) {
	            System.out.println("Substring found at index " + index);
	        } else {
	            System.out.println("Substring not found");
	        }

	        // Modification
	        String str7 = "   Hello   ";
	        String trimStr = str7.trim(); // Remove leading and trailing whitespace
	        System.out.println("Modification: " + trimStr);

	        // Replacement
	        String str8 = "Hello All";
	        String replacedStr = str8.replace("All", "Everyone"); // Replace "ALL" with "Everyone"
	        System.out.println("Replacement: " + replacedStr);

	        // Conversion
	        String str9 = "123";
	        int num = Integer.parseInt(str9); // Convert string to integer
	        System.out.println("Conversion: " + num);
	    }
	}
