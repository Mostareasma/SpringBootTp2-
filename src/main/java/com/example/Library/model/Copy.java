package com.example.Library.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
public class Copy {
    //  LE CODE-BARRES, L'ÉTAT ET LE STATUT DE DISPONIBILITÉ

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double code_barres;
    private String status;
    private boolean isAvailable;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book book;
}
