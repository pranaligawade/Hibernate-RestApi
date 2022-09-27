package com.mapping.M2M;

import javax.persistence.*;
import java.util.List;

@Entity
public class EMP_Demo {
    @Id
    private int eid;
    private String emp_Name;
    @ManyToMany
    @JoinTable(name="Emp_Project_Join",
            joinColumns = {@JoinColumn(name = "eid")},
            inverseJoinColumns = {@JoinColumn (name = "pid")}
    )
    private List<Project_Demo> project_demo;

    public EMP_Demo(int eid, String emp_Name, List<Project_Demo> project_demo) {
        this.eid = eid;
        this.emp_Name = emp_Name;
        this.project_demo = project_demo;
    }

    public EMP_Demo() {
        super();
    }

    public List<Project_Demo> getProject_demo() {
        return project_demo;
    }

    public void setProject_demo(List<Project_Demo> project_demo) {
        this.project_demo = project_demo;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

}
