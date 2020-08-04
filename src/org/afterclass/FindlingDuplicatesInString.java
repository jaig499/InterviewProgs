package org.afterclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class FindlingDuplicatesInString {

	public void duplicatesInString() {

		String s = "aabcdd";
		int count = 0;
		char[] c = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j < c.length; j++) {

				if (s.charAt(i) == c[j]) {
					count = count + 1;
				}
			}
		}

		System.out.println("Duplicate set in string is: " + count);
	}

	public void arranging_arrayList() {

		List<Integer> li = new ArrayList<Integer>();

		li.add(0);
		li.add(8);
		li.add(9);
		li.add(3);
		li.add(4);
		li.add(0);
		li.add(0);

		Collections.sort(li);

		System.out.println(li);
	}

	public void empIDempName_Map() {

		Map<Integer, String> mp = new TreeMap<>();

		mp.put(10, "John");
		mp.put(80, "David");
		mp.put(30, "Adam");
		mp.put(44, "Cris Tom");
		mp.put(33, "William Smith");

		Set<Integer> si = mp.keySet();

		List<Integer> li = new ArrayList<Integer>();

		li.addAll(si);

		for (int i = li.size() - 1; i >= 0; i--) {

			System.out.println(li.get(i) + "=" + mp.get(li.get(i)));

		}

	}

	public void stringReverse() {

		String s = "welcome to css corp";
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {

			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);
	}

	public void tenNumbersFromUserAndDulipcates() {
		String s="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Start entering values: ");
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}
		String txt = Arrays.toString(a);
	
		for (int j = 0; j < a.length; j++) {

			for (int k = j + 1; k < a.length; k++) {

				if (a[j] == a[k]) {
					
					System.out.println(a[k]);
			}
		
			}
		}
		System.out.println(s);
	}
	
	public void stringCheck() {
		
		String s=null;
		
		if(s==null) {
			
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public void charCountInString() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to separate:");
		String s=sc.nextLine();
		String digits="";
		String caps="";
		String lows="";
		String special = "";
		
		char[] ch = s.toCharArray();
	
		/*for(int i=0; i<ch.length; i++) {
			
			if(ch[i]>='0' && ch[i]<= '9') {
				
				digits=digits+ch[i];
				
			} else if (ch[i]>='a'&&ch[i]<='z') {
				
				lows=lows+ch[i];
				
			} else if (ch[i]>='A'&&ch[i]<='Z') {
				
				caps=caps+ch[i];
			} else {
				
				special=special+ch[i];
			}
			
		}*/
		
		for(int j=0; j<ch.length; j++) {
			
			if(Character.isDigit(ch[j])) {
				
				digits=digits+ch[j];
				
			} else if(Character.isUpperCase(ch[j])) {
				
				caps=caps+ch[j];
				
			} else if (Character.isLowerCase(ch[j])) {
				
				lows=lows+ch[j];
				
			} else {
				special=special+ch[j];
			}
			
			
		}
	
		
		System.out.println("Digits: "+digits+" "+"Caps: "+caps+" "+"Lower: "+lows+" "+"Special: "
				+special);
		
		
	}
	public static void main(String[] args) {

		FindlingDuplicatesInString d = new FindlingDuplicatesInString();
		d.charCountInString();

	}

}
