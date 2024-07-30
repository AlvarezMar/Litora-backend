package com.alvarezmar.litora.controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvarezmar.litora.models.Book;
import com.alvarezmar.litora.services.BookService;
import com.alvarezmar.litora.services.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<Book> allBooks() {
        return bookService.allBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> bookById(@PathVariable UUID id) {
        return bookService.bookById(id);
    }

    @PostMapping("/new")
    public Book newBook(@RequestBody Book book) {
        return bookService.newBook(book);

    }

}
