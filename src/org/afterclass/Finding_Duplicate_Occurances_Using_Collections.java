package org.afterclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Finding_Duplicate_Occurances_Using_Collections {
	
	public static void main(String[] args) throws IOException {
		
		//just config file example
		FileInputStream fin=new FileInputStream("config.properties");
		Properties p=new Properties();
		p.load(fin);
		String un= p.getProperty("password");
		System.out.println(un);
		//---------------------------
		
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		String[] split = s.split(" ");
		
		LinkedHashMap<String,Integer> mp=new LinkedHashMap<>();
		
		for(String x : split) {
			
			if(mp.containsKey(x)) {
				
				int value = mp.get(x);
				mp.put(x, value+1);
				
			} else {
				mp.put(x, 1);
			}
		}
		System.out.println(mp);
	}
}
