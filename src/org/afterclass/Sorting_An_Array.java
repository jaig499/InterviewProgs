package org.afterclass;

public class Sorting_An_Array {

	public static void main(String[] args) {
		int temp=0;
		int[] a=new int[5];

		a[0]=10;
		a[1]=30;
		a[2]=50;
		a[3]=40;
		
		for(int i=0; i<a.length; i++) {

			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
				
			}

System.out.println(a[i]);
		}


	}

}
