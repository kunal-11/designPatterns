package com.kunal11.patterns.creational.singleton;

public class Database {
    //call constructor here for eager loading null for lazy
    private static Database db = null;

    private final Double randomVal;

    private Database() {
        // init database
        randomVal = Math.random();
    }

    public static Database getInstance() {
        synchronized(Database.class) {
            if (Database.db == null) {
                db = new Database();
            }
        }
        return Database.db;
    }

    public Double getVal() {
        return randomVal;
    }
}
