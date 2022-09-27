package com.hiber.config;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Emp {
    @Id
    private int empId;
    private String ename;
    private String ecity;

    public Emp() {
    }

    public Emp(int empId, String ename, String ecity) {
        this.empId = empId;
        this.ename = ename;
        this.ecity = ecity;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", ename='" + ename + '\'' +
                ", ecity='" + ecity + '\'' +
                '}';
    }
}
