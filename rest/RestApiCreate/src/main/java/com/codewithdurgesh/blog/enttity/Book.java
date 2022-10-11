package com.codewithdurgesh.blog.enttity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "BookJPA")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String discription;
    private double price;
    private int pages;

    @OneToOne(cascade = CascadeType.ALL)
    private Subject subject;
}
