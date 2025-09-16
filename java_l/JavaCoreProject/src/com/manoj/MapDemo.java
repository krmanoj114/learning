package com.manoj;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "linode.com");
        map.put(2, "heroku.com");
        map.put(3, "manoj.com");
        map.put(4, "sunita.com");
        map.put(5, "ravi.com");

        //Map -> Stream -> Filter -> String
        String collect = map.entrySet().stream()
                .filter(x -> "manoj.com".equals(x.getValue()))
                .map(x -> x.getValue()).collect(Collectors.joining());
        System.out.println("collect>>> = " + collect);

        //Map -> Stream -> Filter -> MAP
        Map<Integer, String> collect1 = map.entrySet().stream()
                .filter(x -> x.getKey() == 2)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        collect1.entrySet().stream().forEach(x-> System.out.println(x.getKey()+":"+x.getValue()));

        // or like this
        Map<Integer, String> collect2 = map.entrySet().stream()
                .filter(x -> x.getKey() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


    }
}
