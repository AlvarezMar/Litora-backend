package com.alvarezmar.litora.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvarezmar.litora.models.Book;
import com.alvarezmar.litora.models.User;
import com.alvarezmar.litora.services.BookService;

import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping()
    public List<Book> allBooks() {
        return bookService.allBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> bookById(@PathVariable int id) {
        return bookService.bookById(id);
    }

    @PostMapping("/new")
    public Book newBook(@ModelAttribute Book book) {

        User user = new User(1, "", "", "", "", "", "", "", null, null);
        book.setUser(user);
        return bookService.newBook(book);
    }

}
