package com.mapping.practiceEx;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "Employee")
public class Employee {
    @Id
    private int empid;
    private String name;
    private String city;
    @OneToOne(mappedBy = "employee")
 private  EmpComp empComp;

    public EmpComp getEmpComp() {
        return empComp;
    }

    public void setEmpComp(EmpComp empComp) {
        this.empComp = empComp;
    }

    public Employee() {
        super();
    }

    public Employee(int empid, String name, String city) {
        this.empid = empid;
        this.name = name;
        this.city = city;

    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
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