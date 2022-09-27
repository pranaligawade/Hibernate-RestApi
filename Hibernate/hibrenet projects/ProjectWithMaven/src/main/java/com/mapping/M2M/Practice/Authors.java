package com.mapping.M2M.Practice;

import javax.persistence.*;
import java.util.List;

@Entity
public class Authors {
     @Id
      private  int a_Id;
      private  String name;
      private  String  gender;
      @ManyToMany
      @JoinTable( name = "Author_Book",
      joinColumns = {
              @JoinColumn(name = "Book_Id")},
      inverseJoinColumns = { @JoinColumn(name = "Author_Id")})
      private List<Books> booksList;

    public Authors() {
    }

    public Authors(int a_Id, String name, String gender) {
        this.a_Id = a_Id;
        this.name = name;
        this.gender = gender;

    }

    public int getA_Id() {
        return a_Id;
    }

    public void setA_Id(int a_Id) {
        this.a_Id = a_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Books> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Books> booksList) {
        this.booksList = booksList;
    }
}
