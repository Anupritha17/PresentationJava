package com.test.presentation.Inher;

public class InheritenceTest extends Mobile {
	private String launchYear="2024";
	public static void main(String[] args) {
		InheritenceTest mob=new InheritenceTest();
		mob.mobile();
		System.out.println("BrandName: "+mob.brand+"ModelName: "+mob.model+"Price:"+mob.price);
		System.out.println("launchYear:"+mob.launchYear);
	}
	@Override
	public void mobile() {
		System.out.println("The brand name:"+brand);
		System.out.println("The model name:"+model);
		System.out.println("The price of moblie"+price);
	}
}
