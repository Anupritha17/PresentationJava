package com.test.presen.encap;

public class Laptop {
	private String model;
	private int number;
	private String color;
	public Laptop(String model, int number, String color) {
		this.setModel(model);
		this.setNumber(number);
		this.setColor(color);
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
