package com.alvarezmar.litora.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvarezmar.litora.models.Book;
import com.alvarezmar.litora.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> bookById(int id) {
        return bookRepository.findById(id);
    }

    public Book newBook(Book book) {
        return bookRepository.save(book);
    }

    public void updateBook(Book book) {
        bookRepository.save(book);
    }

    public void delete(int id) {
        bookRepository.deleteById(id);
    }
}
