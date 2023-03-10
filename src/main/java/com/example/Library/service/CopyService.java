package com.example.Library.service;

import com.example.Library.model.Book;
import com.example.Library.model.Copy;
import com.example.Library.repository.CopyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CopyService {
    @Autowired
    CopyRepository copyRepository;

    public List<Copy> getByBook(Book book){
        return copyRepository.findByBook(book);
    }
    public List<Copy> getBorrowedCopiesByBook(Long id){
        return copyRepository.findBorrowedCopiesByBookId(id);
    }
}
