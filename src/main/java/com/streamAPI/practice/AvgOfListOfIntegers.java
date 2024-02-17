package com.streamAPI.practice;

import java.util.*;
import java.util.stream.Collectors;

public class AvgOfListOfIntegers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        double avg=list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println(avg);
    }
}
