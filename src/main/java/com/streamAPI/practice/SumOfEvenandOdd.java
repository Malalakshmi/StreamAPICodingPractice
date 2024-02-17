package com.streamAPI.practice;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenandOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        int sumofeven = list.stream().filter(r->r%2==0).mapToInt(Integer::intValue).sum();
        System.out.println("sum of even "+sumofeven);

        int sumofodd = list.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();
        System.out.println("sum of odd "+sumofodd);

        int sumofallvalue = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum of all value "+sumofallvalue);
    }
}
