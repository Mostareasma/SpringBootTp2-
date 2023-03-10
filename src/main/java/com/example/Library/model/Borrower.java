package com.example.Library.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Borrower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "borrower")
    private List<Borrowing> borrowings;

}
