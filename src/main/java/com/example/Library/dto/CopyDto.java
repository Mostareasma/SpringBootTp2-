package com.example.Library.dto;

import com.example.Library.model.Book;
import jakarta.persistence.*;


public class CopyDto {
    private Long id;
    private double code_barres;
    private String status;
    private boolean isAvailable;

    private Book book;
}
