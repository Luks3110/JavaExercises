package com.frnlucas;

import java.util.Arrays;

public class ClassArrays {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numero = 0;
        for(int i = 0; numero != 5; i++){
            numero = numbers[i];
            System.out.println(numero);
        }

        for( int teste : numbers){
            System.out.println(teste);
        }

        Arrays.stream(numbers).forEach(System.out::println);

    }
}
