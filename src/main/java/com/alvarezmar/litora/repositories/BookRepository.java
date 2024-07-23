package com.alvarezmar.litora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alvarezmar.litora.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
