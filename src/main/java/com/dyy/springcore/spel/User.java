package com.dyy.springcore.spel;

import java.util.Date;

public class User {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 最近访问时间
     */
    private Date lastVisit;
    /**
     * 用户积分
     */
    private Integer credits;
    /**
     * 用户出生地
     */
    private PlaceOfBirth placeOfBirth;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public PlaceOfBirth getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(PlaceOfBirth placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

}
