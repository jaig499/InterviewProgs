package org.randomPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionUsingNormalFor {
	static String s1="HI";
	public static void main(String[] args) {
		
		

		String s = "Welcome. . to India Welcome. .";

		Map<String, Integer> mp = new LinkedHashMap<>();

		String[] sa = s.split(" ");

		for (int i = 0; i < sa.length; i++) {

			System.out.println(i);

			if (mp.containsKey(sa[i])) {

				Integer value = mp.get(sa[i]);

				mp.put(sa[i], value + 1);

			} else {
				
				mp.put(sa[i], 1);
				
			}

		}
		System.out.println(mp);
		System.out.println(mp.get("1"));
		System.out.println("S1 = "+s1);
	}
	
	

}
