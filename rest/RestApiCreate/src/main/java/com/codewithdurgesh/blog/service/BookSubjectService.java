package com.codewithdurgesh.blog.service;

import com.codewithdurgesh.blog.Dao.BookDao;
import com.codewithdurgesh.blog.Dao.SubjectDao;
import com.codewithdurgesh.blog.enttity.Book;
import com.codewithdurgesh.blog.enttity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookSubjectService {
    @Autowired
    private BookDao bookDao;
    @Autowired
    private SubjectDao subjectDao;

    public List<Book> bookList(){
        return bookDao.findAll();
    }
    public List<Subject> subjectList(Subject Id){
        return subjectDao.findAll();
    }
    public Book  getbook(Book book){
//        this.subjectDao.save(book.getSubject());//to save subject;
        return bookDao.save(book);
    }
    public  Subject  getSubjects(Subject subject){
        return  subjectDao.save(subject);
    }
}
