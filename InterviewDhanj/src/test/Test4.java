package test;

import java.util.HashMap;
import java.util.Map;


public class Test4 {
	
	public static void main(String args[]) {
	String str = "dhananjay";
	
//	Map<Character, Long> countDuplicate = str.chars().mapToObj((ch -> (char) ch)).collect(Collectors.groupingBy(ch-> ch, Collectors.counting()));
//	
//	   countDuplicate.forEach((key, value)-> {
//		   System.out.println(""+key+":"+value);
//	   });
	
	char [] ch = str.toCharArray();
	
	Map<Character, Integer>  map = new HashMap<Character, Integer>();
	  // int count;
	     for(Character c: ch) {
	    	 if(map.containsKey(c)) {
	    		 map.put(c, map.get(c)+1);
	    	 }
	    	 else {
	    		 map.put(c, 1);
	    	 }
	    	 
	    	
	     }
	     map.forEach((k, v)->{
	    	 System.out.println(k+"::"+v);
	     });
	
	}

}
