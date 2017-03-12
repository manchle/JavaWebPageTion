package com.wanhao.page.bean;

import java.io.Serializable;

/**
 * Created by LiuLiHao on 2017/3/11.
 */
public class Person implements Serializable {

    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String job;

    public Person() {
    }

    public Person(Integer id, String name, Integer age, String gender, String job) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
