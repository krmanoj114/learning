package com.test.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCounting {

	public static void charCount(String str) {
		
		
		Map<Character, Long> map = new HashMap<Character, Long>();
		
		map = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch-> ch, Collectors.counting()));
		System.out.println("Map:::"+map);
		
		//find first non-repeatable char
		//Start
		Character result = str.chars().mapToObj(s-> (char) s).collect(Collectors.groupingBy(ch->ch, LinkedHashMap::new, Collectors.counting()))
				          .entrySet().stream().filter(entry-> entry.getValue()== 1).map(entry-> entry.getKey()).findFirst().get();
		
		System.out.println("Result:::"+result);
		//End
		
		
		
		String [] array = str.split("");
		
		Map<Object, Long> list = Arrays.stream(array).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		
	   list.entrySet().forEach(entry -> {
		   
		   System.out.println(""+entry.getKey()+"::"+entry.getValue());
	   });
	}
	
	public static void frequencyCount(List<String> list) {
		
		Map<String, Long> map = list.stream().filter(s->Collections.frequency(list, s)>=1).collect(Collectors.groupingBy(ch->ch, Collectors.counting()));
		System.out.println(map);
	}
	
	
	
	public static void main(String args[]) {
		
		String str = "dhananjay pandey";
		
		List<String> list = Arrays.asList("dhananjay","kumar","dhananjay","pandey");
		frequencyCount(list);
		
		charCount(str);
		
		
	}
	
}
