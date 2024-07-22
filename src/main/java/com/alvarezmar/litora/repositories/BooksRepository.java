package com.alvarezmar.litora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvarezmar.litora.models.Book;

public interface BooksRepository extends JpaRepository<Book, Integer> {

}
