package com.codewithdurgesh.blog.enttity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.NavigableMap;

@Data
@Entity(name = "SubjectJPA")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String subjects;

}
