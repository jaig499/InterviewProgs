package org.randomPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collec {
	
	public static void main(String[] args) {
		
		Map<Integer,String> mp=new TreeMap<Integer,String>();
		
		mp.put(40,"A");
		mp.put(10,"D");
		mp.put(5,"B");
		mp.put(50, "C");
		mp.put(20, "E");
		
	Set<Entry<Integer,String>> en =	mp.entrySet();
		
	for(Entry<Integer,String> x:en) {
		System.out.println(x);
	}
		
	}

}
