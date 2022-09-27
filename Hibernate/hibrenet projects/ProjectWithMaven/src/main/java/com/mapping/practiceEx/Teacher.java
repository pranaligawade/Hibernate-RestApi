package com.mapping.practiceEx;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Teacher {
    @Id
    private int T_id;
    private String Wname;
    @OneToOne
    @JoinColumn(name = "student_ans")// renaming table mapped id column
    private Student s;

    public Teacher() {
    }

    public Teacher(int t_id, String name, Student s) {
        T_id = t_id;
        this.Wname = name;
        this.s = s;
    }

    public int getT_id() {
        return T_id;
    }

    public void setT_id(int t_id) {
        T_id = t_id;
    }

    public String getWname() {
        return Wname;
    }

    public void setWName(String name) {
        this.Wname = name;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }
}
