package com.kunal11.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Immutable obj = new ImmutableBuilder().withX(1).withY(2).withZ(3).build();
        System.out.println(obj);
    }
}
