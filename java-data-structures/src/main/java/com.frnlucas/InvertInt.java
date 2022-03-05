package com.frnlucas;

import java.util.*;

public class InvertInt {
    public static void main(String[] args) {
        System.out.println(sortDesc(45));
    }
    public static int sortDesc( int num) {
        String temp = Integer.toString(num);
        int[] numbers = new int[temp.length()];
        for(int i = 0; i < temp.length(); i++){
            numbers[i] = temp.charAt(i) - '0';
        }
        String[] result = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        Arrays.sort(result, Collections.reverseOrder());
        System.out.println(Arrays.toString(result));
        String joinedString = String.join("", result);
        return Integer.parseInt(joinedString);
    }
}