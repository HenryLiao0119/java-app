package com.springboot.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/")
    public List<Book> getAllBooks() {
        return Arrays.asList(new Book(1, "python book", "Henry Liao"));
    }
}
