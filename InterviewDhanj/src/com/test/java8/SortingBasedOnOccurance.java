package com.test.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingBasedOnOccurance {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4,5,6,5,3,6,5,4,3);//output 5,5,5,6,6,4,3
		
		Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(ch->ch, Collectors.counting()));
		System.out.println(map);
		
		Comparator<Integer> byMaxOccurance = (o1,o2)-> {
			long count1= map.getOrDefault(o1, 0L);
			long count2= map.getOrDefault(o2, 0L);
			return Long.compare(count2, count1);
		};
		
	list.sort(byMaxOccurance);
	System.out.println(list);
	}

}
