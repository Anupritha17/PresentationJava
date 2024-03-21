package com.test.presen;

public class AbstractionDemo {
	public static void main(String[] args) {
		Employee salary=new Contractor("Contractor",10,10);
		System.out.println("Employee salary per day:" + salary.calculateSalary());
	}

}
