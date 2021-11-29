package com.kunal11.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        System.out.println(db1.getVal());

        Database db2 = Database.getInstance();
        System.out.println(db2.getVal());
    }
}
