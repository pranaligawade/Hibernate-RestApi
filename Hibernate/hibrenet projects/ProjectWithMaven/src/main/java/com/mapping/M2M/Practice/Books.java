package com.mapping.M2M.Practice;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Books {
    @Id
    @Column(name = "book_Id")
    private  int b_Id;
    private  String name;
    private  String title;
    @Temporal(TemporalType.TIMESTAMP)
    private Date release_date;
    @ManyToMany(mappedBy = "booksList")
    private List<Authors> authorsList;
    public Books() {
    }

    public Books(int b_Id, String name, String title, Date release_date) {
        this.b_Id = b_Id;
        this.name = name;
        this.title = title;
        this.release_date = release_date;

    }

    public int getB_Id() {
        return b_Id;
    }

    public void setB_Id(int b_Id) {
        this.b_Id = b_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public List<Authors> getAuthorsList() {
        return authorsList;
    }

    public void setAuthorsList(List<Authors> authorsList) {
        this.authorsList = authorsList;
    }
}
