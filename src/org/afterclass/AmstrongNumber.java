package org.afterclass;

import java.util.Scanner;

public class AmstrongNumber {

	public void findling_Given_amstrongNumber(){

		System.out.println("Enter the value: ");
		Scanner sc=new Scanner(System.in);

		int given = sc.nextInt();

		int num=given;
		int i,j,k=0;

		while(num>0) {

			i=num%10;
			j=(i*i*i*i);
			k=k+j;
			num=num/10;
		}
		if(given==k) {
			System.out.println("It is Amstrong Number "+k);
		} else {
			System.out.println("Not an Amstrong Number");
		}

	}

	public void amstrogNumberbetween1to1000() {
		int j,k=0;

		for(int i=1; i<=1000; i++) {
			int x=i;

			while(x>0) {

				j=x%10;
				k=k+(j*j*j);
				x=x/10;
			}
			if(k==i) {
				System.out.println(k);
			}
			k=0;
		}



	}



	public static void main(String[] args) {
		AmstrongNumber a=new AmstrongNumber();
		a.amstrogNumberbetween1to1000();

	}
}