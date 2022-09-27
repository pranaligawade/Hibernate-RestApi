package com.mapping.practiceEx;

import javax.persistence.*;

@Entity(name = "Student_OTO")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int s_id;
    private String name;
        @OneToOne(mappedBy ="s" )

    private Teacher teacher;

    public Student() {
    }

    public Student(int s_id, String name) {
        this.s_id = s_id;
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
