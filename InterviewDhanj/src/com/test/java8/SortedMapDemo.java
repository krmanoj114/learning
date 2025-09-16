package com.test.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortedMapDemo {
	
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("four", 4);
		map.put("three", 3);
		map.put("six", 6);
	//	map.put(null, 3);
		map.put("eight", 8);
		map.put("two", 2);
		//System.out.println("MAp::::::"+map);
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());
		
//		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				// TODO Auto-generated method stub
//				return o1.getKey().compareTo(o2.getKey());
//			}
//			
//		});
		
//		Collections.sort(list, (o1,o2)-> o1.getKey().compareTo(o2.getKey()));
//		
//		System.out.println(list);
		
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	}

}
