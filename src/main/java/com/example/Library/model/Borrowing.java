package com.example.Library.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Borrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date_of_borrowing;
    private Date due_date;
    private Date return_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "copy_id")
    private Copy copy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "borrower_id")
    private Borrower borrower;
}
