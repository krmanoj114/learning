package com.test.string;

import java.security.KeyStore.Entry;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class SubstringsOfStringMain {
	
	public static void main(String args[]) {
		
		String str = "aabc";
		HashSet<String> set = new HashSet<>();
		System.out.println("All Substring of aabc::::");
		for(int i=0; i<=str.length(); i++) {
			for(int j=i+1; j<=str.length(); j++) {
				System.out.println(str.substring(i, j));
				set.add(str.substring(i, j));
				
			}
		}
		
		System.out.println("HashSet to remove dublicate element::"+set);
		
		Map<Character, Integer> countChar =  new LinkedHashMap<>();
		for(int a=0; a<=str.length()-1; a++) {
			Character ch =  str.charAt(a);
			System.out.println("Char:::"+ch);
			
			if(!countChar.containsKey(ch)) {
				countChar.put(ch, 1);
			}
			else {
				countChar.put(ch, countChar.get(ch)+1);
			}
			
		}
		
		for(java.util.Map.Entry<Character, Integer> e: countChar.entrySet()) {
			if(e.getValue() == 1) {
				System.out.println("FirstNonRepeatedChar::::"+e.getKey());
			}
			
			
		}

		
	}
	
	
}
