package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;






public class Test37 {	
	
	public static void main(String[] args) {
		
	
	Predicate<Integer> pr =  s -> s%2 == 0;
	
	List<Integer> list = Arrays.asList(2,4,5,7,8);

	 

	//  List<Integer> listOfEvenNumber =  list.stream().filter(filter).collect(Collectors.toList()));
	  
	//  S.O.P(listOfEvenNumber);
	  
//	  
//	  boolean fileterFunction(int s) {
//	  
//	  if( s%2 == 0) {
//	    return true;
//		
//		}
//		else {
//		 return false;
//	  
//	     } 
//	  }
//	  
	  List<Integer> listOfEvenNumber =  list.parallelStream().filter(t->pr.test(t)).collect(Collectors.toList());
System.out.println(listOfEvenNumber);
	}
}
