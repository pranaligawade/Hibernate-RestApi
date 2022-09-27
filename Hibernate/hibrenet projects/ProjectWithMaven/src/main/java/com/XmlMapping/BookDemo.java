package com.XmlMapping;

public class BookDemo {
    private int id;
    private  String book_Name;
    private String book_Author;

    public BookDemo() {
    }

    public BookDemo(int id, String book_Name, String book_Author) {
        this.id = id;
        this.book_Name = book_Name;
        this.book_Author = book_Author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_Name() {
        return book_Name;
    }

    public void setBook_Name(String book_Name) {
        this.book_Name = book_Name;
    }

    public String getBook_Author() {
        return book_Author;
    }

    public void setBook_Author(String book_Author) {
        this.book_Author = book_Author;
    }
}
