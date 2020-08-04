package org.randomPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {
	
	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<>();
		
		li.add(10);
		li.add(20);
		li.add(10);
		li.add(30);
		li.add(50);
		
		Collections.sort(li);
		
		List<Integer> li1=new ArrayList<>();
		
		li1.add(10);
		li1.add(30);
		li1.add(500);
		li1.add(10);
		li1.add(20);
		
		Collections.sort(li1);

	if(li.equals(li1)) {
		
		System.out.println("EQUAL");
	} else {
		System.out.println("NOT EQUAL");
	}
		
		
		
	}

}
