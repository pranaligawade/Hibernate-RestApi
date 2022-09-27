package com.mapping.m212m.practice;

import javax.persistence.*;

@Entity
public class Account {
    @Id

    private int acc_Id;
    private String account_Type;
    @ManyToOne
    private User user;

    public Account() {
        super();
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Account(int acc_Id, String account_Type, User user) {
        this.acc_Id = acc_Id;
        this.account_Type = account_Type;
        this.user = user;
    }


    public int getAcc_Id() {
        return acc_Id;
    }

    public void setAcc_Id(int acc_Id) {
        this.acc_Id = acc_Id;
    }

    public String getAccount_Type() {
        return account_Type;
    }

    public void setAccount_Type(String account_Type) {
        this.account_Type = account_Type;
    }


}
