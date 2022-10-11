package com.codewithdurgesh.blog.Dao;

import com.codewithdurgesh.blog.enttity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, Integer> {
}
