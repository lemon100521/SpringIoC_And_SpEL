package com.dyy.springcore.spel;

public class PlaceOfBirth {
    //国家
    private final String nation;
    //地区
    private final String district;

    public PlaceOfBirth(String nation, String district) {
        this.nation = nation;
        this.district = district;
    }

    public String getNation() {
        return nation;
    }

    public String getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        return "PlaceOfBirth{" +
                "nation='" + nation + '\'' +
                ", district='" + district + '\'' +
                '}';
    }
}
