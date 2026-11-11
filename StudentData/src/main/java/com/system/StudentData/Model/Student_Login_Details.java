package com.system.StudentData.Model;

import jakarta.persistence.*;

@Entity
public class Student_Login_Details {

    @Id
    @Column(nullable = false)
    private String user_name;

    @Column(nullable = false, unique = true)
    private String password;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}