package com.kunal11.patterns.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NonConcurrentMapFactory implements MapFactory{
    @Override
    public Map<String, Object> getMap(boolean isOrdered) {
        if(isOrdered) return new TreeMap<>();
        else return new HashMap<>();
    }
}
