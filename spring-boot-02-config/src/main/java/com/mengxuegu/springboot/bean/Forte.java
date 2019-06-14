package com.mengxuegu.springboot.bean;

public class Forte {

    private String name;
    private Integer time;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Forte{" + "name='" + name + '\'' + ", time=" + time + '}';
    }

    public Integer getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
