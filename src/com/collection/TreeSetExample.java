package com.collection;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
        // Creating a TreeSet of Doubles
        TreeSet<Double> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(3.14);
        treeSet.add(2.71);
        treeSet.add(1.618);

        // Iterating over the TreeSet (elements are in sorted order)
        System.out.println("All elements:");
        for (Double num : treeSet) {
            System.out.println(num);
        }
    }
}

