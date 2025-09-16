package com.test.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstNonRepeatableChar {
	
	public static void main(String[] args) {
		
		String str = "dhananjay";
		
		String array[] = str.split("");
		//Frequency count
		Map<String, Long> map =Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println("Frequency Count:::"+map);
		
		//Duplicate element		
		
		List<String> duplicateChar =  Arrays.stream(str.split(""))
				                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				                            .entrySet()
				                            .stream()
				                            .filter(x-> x.getValue() > 1)
				                            .map(Map.Entry::getKey)
				                            .collect(Collectors.toList());
		                System.out.println("Duplicate Element::::"+duplicateChar);
		
		//Non duplicate elements
		
		List<String> nonDuplicateChar =  Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x-> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
               System.out.println("Non Duplicate Element::::"+nonDuplicateChar);
               
        //First Non repeate element in String
               
         String firstNonRepeatableElement =  Arrays.stream(str.split(""))
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                     .entrySet()
                     .stream()
                     .filter(x->x.getValue() == 1)
                     .map(Map.Entry::getKey)
                     .findFirst().get();
         
         System.out.println("First non repeatable char:::"+firstNonRepeatableElement);
         
       //First repeatable element in String
         
         String firstRepeatableElement =  Arrays.stream(str.split(""))
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                     .entrySet()
                     .stream()
                     .filter(x->x.getValue() > 1)
                     .map(Map.Entry::getKey)
                     .findFirst().get();
         
         System.out.println("First repeatable char:::"+firstRepeatableElement);
               
         //Second highest element in array
         int numbers[] = {5,9,11,2,8,21,1};
         
//         List<Integer> sortedList = Arrays.stream(numbers)
//        		 .boxed()
//        		 .sorted(Collections.reverseOrder())
//        		 .skip(1)
//        		 .collect(Collectors.toList());
         
         Integer secondHighestNumber = Arrays.stream(numbers)
        		 .boxed()
        		 .sorted(Collections.reverseOrder())
        		 .skip(1)
        		 .findFirst().get();
        		 
         System.out.println("secondHighestNumber:::"+secondHighestNumber);
         
         //Longest String in given list
         
         List<String> list = Arrays.asList("dhananjay","kumar","devyansh_pandey");
         
         String longestString = list.stream().reduce((a,b)-> a.length()>b.length() ? a: b).get(); 
         System.out.println("Longest String:::"+longestString);
         
      // find number whose start with 1
         
         int numbers1[] = {5,9,11,2,8,21,1};
         
         List<String> stringList=  Arrays.stream(numbers1).boxed().map(s-> s+"")
                                  .filter(s->s.startsWith("1")).collect(Collectors.toList());
         
         System.out.println("stringList:::"+stringList);
         
         //String.join method
         
         List<String> nos = Arrays.asList("1","4","6","7");
         
         String result = String.join("-", nos);
         
         System.out.println("Result::"+result);
         
         //limit and skip in java
         
         
         IntStream.rangeClosed(1, 10).skip(1).limit(8).forEach(System.out::println);
         
         
         
         
         
         
         
         
         
         
         
         
         
         
                     


	}

}
