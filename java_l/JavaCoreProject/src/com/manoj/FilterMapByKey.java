package com.manoj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapByKey {
    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(11, "Apple");
        hmap.put(22, "Orange");
        hmap.put(33, "Kiwi");
        hmap.put(44, "Banana");

        Map<Integer, String> result = hmap.entrySet()
                .stream()
                .filter(map -> map.getKey().intValue() <= 22)
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("Result: " + result);

        //Map key value to list
        List<Map.Entry<Integer, String>> collect = hmap.entrySet()
                .stream()
                .filter(map -> map.getKey().intValue() <= 22)
                .collect(Collectors.toList());

        System.out.println("collect: " + collect);
    }
}
