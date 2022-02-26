package com.example.Project.DTOS;

import java.util.UUID;

public class PersonDTO {

    private final String id;
    private String name;
    private int age;
    private String job;

    public PersonDTO(String name, int age, String job) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
        this.job = job;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
