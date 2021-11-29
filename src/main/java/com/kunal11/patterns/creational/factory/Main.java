package com.kunal11.patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        Store store1 = new Store(new NonConcurrentMapFactory());
        Store store2 = new Store(new ConcurrentMapFactory());

        System.out.println("Store1 thread safe ? " + store1.isThreadSafe());
        System.out.println("Store2 thread safe ? " + store2.isThreadSafe());
    }
}
