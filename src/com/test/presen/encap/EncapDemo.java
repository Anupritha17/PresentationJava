package com.test.presen.encap;

public class EncapDemo {
	public static void main(String[] args) {
		Laptop lapDescription=new Laptop("HP", 12345, "Black");
		System.out.println(lapDescription.getColor());
		System.out.println(lapDescription.getModel());
		System.out.println(lapDescription.getNumber());
	}
}
