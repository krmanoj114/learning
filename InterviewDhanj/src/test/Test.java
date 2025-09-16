package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	
	
	
	public void letterOccurance(String str) {
		
		 Map<Character, Integer> map = new HashMap<Character, Integer>();
		//String str1 [] = str.charAt(index)
		 char array [] = str.toCharArray();
		 
		for(Character ch : array) {
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		StringBuffer sb = new StringBuffer();
		for(Character ch: keys) {
			if(map.get(ch) != null) {
				sb.append(ch+""+map.get(ch));
				System.out.println("Duplicate charactor:::"+ch+"---"+map.get(ch));
			}
		}
		
		System.out.println("final::::::"+sb);
		
	}
	
	public void duplicateCount(String str) {
		
		Map<Character, Long> map = new HashMap<Character, Long>();
		
		 map =  str.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		 System.out.println("Map::"+map);
		// map.forEach(k, V ) -> System.out.println(k +""+v);
		// map.forEach(k,v) -> ;
	}
	public static void main(String args[]) {
		String str  = "baabc";

		Test t = new Test();
		t.letterOccurance(str);
		t.duplicateCount(str);
		
		//str.chars().
	}

}
