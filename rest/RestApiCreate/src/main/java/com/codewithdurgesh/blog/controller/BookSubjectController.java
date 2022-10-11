package com.codewithdurgesh.blog.controller;

import com.codewithdurgesh.blog.enttity.Book;
import com.codewithdurgesh.blog.service.BookSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookSubjectController {
    @Autowired
    private BookSubjectService service;

    @GetMapping("/book")
    public List<Book>getallBook(){
        return  service.bookList();
    }
    @PostMapping("/BookSubject")
     public Book saveBook(@RequestBody  Book book){
        return  service.getbook(book);
     }

}
