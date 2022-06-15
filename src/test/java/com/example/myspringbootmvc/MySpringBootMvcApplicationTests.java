package com.example.myspringbootmvc;

import com.example.myspringbootmvc.controller.SpringBookController;
import com.example.myspringbootmvc.entity.Book;
import com.example.myspringbootmvc.service.BookService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MySpringBootMvcApplicationTests {

private final SpringBookController springBookController = new SpringBookController();

    @Test
    @DisplayName("Sorry, Error")
    public void testGetAllBooks() throws JsonProcessingException {


    }
}
