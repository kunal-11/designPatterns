package com.kunal11.patterns.creational.builder;

public class ImmutableBuilder {
    private Integer x, y, z;

    public ImmutableBuilder() {

    }

    public ImmutableBuilder withX(Integer x) {
        this.x = x;
        return this;
    }

    public ImmutableBuilder withY(Integer y) {
        this.y = y;
        return this;
    }

    public ImmutableBuilder withZ(Integer z) {
        this.z = z;
        return this;
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

    public Immutable build() {
        return new Immutable(x, y, z);
    }
}
