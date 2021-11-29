package com.kunal11.patterns.creational.builder;

public class Immutable {
    private final Integer x, y, z;

    public Immutable(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Immutable [x:" + x + ", y:" + y + ", z:" + z + "]";
    }
}
