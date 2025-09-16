package com.test.streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertPrimitiveArrayToList {
	
	public static void main(String args[]) {
		
		int num[] = {1, 2, 3, 4, 5, 6, 7};
		//USing Arrays.stream() sequential stream with box
		List<Integer> numList = Arrays.stream(num).boxed().collect(Collectors.toList());
		
		////By using IntStream.boxed(), convert each element of the stream to an Integer ()
		
		List<Integer> mList= IntStream.of(num).boxed().collect(Collectors.toList());
		
	}

}
