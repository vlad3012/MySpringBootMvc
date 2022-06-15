package com.example.myspringbootmvc.service;

import com.example.myspringbootmvc.entity.Book;

public interface BookService {
    Book getBook(int id);

    void removeBook(int id);

    void updateBook(Book b);

    void createBook(Book b);

    Iterable<Book> getAllBooks();
}
