package com.hiber.config;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Entity(name = "Emp_Address")
public class EmpAddress {
    @Id
    @Column(name = "EmpId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    @Column(name = "Name")
    private String name;
    @Column(length = 90, name = "CITY")
    private String city;
    @Column(length = 200, name = "Street")
    private String street;
    @Transient
    private int x;

    @Column(name = "IS_OPEN")
    private boolean isopen;
    @Column(name = "Added_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Lob
    @Column(name = "Image")
    private byte[] img;

    public EmpAddress() {
    }

    public EmpAddress(int empId, String name, String city, String street, int x, byte[] img, boolean isopen, Date addedDate) {
        this.empId = empId;
        this.name = name;
        this.city = city;
        this.street = street;
        this.x = x;
        this.img = img;
        this.isopen = isopen;
        this.addedDate = addedDate;
    }

    @Override
    public String toString() {
        return "EmpAddress{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", x=" + x +
                ", img=" + Arrays.toString(img) +
                ", isopen=" + isopen +
                ", addedDate=" + addedDate +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public boolean isIsopen() {
        return isopen;
    }

    public void setIsopen(boolean isopen) {
        this.isopen = isopen;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }
}
