package com.streamAPI.practice;

import java.util.Arrays;
import java.util.List;

public class Countofstringstartswith {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat","mat","chat","lion");
        System.out.println(list.stream().filter(r->r.startsWith("c")).count());// it will print count of strings starts with c

        System.out.println(list.stream().filter(r->r.contains("a")).count()); //print count of string contains a

        char start='c';
        long count = list.stream().filter(r->r.startsWith(String.valueOf(start))).count();
        System.out.println(count);
    }
}
