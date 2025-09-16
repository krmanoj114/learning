package com.test.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringToMapManipulation {
	
	public static void main(String[] args) {
		
		String str = "key1:value1;key2:value2;key3:value3";
		
		Map<String, String> keyValueMap = new HashMap<String, String>();
		
		keyValueMap = Arrays.stream(str.split(";"))
				     .map(pair->pair.split(":"))
				     .filter(keyValue-> keyValue.length==2)
				     .collect(Collectors.toMap(
				    		 keyValue -> keyValue[0],
				    		 keyValue -> keyValue[1]
				    		 ));
		keyValueMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
	}

}
