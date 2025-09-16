package com.test.streamexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateExample {
	
	public static void main(String args[]) {
		
		String str = "dhananjay";
		String arr[]= str.split("");
		
		Map<String, Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		 
		map.forEach((k,v)-> System.out.println(k +":"+v));
		
		Map<Character, Long> map2 = str.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(c-> c, Collectors.counting()));
		
		map2.forEach((k,v)-> {
			if( v > 1) {
				System.out.println("map2::"+map2);
			}
		});
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		//Map<String, Long> map1 = names.stream().filter(x-> Collections.frequency(names, x)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<String, Long> map1 = names.stream().filter(s-> Collections.frequency(names, s)>1).collect(Collectors.groupingBy(c->c, Collectors.counting()));
		System.out.println("::"+map1);
		
		List<String> name = names.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Remove Duplicate::"+name);
		
		String name1 = names.stream().distinct().collect(Collectors.joining());
		
		System.out.println("Remove Duplicate::"+name1);
		
		
		
		//
		
	}

}
