package com.system.StudentData.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {

    @Column(nullable=false)
    private String name;

    @Column(nullable=false, unique=true)
    private String student_id;

    @Column(nullable=false)
    private int age;

    @Id
    private String username;

    @Column(nullable=false, unique=true)
    private String password;

    public Student(String name, String student_id, int age, String username, String password) {
        this.name = name;
        this.student_id = student_id;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
