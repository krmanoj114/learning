package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 7, 6, 8, 6);
		Set<Integer> dup = new HashSet<Integer>();
		Set<Integer> list1 = list.stream().filter(e -> !dup.add(e)).collect(Collectors.toSet());
		System.out.println("Remove duplicate Number:::" + list1);

		Set<Integer> duplicate = list.stream().filter(e -> Collections.frequency(list, e) >= 1)
				.collect(Collectors.toSet());
		System.out.println("List of duplicate list:::" + duplicate);

		Map<Integer, Long> frequencyCout = list.stream()
				//.filter(e -> Collections.frequency(list, e) >= 1)
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		// Map<String, Long> map = list.stream().filter(s->Collections.frequency(list,
		// s)>=1).collect(Collectors.groupingBy(ch->ch, Collectors.counting()));
		System.out.println("Frequency Count:::" + frequencyCout);

	}

}
