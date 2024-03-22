package com.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	    public static void main(String[] args) {
	        // Creating a LinkedHashSet of Integers
	        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

	        // Adding elements to the LinkedHashSet
	        linkedHashSet.add(10);
	        linkedHashSet.add(20);
	        linkedHashSet.add(30);

	        // Iterating over the LinkedHashSet
	        System.out.println("All elements:");
	        for (Integer num : linkedHashSet) {
	            System.out.println(num);
	        }
	    }
	}
