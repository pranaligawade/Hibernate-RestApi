package com.Restdemo.RestApiCreate.Entity;

public class Employee {
    private int empid;
    private String emp_name;
    private String emp_address;

    public Employee(int empid, String emp_name, String emp_address) {
        this.empid = empid;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", emp_name='" + emp_name + '\'' +
                ", emp_address='" + emp_address + '\'' +
                '}';
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }


}
