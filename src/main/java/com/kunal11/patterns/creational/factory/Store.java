package com.kunal11.patterns.creational.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class Store {
    private final Map<String, Object> store;

    public Store(MapFactory factory) {
        this.store = factory.getMap(false);
    }

    public boolean isThreadSafe() {
        return (store instanceof ConcurrentMap);
    }
}
