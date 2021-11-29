package com.kunal11.patterns.creational.factory;

import java.util.Map;

public interface MapFactory {
    Map<String, Object> getMap(boolean isOrdered);
}
