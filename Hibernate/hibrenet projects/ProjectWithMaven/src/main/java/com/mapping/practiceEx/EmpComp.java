package com.mapping.practiceEx;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EmpComp {
    @Id
    private  int cmpId;
    private  String Company_name;
    @OneToOne
    @JoinColumn(name = "EmpData")
private Employee employee;

    public EmpComp() {
        super();
    }

    public EmpComp(int cmpId, String company_name, Employee employee) {
        this.cmpId = cmpId;
        Company_name = company_name;
        this.employee = employee;
    }

    public int getCmpId() {
        return cmpId;
    }

    public void setCmpId(int cmpId) {
        this.cmpId = cmpId;
    }

    public String getCompany_name() {
        return Company_name;
    }

    public void setCompany_name(String company_name) {
        Company_name = company_name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
