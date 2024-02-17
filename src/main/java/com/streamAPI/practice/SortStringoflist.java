package com.streamAPI.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringoflist {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat","apple","banana","dog");
        List<String> sortedlist = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlist);

        List<String> sortedlist1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedlist1);
    }
}
