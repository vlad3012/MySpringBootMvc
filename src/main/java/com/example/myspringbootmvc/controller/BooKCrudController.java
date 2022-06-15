package com.example.myspringbootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

@Controller
public class BooKCrudController {

    @GetMapping("/")
    public String init() {
        return "index";
    }
    @GetMapping("/getOption")
    public String selectOption(@RequestParam("option") int option, HttpServletResponse servletResponse) {
        switch (option) {
            case 1: {
                return "bookInformation";
            }
            case 2: {
                return ("bookCreation");
            }
            case 3: {
                return "bookUpdate";
            }
            case 4: {
                return "redirect:/showAll";
            }
            case 5: {
                return "removeBook";
            }
        }
        servletResponse.setStatus(HttpServletResponse.SC_NOT_FOUND);
        return "invalidPage";
    }
}
