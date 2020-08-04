package org.randomPractice;

public class StaticPractice {

	// We can call a static variable or static method --> inside a static method

	// We can call a static variable or static method --> inside a non-static method

	// we can't call a non-static variable or non-static method --> inside a static method

	//#1
	static void method1() {
	}

	static int a;

	public static void method2() {
		System.out.println(a);
		method1();
	}

	//-------------------------------------------------------------------------------------

	//#2
	static void methodX() {

	}

	public final static void methoddd2() {

	}

}
