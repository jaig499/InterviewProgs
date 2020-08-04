package org.afterclass;

import java.util.Scanner;

public class OddOrEven {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int given=sc.nextInt();
		
		if(given%2!=0) {
			System.out.println("it is odd number");
		} else {
			System.out.println("it is even number");
		}
		
		
	}

}
