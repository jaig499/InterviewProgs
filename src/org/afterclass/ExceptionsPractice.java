package org.afterclass;

public class ExceptionsPractice {
	
	public static void main(String[] args) {
		
		
		try {
			System.out.println(10/0);
			System.out.println("hi..");
		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println();
			System.out.println("done");
		}
		
		
	}

}
