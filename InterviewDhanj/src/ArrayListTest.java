import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;


public class ArrayListTest {
	
	public static void main(String... args){
		
		Collection<String> list = new ArrayList<>();
		
		list.add("dhananjay");
		list.add("devyansh");
		list.add("shreya");
		list.add("abc");
		
		list.remove("dhananjay");
		System.out.println(list);
		
		for(String str: list){
			if(str == "abc"){
				
				list.remove("abc");
				System.out.println(list);
				
			}
		}
		
		//System.out.println("Args:"+args.toString());
	}
	
	
	

}
