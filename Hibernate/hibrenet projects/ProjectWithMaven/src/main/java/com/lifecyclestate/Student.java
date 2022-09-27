package com.lifecyclestate;

import com.hiber.config.Certificate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "State_Student")
public class Student {
    @Id
    private int studId;
    private String name;
    private String city;
     private Certificate certificate;

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Student(int studId, String name, String city) {
        this.studId = studId;
        this.name = name;
        this.city = city;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
