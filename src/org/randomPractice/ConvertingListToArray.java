package org.randomPractice;

import java.util.ArrayList;
import java.util.List;

public class ConvertingListToArray {
	
	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<>();
		
		li.add(50);
		li.add(60);
		li.add(80);
		li.add(100);
		
	int[] a = new int[li.size()];
		
		for(int j=0; j<li.size(); j++) {
			
			a[j]=li.get(j);
			
		}
		
		for(int k=0; k<a.length; k++) {
			
			System.out.println(a[k]);
		}
		
	}

}
