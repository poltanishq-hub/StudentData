package com.system.StudentData.Model;

import jakarta.persistence.*;

enum term{
    FALL,
    WINTER,
    YEAR_LONG,
    SUMMER
}

enum campus{
    ST_GEORGE,
    MISSISSAUGA,
    SCARBOROUGH
}


@Entity
public class Courses {

    @Id
    @Column(nullable=false)
    private String course_code;

    @Column(nullable=false)
    private String course_name;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private term course_term;

    @Column(nullable=false)
    private String course_department;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false,  unique=true)
    private campus course_campus;


    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public term getCourse_term() {
        return course_term;
    }

    public void setCourse_term(term course_term) {
        this.course_term = course_term;
    }

    public String getCourse_department() {
        return course_department;
    }

    public void setCourse_department(String course_department) {
        this.course_department = course_department;
    }

    public campus getCourse_campus() {
        return course_campus;
    }

    public void setCourse_campus(campus course_campus) {
        this.course_campus = course_campus;
    }
}
