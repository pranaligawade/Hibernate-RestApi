package com.mapping.m212m.practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name ="mobile_app")
public class MApps {
    @Id
    private  int appid;
    private  String appName;
    @ManyToOne
    private SmartPhone smartPhone;

    public MApps(int appid, String appName) {
        this.appid = appid;
        this.appName = appName;
    }

    public int getAppid() {
        return appid;
    }

    public MApps() {
        super();
    }

    public void setAppid(int appid) {
        this.appid = appid;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public SmartPhone getSmartPhone() {
        return smartPhone;
    }

    public void setSmartPhone(SmartPhone smartPhone) {
        this.smartPhone = smartPhone;
    }

    @Override
    public String toString() {
        return "MApps{" +
                "appid=" + appid +
                ", appName='" + appName + '\'' +
                ", smartPhone=" + smartPhone +
                '}';
    }
}
