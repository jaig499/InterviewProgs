package org.randomPractice;

public class OverRide2 extends OverRide {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		super.method1();
	}
	
	@Override
	public void method2(int i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		OverRide2 o=new OverRide2();
		o.method2(5);
	}
	
}
