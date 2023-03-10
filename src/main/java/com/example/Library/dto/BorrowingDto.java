package com.example.Library.dto;

import com.example.Library.model.Borrower;
import com.example.Library.model.Copy;
import jakarta.persistence.*;

import java.util.Date;

public class BorrowingDto {

    private Long id;
    private Date date_of_borrowing;
    private Date due_date;
    private Date return_date;

    private Copy copy;
    private Borrower borrower;
}
