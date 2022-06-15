package com.example.myspringbootmvc.controller;

import com.example.myspringbootmvc.entity.Book;
import com.example.myspringbootmvc.service.BookService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class SpringBookController {
    @Autowired
    BookService bookService;

    @ModelAttribute("book")
    public Book getBook() {
        return new Book();
    }

    @GetMapping("/getBook")
    @ResponseBody
    public String getBookInfo(@RequestParam("bookId") int id) {
        Book book = bookService.getBook(id);
        return book.toString();
    }

    @PostMapping("/createBook")
    @ResponseBody
    public String createBook(@ModelAttribute("book") Book book) {
        bookService.createBook(book);
        return "new book is created!";
    }

    @PostMapping("/bookUpdate")
    @ResponseBody
    public String updateBook(@ModelAttribute("book") Book book) {
        if (Optional.ofNullable(bookService.getBook(book.getId())).isPresent()) {
            try {
                bookService.updateBook(book);
                return "book is updated!";
            } catch (Exception e) {
                e.printStackTrace();
                return "book is not update due to an db error";
            }
        } else {
            return "book is not exist";
        }
    }

    @PostMapping("/bookRemove")
    @ResponseBody
    public String removeBook(@RequestParam("bookId") int bookid) {
        if (Optional.ofNullable(bookService.getBook(bookid)).isPresent()) {
            try {
                bookService.removeBook(bookid);
                return "book removed!";
            } catch (Exception e) {
                return "book was not removed due to service error";
            }
        } else {
            return "book is not created";
        }
    }

    @GetMapping("/showAll")
    @ResponseBody
    public String showAllBooks() throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(bookService.getAllBooks());
    }
}
