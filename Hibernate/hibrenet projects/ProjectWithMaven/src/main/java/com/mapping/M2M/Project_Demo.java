package com.mapping.M2M;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Project_Demo {
    @Id
    private int pid;
    private String project_Name;
    @ManyToMany(mappedBy = "project_demo")
    private List<EMP_Demo> emp_demo;

    public Project_Demo(int pid, String project_Name, List<EMP_Demo> emp_demo) {
        this.pid = pid;
        this.project_Name = project_Name;
        this.emp_demo = emp_demo;
    }

    public Project_Demo() {
        super();
    }

    public List<EMP_Demo> getEmp_demo() {
        return emp_demo;
    }

    public void setEmp_demo(List<EMP_Demo> emp_demo) {
        this.emp_demo = emp_demo;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProject_Name() {
        return project_Name;
    }

    public void setProject_Name(String project_Name) {
        this.project_Name = project_Name;
    }


}
