package com.designpattern.factory;

public abstract class Company {
    public abstract String getName();
    public abstract String getAddress();

    @Override
    public String toString() {
        return "Company [name=" + getName() + ", address=" + getAddress() + "]";
    }
}
