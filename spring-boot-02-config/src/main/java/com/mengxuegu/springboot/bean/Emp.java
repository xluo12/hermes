package com.mengxuegu.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Component
@ConfigurationProperties(prefix="emp")
public class Emp {

    private String lastName;
    private Integer age;
    private Double salary;
    private Boolean boss;
    private Date birthday;

    private Map map;
    private List list;

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Emp{" + "lastName='" + lastName + '\'' + ", age=" + age + ", " +
                "salary=" + salary + ", boss=" + boss + ", birthday=" + birthday + ", map=" + map + ", list=" + list + ", forte=" + forte + '}';
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Forte getForte() {
        return forte;
    }

    public void setForte(Forte forte) {
        this.forte = forte;
    }

    private Forte forte;
}
