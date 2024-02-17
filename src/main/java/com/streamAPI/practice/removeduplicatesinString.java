package com.streamAPI.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeduplicatesinString {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("cat","rat","cat","rat");
        list.stream().distinct().forEach(System.out::println);


        List<String> ls=list.stream().distinct().collect(Collectors.toList());
        System.out.println(ls);

    }
}
