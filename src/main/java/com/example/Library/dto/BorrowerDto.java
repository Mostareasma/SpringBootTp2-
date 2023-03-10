package com.example.Library.dto;

import com.example.Library.model.Borrowing;
import jakarta.persistence.*;

import java.util.List;

public class BorrowerDto {

    private String name;
    private List<Borrowing> borrowings;

}
