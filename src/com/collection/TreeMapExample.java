package com.collection;

import java.util.TreeMap;

public class TreeMapExample {
	 public static void main(String[] args) {
	        // Creating a TreeMap with String keys and Integer values
	        TreeMap<String, Integer> treeMap = new TreeMap<>();

	        // Adding key-value pairs to the TreeMap
	        treeMap.put("John", 25);
	        treeMap.put("Martin", 30);
	        treeMap.put("Pritha", 24);

	        // Iterating over the TreeMap (entries are in sorted order of keys)
	        System.out.println("All entries:");
	        for (String name : treeMap.keySet()) {
	            System.out.println(name + ": " + treeMap.get(name));
	        }
	    }
	}

