package com.streamAPI.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class UpperandLowerCase {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Welcome","To","JaVa","Stream","TUTorial");
        //first approach
        list.stream().map(r->r.toLowerCase()).forEach(System.out::println); //It will convert list of strings into lowercase

        list.stream().map(r->r.toUpperCase()).forEach(System.out::println); //It will convert list of strings into uppercase

        //second approach

        List<String> uppercase = list.stream().map(String::toUpperCase).collect(toList());
        System.out.println(uppercase);

        List<String> lowercase = list.stream().map(String::toLowerCase).collect(toList());
        System.out.println(lowercase);
    }
}
