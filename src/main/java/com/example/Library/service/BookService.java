package com.example.Library.service;

import com.example.Library.dto.BookDto;
import com.example.Library.mapper.BookMapper;
import com.example.Library.model.Book;
import com.example.Library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public List<Book> getByBorrower(Long borrower_id){
        return bookRepository.findByBorrowerId(borrower_id);
    }
}
