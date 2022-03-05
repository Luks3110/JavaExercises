package com.frnlucas;

import java.util.Set;
import java.util.HashSet;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.remove(new Ball("red"));
        balls.forEach(System.out::println);
    }
    static record Ball(String color){}
}
