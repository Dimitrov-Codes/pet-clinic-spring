package com.example.petclinicspring.model;


public class Specialty extends BaseEntity {
    private String desc;

    public Specialty(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
