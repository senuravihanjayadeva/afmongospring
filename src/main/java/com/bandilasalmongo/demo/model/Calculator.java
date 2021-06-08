package com.bandilasalmongo.demo.model;

public class Calculator {

    private String categoryID;

    private Integer duration;

    public Calculator() {
    }

    public Calculator(String categoryID, Integer duration) {
        this.categoryID = categoryID;
        this.duration = duration;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
