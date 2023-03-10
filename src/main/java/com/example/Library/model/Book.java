package com.example.Library.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private double isbn;
    private Date date;

    @OneToMany(mappedBy = "book")
    private List<Copy> copies;
}
