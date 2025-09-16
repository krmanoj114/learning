package com.manoj;

import java.util.stream.Collectors;

public class StringDemo {
    public static void main(String[] args) {
        String str = "=".repeat(20);
        System.out.println(str);
        System.out.println("=".repeat(40));
         String line = "        This method returns a stream of strings, which is a collection of all substrings split by lines.            ";
         line.lines()
                 .map(w->w.strip())
                 .collect(Collectors.toList()).forEach(w -> System.out.println(w));
        System.out.println("=".repeat(line.length()));
    }
}
