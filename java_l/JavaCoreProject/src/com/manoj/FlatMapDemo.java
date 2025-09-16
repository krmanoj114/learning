package com.manoj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {

        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        String[] strings = Stream.of(array).flatMap(Stream::of).toArray(String[]::new);
        Arrays.stream(strings).forEach(x-> System.out.println("x = " + x));

        Developer o1 = new Developer();
        o1.setName("mkyong");
        o1.addBook("Java 8 in Action");
        o1.addBook("Spring Boot in Action");
        o1.addBook("Effective Java (3nd Edition)");

        Developer o2 = new Developer();
        o2.setName("zilap");
        o2.addBook("Learning Python, 5th Edition");
        o2.addBook("Effective Java (3nd Edition)");

        List<Developer> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);

        list.stream()
                .map(x -> x.getBook())
                .flatMap(x -> x.stream())
                .filter(x -> !x.toLowerCase().contains("python"))
                .collect(Collectors.toSet())
                .forEach(x-> System.out.println("flatmap x = " + x));

    }
}
