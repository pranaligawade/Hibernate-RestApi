package com.Restdemo.RestApiCreate.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseJpa {
    @Id
     private  long id;
     private  String title;
     private String Description;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }

    public CourseJpa() {
        super();
    }

    public CourseJpa(long id, String title, String description) {
        this.id = id;
        this.title = title;
        Description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
