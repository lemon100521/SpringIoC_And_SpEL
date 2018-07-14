package com.dyy.springcore;

public class IdRefConfig {
    private final String barId;

    public IdRefConfig(String barId) {
        this.barId = barId;
    }

    public String getBarId() {
        return barId;
    }

    @Override
    public String toString() {
        return "IdRefConfig{" +
                "barId='" + barId + '\'' +
                '}';
    }
}
