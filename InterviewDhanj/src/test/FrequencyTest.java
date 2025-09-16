package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequencyTest {

	public static void main(String[] args) {
          //Input
		List<String> list = Arrays.asList("dhananjay", "pandey");
		//output [9-dhananjay, 6-pandey]

		List<String> list1 = new ArrayList<String>();
		list.stream().forEach(str -> {
			System.out.println(str.length() + "-" + str);
			list1.add(str.length() + "-" + str);
		});

		System.out.println(list1);
	}

}
