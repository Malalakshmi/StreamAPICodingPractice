package com.streamAPI.practice;
import java.util.Arrays;
import java.util.List;

public class MaxMinValueinList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(51,74,98,12,54,-64,1,58,56);
        long maxvalue = list.stream().mapToInt(Integer::intValue).max().orElseThrow();
        System.out.println(maxvalue);

        long minvalue = list.stream().mapToInt(Integer::intValue).min().orElseThrow();
        System.out.println(minvalue);
    }
}
