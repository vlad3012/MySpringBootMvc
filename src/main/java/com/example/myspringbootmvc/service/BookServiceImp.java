package com.example.myspringbootmvc.service;

import com.example.myspringbootmvc.dao.BookRepository;
import com.example.myspringbootmvc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BookServiceImp implements BookService{

    @Autowired
    BookRepository daoBook;

    @Transactional
    @Override
    public Book getBook(int id) {
        return daoBook.findById(id).get();
    }
    @Transactional
    @Override
    public void removeBook(int id) {
        daoBook.deleteById(id);
    }
    @Transactional
    @Override
    public void updateBook(Book b) {
        daoBook.save(b);
    }
    @Transactional
    @Override
    public void createBook(Book b) {
        daoBook.save(b);
    }
    @Transactional
    @Override
    public Iterable<Book> getAllBooks() {
        return daoBook.findAll();
    }
}
