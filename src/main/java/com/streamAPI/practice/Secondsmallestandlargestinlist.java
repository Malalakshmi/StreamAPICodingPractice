package com.streamAPI.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Secondsmallestandlargestinlist {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.stream().sorted().skip(2).findFirst().stream().forEach(System.out::println);

        list.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().stream().forEach(System.out::println);

    }
}
