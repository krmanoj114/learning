package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test123 {
	
	public static void main(String[] args) {
		
	
	List<Integer> list = Arrays.asList(2,4,8,4,9,1);

	List<Integer> list1 = list.stream().sorted(Collections.reverseOrder()).filter(s->Collections.frequency(list, s)==1).collect(Collectors.toList());

     System.out.println(list1);
	}

}
