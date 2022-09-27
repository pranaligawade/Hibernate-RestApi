package com.mapping.m212m.practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
public class SmartPhone {
    @Id
    private  int phone_id;
    private  String company;
    @OneToMany(mappedBy = "smartPhone")
    private List<MApps> mApps;

    public SmartPhone() {
        super();
    }

    public SmartPhone(int phone_id, String company) {
        this.phone_id = phone_id;
        this.company = company;

    }

    public int getPhone_id() {
        return phone_id;
    }

    public void setPhone_id(int phone_id) {
        this.phone_id = phone_id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<MApps> getmApps() {
        return mApps;
    }

    public void setmApps(List<MApps> mApps) {
        this.mApps = mApps;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "phone_id=" + phone_id +
                ", company='" + company + '\'' +

                '}';
    }
}
