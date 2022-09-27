package com.mapping.m212m.practice;

import javax.persistence.*;
import java.util.List;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   int user_id;
    private  String name;
    @OneToMany(mappedBy = "user")
    private List<Account> accounts;

    public User() {
        super();
    }

    public User(int user_id, String name, List<Account> accounts) {
        this.user_id = user_id;
        this.name = name;
        this.accounts = accounts;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

}
