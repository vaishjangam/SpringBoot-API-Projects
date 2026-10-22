package com.acciojob.springProject;

public class PatientInfo {
    private String name;
    private  int age;
    private long id;
    public PatientInfo(long id, String name, int age ){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public long getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

}
