package com.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	 public static void main(String[] args) {
	        // Creating a LinkedHashMap with String keys and Integer values
	        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

	        // Adding key-value pairs to the LinkedHashMap
	        linkedHashMap.put("John", 25);
	        linkedHashMap.put("Martin", 30);
	        linkedHashMap.put("Anu", 24);

	        // Iterating over the LinkedHashMap
	        System.out.println("All entries:");
	        for (String name : linkedHashMap.keySet()) {
	            System.out.println(name + ": " + linkedHashMap.get(name));
	        }
	    }
	}

