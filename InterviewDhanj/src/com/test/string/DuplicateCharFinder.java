package com.test.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharFinder {
	
	public void findChar(String str){
		
		Map<Character, Integer> baseMap =  new HashMap<>();
		
		char [] charArray =  str.toCharArray();
		
		for(Character ch: charArray) {
			if(baseMap.containsKey(ch)){
				baseMap.put(ch, baseMap.get(ch)+1);
			} else{
				baseMap.put(ch, 1);
			}
		}
		
		Set<Character> keys = baseMap.keySet();
		
		for(Character ch: keys){
			if(baseMap.get(ch)>1) {
				System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
			}
		}
		
	}
	
	
	public void duplicateWords(String str){
		Set<String> set = new HashSet<>();
		Set<String> duplicates = new HashSet<>();
		String [] words = str.split("\\s+");
		for(String word: words){
			if(!set.add(word)){
				duplicates.add(word);
			}
		}
		
		System.out.println("Duplicate::"+duplicates);
		//return duplicates;
	}
	
	
	public static void main(String [] args){
		DuplicateCharFinder charFinder = new DuplicateCharFinder();
		String text = "dhananjay kumar  pandey dhananjay devyansh sonaicha bhadohi dhananjay devyansh";
		
		charFinder.findChar(text);
		charFinder.duplicateWords(text);
		
	}

}
