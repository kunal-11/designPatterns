package com.kunal11.patterns.creational.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentMapFactory implements MapFactory {
    @Override
    public Map<String, Object> getMap(boolean isOrdered) {
        if(isOrdered) return new ConcurrentSkipListMap<>();
        else return new ConcurrentHashMap<>();
    }
}
