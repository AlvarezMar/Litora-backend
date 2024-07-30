package com.alvarezmar.litora.models;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "books")

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private String tags;
    @Column(columnDefinition = "TEXT")
    private String synopsis;
    private String imageURL;
    private double price;
    @Column(nullable = true)
    private Double rating;
    private int stock;

    @ManyToOne
    @JsonIgnoreProperties("books")
    private User user;

}
