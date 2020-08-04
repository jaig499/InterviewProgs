package org.afterclass;

import java.util.Scanner;

public class SwapOfTwoNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:- ");
		int x = sc.nextInt();
		System.out.println("Enter value of b:- ");
		int y = sc.nextInt();
		
		//int temp=0;
		//With using 3rd variabe
		/*temp=a;
		a=b;
		b=temp;*/
		
		//with out using 3rd variable
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x+" "+y);
		String s="he,xa,wa,re";
		
		String replace = s.replace("," , "");
		System.out.println(replace);
		
	}

}
